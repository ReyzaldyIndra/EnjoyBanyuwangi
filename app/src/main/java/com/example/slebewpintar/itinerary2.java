package com.example.slebewpintar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class itinerary2 extends AppCompatActivity {
    ImageButton btnHomeStay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary2);
        btnHomeStay = findViewById(R.id.btn_homestay);
        btnHomeStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(itinerary2.this, itinerary3.class);
                startActivity(i);
            }
        });

    }
}
