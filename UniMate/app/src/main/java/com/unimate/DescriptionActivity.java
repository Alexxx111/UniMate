package com.unimate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView descriptionText = (TextView)findViewById(R.id.description_text);
        TextView startTimeText = (TextView)findViewById(R.id.start_time_text);
        TextView endTimeText = (TextView)findViewById(R.id.end_time_text);


        Intent intent = getIntent();
        String memberCountString = intent.getStringExtra("memberCount");
        String startTimeString = intent.getStringExtra("startTime");
        String endTimeString = intent.getStringExtra("endTime");
        String groupDescriptionString="missing details";
       // groupDescriptionString = intent.getStringExtra("groupDescription");
        String groupNameString = intent.getStringExtra("groupName");

        setTitle(groupNameString);
        descriptionText.setText(groupDescriptionString);
        endTimeText.setText(endTimeString);
        startTimeText.setText(startTimeString);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}