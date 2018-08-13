package com.example.android.brighton;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment subclass
 */
public class DepartmentsFragment extends Fragment {

    public DepartmentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create the list of locations with details
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Town Hall", "2300 Elmwood Avenue", "Rochester, NY 14618",
                "(585) 784-5250", "https://www.townofbrighton.org/", R.drawable.townhall));
        locations.add(new Location( "Volunteer Ambulance","1551 Winton Road South",
                "Rochester, NY 14618", "(585) 271-2718", "https://brightonambulance.org/",
                R.drawable.ambulance));
        locations.add(new Location( "Police", "2300 Elmwood Avenue", "Rochester, NY 14618	",
                "(585) 784-5150", "https://www.townofbrighton.org/221/Police",	R.drawable.police));
        locations.add(new Location( "Fire Department", "3100 East Avenue", "Rochester, NY 14610",
                "(585) 381-3200", "http://www.brightonfd.org/", R.drawable.fire));
        locations.add(new Location( "Town Court", "2300 Elmwood Avenue", "Rochester, NY 14618	",
                "(585) 784-5152", "https://www.townofbrighton.org/64/Town-Court", R.drawable.court));

        // Create a LocationAdapter, whose data source is a list of the locations and details
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_departments);

        // Find the ListView object in the view hierarchy of the Activity
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the LocationAdapter
        listView.setAdapter(adapter);

        return rootView;
    }}


