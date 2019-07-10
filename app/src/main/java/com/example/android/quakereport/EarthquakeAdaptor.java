package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class EarthquakeAdaptor extends ArrayAdapter<Earthquake> {

    public EarthquakeAdaptor(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView country = (TextView) listItemView.findViewById(R.id.country);

        country.setText(currentEarthquake.getCountry());

        TextView date = (TextView) listItemView.findViewById(R.id.date);

        date.setText(currentEarthquake.getDate());

        TextView mag = (TextView) listItemView.findViewById(R.id.mag);

        mag.setText(Double.toString(currentEarthquake.getMag()));

        return listItemView;
    }
}
