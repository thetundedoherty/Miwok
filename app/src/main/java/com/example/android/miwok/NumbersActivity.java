package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

           ArrayList<String> words = new ArrayList<String>();

             words.add ("one");
             words.add ("two");
             words.add ("three");
             words.add ("four");
             words.add ("five");
             words.add ("six");
             words.add ("seven");
             words.add ("eight");
             words.add ("nine");
             words.add ("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.root_view);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        int index = 0;

        TextView wordView1 = new TextView(this);
        wordView1.setText(words.get(index));
        rootView.addView(wordView1);

        index = index+ 1;

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);

        index = index+ 1;

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);

        index = index+ 1;

        TextView wordView4 = new TextView(this);
        wordView4.setText(words.get(index));
        rootView.addView(wordView4);

        index = index+ 1;

        TextView wordView5 = new TextView(this);
        wordView5.setText(words.get(index));
        rootView.addView(wordView5);

        index = index+ 1;

        TextView wordView6 = new TextView(this);
        wordView6.setText(words.get(index));
        rootView.addView(wordView6);

        index = index+ 1;

        TextView wordView7 = new TextView(this);
        wordView7.setText(words.get(index));
        rootView.addView(wordView7);

        index = index+ 1;

        TextView wordView8 = new TextView(this);
        wordView8.setText(words.get(index));
        rootView.addView(wordView8);

        index = index+ 1;

        TextView wordView9 = new TextView(this);
        wordView9.setText(words.get(index));
        rootView.addView(wordView9);
    }

}
