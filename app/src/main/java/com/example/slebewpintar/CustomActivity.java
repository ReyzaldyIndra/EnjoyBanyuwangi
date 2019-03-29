package com.example.slebewpintar;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import edmt.dev.edmtdevcognitivevision.Contract.AnalysisResult;
import edmt.dev.edmtdevcognitivevision.Contract.Caption;
import edmt.dev.edmtdevcognitivevision.Rest.VisionServiceException;
import edmt.dev.edmtdevcognitivevision.VisionServiceClient;
import edmt.dev.edmtdevcognitivevision.VisionServiceRestClient;

public class CustomActivity extends AppCompatActivity {
    Button btnPict;
    ImageView image;
    TextView txtResult;

    private final String PREDICTION_KEY = "e1452fea587346c4a67624bebb40005a";
    private final String PREDICTION_URL = "https://southeastasia.api.cognitive.microsoft.com/customvision/v3.0/Prediction/bae48274-0f1f-4da9-b8c4-f47032c56dbd/classify/iterations/Iteration1/image";

    VisionServiceClient visionServiceClient = new VisionServiceRestClient(PREDICTION_KEY, PREDICTION_URL);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        btnPict = findViewById(R.id.btn_pict);
        image = findViewById(R.id.img_pict);
        txtResult = findViewById(R.id.txtResult);
        btnPict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.simple_tounge);
        image.setImageBitmap(bitmap);

        btnPict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                final ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());

                AsyncTask<InputStream, String, String> visionTask = new AsyncTask<InputStream, String, String>() {
                    ProgressDialog progressDialog = new ProgressDialog(CustomActivity.this);

                    @Override
                    protected void onPreExecute() {
                        progressDialog.show();
                    }


                    @SuppressLint("WrongThread")
                    @Override
                    protected String doInBackground(InputStream... inputStreams) {
                        try {
                            publishProgress("Recognizing....");
                            String[] features = {"Description.."};
                            String[] details = {};
                            AnalysisResult result = visionServiceClient.analyzeImage(inputStreams[0], features, details);
                            String jsonResult = new Gson().toJson(result);
                            return jsonResult;
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (VisionServiceException e) {
                            e.printStackTrace();
                        }
                        return null;
                    }

                    @Override
                    protected void onPostExecute(String s) {

                    if (TextUtils.isEmpty(s)){
                        Toast.makeText(CustomActivity.this, "API returns empty result", Toast.LENGTH_SHORT);
                    }else {
                        progressDialog.dismiss();
                        AnalysisResult result = new Gson().fromJson(s, AnalysisResult.class);
                        StringBuilder result_text = new StringBuilder();
                        for (Caption caption:result.description.captions)
                            result_text.append(caption.text);
                        txtResult.setText(result_text.toString());
                    }
                    }

                    @Override
                    protected void onProgressUpdate(String... values) {
                        progressDialog.setMessage(values[0]);
                    }
                };

                visionTask.execute(inputStream);


        }
    });


}
}
