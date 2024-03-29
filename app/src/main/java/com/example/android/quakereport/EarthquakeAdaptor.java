package com.example.android.quakereport;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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

        TextView primary = (TextView) listItemView.findViewById(R.id.primaryLocation);
        primary.setText(currentEarthquake.getPrimaryLocation());

        TextView offset = (TextView) listItemView.findViewById(R.id.locationOffset);
        offset.setText(currentEarthquake.getLocationOffset());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getDate());

        TextView mag = (TextView) listItemView.findViewById(R.id.mag);
        mag.setText(currentEarthquake.getMag());
        GradientDrawable magnitudeCircle = (GradientDrawable) mag.getBackground();
        int magnitudeColor = getMagnitudeColor(currentEarthquake.getMag());
        magnitudeCircle.setColor(magnitudeColor);

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(currentEarthquake.geteTime());

        return listItemView;
    }

    public int getMagnitudeColor(String magnitude) {
        double mag = Double.parseDouble(magnitude);
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(mag);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
