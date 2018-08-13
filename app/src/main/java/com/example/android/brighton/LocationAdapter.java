package com.example.android.brighton;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Provides the layout for each list item
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /** Resource ID for the background color for each list */
    private int mColorResourceId;

    /**
     * Create a new LocationAdapter object.
     *
     * @param context is the current context that the adapter is being created in
     * @param locations is the list of locations and details to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of locations
     */
    LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the location object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the ImageView
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Get the image resource ID
        imageView.setImageResource(currentLocation.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Find the TextView for the location name
        TextView locationName = listItemView.findViewById(R.id.location_name);
        // Get the name and set the text
        locationName.setText(currentLocation.getName());

        // Find the TextView for the first line of the address
        TextView addressLineOne = listItemView.findViewById(R.id.address_line_one);
        // Get the first line of the address and set the text
        addressLineOne.setText(currentLocation.getAddressLineOne());

        // Find the TextView for the second line of the address
        TextView addressLineTwo = listItemView.findViewById(R.id.address_line_two);
        // Get the second line of the address and set the text
        addressLineTwo.setText(currentLocation.getAddressLineTwo());

        // Find the TextView for the phone number of the location
        TextView phoneNumber = listItemView.findViewById(R.id.phone_number);
        // Get the phone number and set the text
        phoneNumber.setText(currentLocation.getPhoneNumber());

        // Find the TextView for the website of the location
        TextView website = listItemView.findViewById(R.id.website);
        // Get the website and set the text
        website.setText(currentLocation.getWebsite());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
