package com.example.slebewpintar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<cardAdapter> {

    Context context;
    public arrayAdapter(Context context, int resource, List<cardAdapter> items) {
        super(context, resource, items);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        cardAdapter card_adapter = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        ImageView image = convertView.findViewById(R.id.image);

        name.setText(card_adapter.getName());
        image.setImageResource(R.mipmap.ic_launcher);
    return convertView;
    }
}
