package com.example.slebewpintar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class itinerary5 extends AppCompatActivity {
    ImageButton cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary5);
        cv = findViewById(R.id.cv_tg);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(itinerary5.this, MainActivity.class);
                startActivity(in);
            }
        });

    }
}
