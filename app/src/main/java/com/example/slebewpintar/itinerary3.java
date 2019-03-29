package com.example.slebewpintar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class itinerary3 extends AppCompatActivity {
    ImageButton btnWisata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary3);
        btnWisata = findViewById(R.id.btn_wisata);
        btnWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itinerary3.this, JodohActivity.class);
                startActivity(intent);
            }
        });

    }
}
