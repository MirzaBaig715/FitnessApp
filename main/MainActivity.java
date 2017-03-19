package com.fitnessapp2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Toolbar tool;
    String[] titles ;
    int[] home_image_icons = {R.drawable.abs_icon,R.drawable.bicep_icon,R.drawable.chest_icon,
            R.drawable.shoulder_icon,R.drawable.tricep_icon,R.drawable.back_icon};
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tool = (Toolbar) findViewById(R.id.app_bar);
        tool.setTitleTextColor(getResources().getColor(R.color.whiteColor));
        setSupportActionBar(tool);
        Resources res = getResources();
        titles = res.getStringArray(R.array.Titles);
//        desctiptions = res.getStringArray(R.array.Descriptions);
        listview = (ListView) findViewById(R.id.list);
        adapterClass adapter = new adapterClass(this,titles,home_image_icons );

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Abs.class);
                intent.putExtra("position",String.valueOf(position));
                startActivity(intent);
            }
        });
    }


    class adapterClass extends ArrayAdapter<String> {//ListView will call Adapter and Adapter will call getView() for each row/item.
        String []titleArray;
        int[] images;
        Context context;

        public adapterClass(Context c,String[] t,int[] img) { //t=title
            super(c, R.layout.single_row, R.id.textView2, t);//here you need to create structure and populate it with data
             this.context = c;
            this.titleArray = t;
            this.images = img;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {//it will be called each time the row is going to be displayed to the user.
            View singleRow = convertView;
            ViewHolder holder = null;

            if (singleRow==null){ //Optimized by 150%.ConvertView first time is null.It is the process "View Recycle"
                LayoutInflater l = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                singleRow = l.inflate(R.layout.single_row,parent,false);//singleRow has the reference of RelativeLayout in single_row.XML
                holder = new ViewHolder(singleRow);
                singleRow.setTag(holder);
            }
            else{                 //for Recylcing the views.

                holder = (ViewHolder) singleRow.getTag();
            }

            holder.title.setText(titleArray[position]);
            holder.img.setImageResource(images[position]);
            return singleRow;
        }


    }

    class ViewHolder{

        ImageView img;
        TextView title;
        ViewHolder(View view){

            title = (TextView) view.findViewById(R.id.textView2);
            img = (ImageView) view.findViewById(R.id.image);
        }

    }
}
