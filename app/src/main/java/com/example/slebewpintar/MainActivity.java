package com.example.slebewpintar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPay, btnNearby, btnTopUp, btnStore, btnTourism, btnSouvenir, btnCulinary, btnScan;
    TextView balance;
    Button btnSwp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPay = findViewById(R.id.btn_pay);
        btnScan = findViewById(R.id.btn_scan);
        btnTourism = findViewById(R.id.btn_tourism);
        btnTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, itinerary1.class);
                startActivity(i);
            }
        });
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, CustomActivity.class);
                startActivity(in);
            }
        });
//        btnSwp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, JodohActivity.class);
//                startActivity(intent);
//                Toast.makeText(MainActivity.this,"CLICK", Toast.LENGTH_SHORT).show();
//
//            }
//        });


    }


}
