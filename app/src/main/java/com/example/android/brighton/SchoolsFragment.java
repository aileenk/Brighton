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
public class SchoolsFragment extends Fragment {

    public SchoolsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations and details
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Brighton High School","1150 Winton Road South",
                "Rochester, NY 14618","(585) 242-5000","https://www.bcsd.org/Domain/109",
                R.drawable.bhs));
        locations.add(new Location("Twelve Corners Middle School","2643 Elmwood Avenue",
                "Rochester, NY 14618","(585) 242-5100","https://www.bcsd.org/Domain/270",
                R.drawable.tcms));
        locations.add(new Location("French Road Elementary School","488 French Road",
                "Rochester, NY 14618","(585) 242-5140","https://www.bcsd.org/Domain/430",
                R.drawable.fres));
        locations.add(new Location("Council Rock Primary School","600 Grosvenor Road",
                "Rochester, NY 14610", "(585) 242-5170","https://www.bcsd.org/Domain/536	",
                R.drawable.crps));

        // Create a LocationAdapter, whose data source is a list of the locations and details
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_schools);

        // Find the ListView object in the view hierarchy of the Activity
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the LocationAdapter
        listView.setAdapter(adapter);

        return rootView;
    }}