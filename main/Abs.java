package com.fitnessapp2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mirza Musharaf Baig on 3/19/2017.
 */

public class Abs extends AppCompatActivity {
    TextView txt,heading_text;
    ImageView img;
//    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abs_layout);
        img = (ImageView) findViewById(R.id.img);
        txt = (TextView) findViewById(R.id.text);
        heading_text = (TextView) findViewById(R.id.heading_text);
//        btn= (Button) findViewById(R.id.btn);
        Intent intent = getIntent();
        int position = Integer.parseInt(intent.getStringExtra("position"));
        String text;

        if (position == 0) {
            text = "Why it made the list: There are many reasons to like leg raise variations, " +
                    "but one is their scalability. You can start doing bent knee raises in the Roman chair or ab straps to focus on the " +
                    "lower core, work up to straight leg raises, and then move to a hanging bar." +
                    " By the time you can do full straight-leg toes-to-bar raises," +
                    " your entire core will have strength for days. That's not the only way to progress, though. " +
                    "You can also increase the degree of difficulty by holding a medicine ball between your knees or ankles, " +
                    "which allows you to train in a lower rep range. No matter the variation," +
                    " get your legs as high as possible on each rep without using momentum to swing them up. " +
                    "In your workout: Do this move first or second in your routine for 3 sets of 10-15 reps. If using a medicine ball," +
                    " try a dropset simply by letting go of the medicine ball when you hit failure.";
            heading_text.setText("Hanging Leg Raise Or Knee Raise:");
            txt.setText(text);
            img.setImageResource(R.drawable.hanging_leg_raise);
        }else if (position == 1) {
            text = "If you're looking to target the deep-tissue muscle fibers," +
                    " cable curls are a good bet. Since the pattern of movement is " +
                    "less stable with this movement, due to the constant tension provided by the cable, " +
                    "you will call all the stabilization muscles surrounding the " +
                    "biceps into play as you execute the exercise.\n" +
                    "You can use a variety of different attachments to perform the cable curls including a rope, " +
                    "a straight bar, or rotating cable handles that allow you to work a single arm at a time.";
            heading_text.setText("Standing Biceps Cable Curl:");
            txt.setText(text);
            img.setImageResource(R.drawable.standing_biceps_cable_curl);
        }else if (position == 2) {
            text = "Why it's on the list: You can generate the most power with barbell lifts," +
                    " so the standard barbell bench allows you to move the most weight." +
                    " It's also an easier lift to control than pressing with heavy dumbbells. " +
                    "The exercise is easy to spot and relatively easy to learn (if not master)," +
                    " There are plenty of bench-press programs you can follow to increase your strength." +
                    " In your workout: Do it toward the start of your chest workout for heavy sets in lower rep ranges." +
                    " Consider varying your grip width for more complete chest development.";
            heading_text.setText("Barbell Bench Press:");
            txt.setText(text);
            img.setImageResource(R.drawable.barbell_bench_press);
        }

        else if (position == 3) {
            text = "Rear delts are commonly lagging for novices and bodybuilding pros alike. " +
                    "Simply put, they don't get as much stimulation, given that the front and middle delts are involved in chest- and " +
                    "shoulder-pressing moves." +
                    " While the rears are called into action on back day, all too many lifters focus on mirror muscles. If your rears are in arrears, " +
                    "just follow this routine for 4-8 weeks—or alternate with a more balanced shoulder routine—to help bring them up.";
            heading_text.setText("Rear Delt Growth:");
            txt.setText(text);
            img.setImageResource(R.drawable.rear_delt_growth);
        }
        else if (position == 4) {
            text = "On the opposite side of the horseshoe, just above the medial head, is the bulky long head. " +
                    "As stated earlier, because of how it attaches above the shoulder joint, " +
                    "you need to put your arms in the overhead position to best engage it. This workout makes a good " +
                    "change of pace from your usual triceps routine, but can also be done short term to bring up the long head.\n" +
                    "\n" +
                    "This workout makes a good change of pace from your usual triceps routine, " +
                    "but can also be done short term to bring up the long head.\n" +
                    "\n" +
                    "Tips\n" +
                    "\n" +
                    "Warm-up sets aren't included; do as many as you need, but never take warm-ups to muscle failure.\n" +
                    "Choose a weight that allows you to reach muscle failure by the target rep listed.\n" +
                    "If you have a spotter, do a few forced reps on your heaviest set(s) of the first two exercises." +
                    " If you don't have a partner, train as close to muscle failure as possible," +
                    " and perform a drop set on your last set of each exercise.";
            heading_text.setText("Emphasis On Long Head:");
            txt.setText(text);
            img.setImageResource(R.drawable.emphasis_on_long_head);
        }
        else if (position == 5) {
            text = "Why it's on the list: It's always a good idea to have an overhead pulling" +
                    " movement in your back routine, and the pull-up is one of the best. " +
                    "Wide-grip pull-ups are excellent for putting emphasis on the upper lats. " +
                    "A closer grip may allow for a longer range of motion, but it may be possible to " +
                    "load the wide-grip pull-up to a greater degree because of an optimized starting joint position. " +
                    "The biggest challenge here for most trainers is training to failure in the right rep range " +
                    "for growth, which is 8-12.\n" +
                    "\n" +
                    "If you do pull-ups early in your workout, you might have to add a weighted belt. " +
                    "Of course, if you find them difficult, you can always use an assisted pull-up " +
                    "machine or a good spotter, or switch to the wide-grip pull-down, " +
                    "which is a solid substitute. If your shoulders are healthy, pulling behind the head is okay.\n" +
                    "\n" +
                    "Good form is extremely important here. In the starting position, " +
                    "the scapula should be retracted—pull your shoulder blades down and toward each " +
                    "other—prior to initiating the pull. In your workout: Because the pull-up range of motion is so long, " +
                    "several light reps make great warm-up moves for the shoulder joints. Since form is so important with these, " +
                    "it may be best to push pull-ups toward the front of your workout to ensure proper shoulder-joint positioning.";
            heading_text.setText("Wide Grip Pull Up:");
            txt.setText(text);
            img.setImageResource(R.drawable.wide_grip_pull_up);
        }

//       btn.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//
//           }
//       });
    }
}
