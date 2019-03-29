//package com.example.slebewpintar;
//
//import android.content.Intent;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.TextView;
//
//import com.google.android.gms.common.api.CommonStatusCodes;
//import com.google.android.gms.vision.barcode.Barcode;
//
//public class PaymentConfirmActivity extends AppCompatActivity {
//    private static final int RC_BARCODE_CAPTURE = 9001;
//    private static final String TAG = "BarcodeMain";
//    TextView statusMessage, barcodeValue;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.payment_confirm);
//        statusMessage = findViewById(R.id.txStatus);
//        barcodeValue = findViewById(R.id.barcode_value);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        if(requestCode == RC_BARCODE_CAPTURE){
//            if(resultCode == CommonStatusCodes.SUCCESS){
//                if (data != null) {
//                    Barcode barcode = data.getParcelableExtra(BarcodeCaptureActivity.BarcodeObject);
//                    statusMessage.setText(R.string.barcode_success);
//                    barcodeValue.setText(barcode.displayValue);
////                    barcodeValue.setText(balance);
////                    int res = Integer.parseInt(barcode.displayValue);
////                    if (res == prize){
////                    result = balance - prize;
////                    disp = String.valueOf(result);
////                    barcodeValue.setText(disp);
////                    }else {
////                        barcodeValue.setText(barcode.displayValue);
////                    }
//                    Log.d(TAG, "Barcode read: " + barcode.displayValue);
////                    Log.d(TAG, "Final Balance:" + result);
//                } else {
//                    statusMessage.setText(R.string.barcode_failure);
//                    Log.d(TAG, "No barcode captured, intent data is null");
//                }
//            }
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//    }
//}
//
