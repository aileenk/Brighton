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
public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations and location details
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Wegmans Pittsford","3195 Monroe Avenue",
                "Rochester, NY 14618	","(585) 586-6680",
                "https://www.wegmans.com/stores/pittsford-ny.html", R.drawable.wegmans));
        locations.add(new Location("Avvino","2541 Monroe Avenue	","Rochester, NY 14618",
                "(585) 270-5229","https://www.avvinorochester.com/", R.drawable.avvino));
        locations.add(new Location("Monroe's Restaurant","3001 Monroe Avenue",
                "Rochester, NY 14618","(585) 348-9103​","https://www.monroes3001.com/",
                R.drawable.monroes));
        locations.add(new Location("Pittsford Plaza","3349 Monroe Avenue","Rochester, NY 14618",
                "(585) 424-6220","http://www.pittsfordplaza.com/",	R.drawable.pittsford_plaza));
        locations.add(new Location("Aja Noodle", "2602 Elmwood Avenue", "Rochester, NY 14618",
                "(585) 244-1052", "http://www.ajanoodle.com/", R.drawable.aja));
        locations.add(new Location("Sabra Grill", "1855 Monroe Avenue","Rochester, NY 14618",
                "(585) 244-2211","http://www.sabragrillroc.com/", R.drawable.sabra));
        locations.add(new Location("Char Broil Family Restaurant", "2450 Monroe Avenue",
                "Rochester, NY 14618","(585) 473-4960","http://charbroilrestaurant.com/",
                R.drawable.char_broil));

        // Create a LocationAdapter, whose data source is a list of the locations and details
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_dining);

        // Find the ListView object in the view hierarchy of the Activity
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the LocationAdapter
        listView.setAdapter(adapter);

        return rootView;
    }}
