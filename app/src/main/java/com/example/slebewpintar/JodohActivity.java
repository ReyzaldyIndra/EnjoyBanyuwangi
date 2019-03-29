package com.example.slebewpintar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;

public class JodohActivity extends AppCompatActivity {

    private cardAdapter card_data[];
    private ArrayList<String> al;
    private ArrayAdapter<String> arrayAdapter;
    private int i;

    ListView listView;
    List<cardAdapter> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jodoh);

        al = new ArrayList<>();
        al.add("Fadhlan");
        al.add("John");
        al.add("python");
        al.add("php");

        rowItems = new ArrayList<cardAdapter>();
//        arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.name, rowItems);

        SwipeFlingAdapterView flingContainer = findViewById(R.id.frame);
        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                Log.d("LIST", "removed object!");
                al.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object o) {
//                Toast.makeText(JodohActivity.this, "left", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onRightCardExit(Object o) {
//                Toast.makeText(JodohActivity.this, "right", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAdapterAboutToEmpty(int i) {
                Intent intent = new Intent(JodohActivity.this, CustomActivity.class);
                startActivity(intent);
//                al.add("XML".concat(String.valueOf(i)));
//                arrayAdapter.notifyDataSetChanged();
//                Log.d("LIST", "notified");
//                i++;

            }

            @Override
            public void onScroll(float v) {

            }
        });

        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
            @Override
            public void onItemClicked(int i, Object o) {
                Toast.makeText(JodohActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
