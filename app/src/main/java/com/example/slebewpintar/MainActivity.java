package com.example.slebewpintar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPay, btnNearby, btnTopUp, btnStore, btnTourism, btnSouvenir, btnCulinary;
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnPay = findViewById(R.id.btn_pay);
        btnNearby = findViewById(R.id.btn_nearby);
        btnCulinary = findViewById(R.id.btn_culinary);
        btnTopUp = findViewById(R.id.btn_topup);
        btnStore =  findViewById(R.id.btn_store);
        btnTourism = findViewById(R.id.btn_tourism);
        btnSouvenir = findViewById(R.id.btn_souvenirs);
        balance = findViewById(R.id.tx_balance);
        setContentView(R.layout.activity_main);


    }


}
