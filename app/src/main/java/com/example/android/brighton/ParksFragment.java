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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations with details
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Brighton Town Park","777 Westfall Road","Rochester, NY 14620",
                "(585) 784-5260","https://www.townofbrighton.org/260/Brighton-Town-Park",
                R.drawable.brighton_town_park));
        locations.add(new Location("Buckland Park","1341 Westfall Road","Rochester, NY 14618",
                "(585) 784-5260","https://www.townofbrighton.org/261/Buckland-Park", R.drawable.buckland_park));
        locations.add(new Location("Corbett's Glen","415 Penfield Road","Rochester, NY 14625",
                "(585) 784-5260","https://www.townofbrighton.org/262/Corbetts-Glen-Nature-Park",
                R.drawable.corbetts_glen));
        locations.add(new Location("Meridian Centre Park","2025 Winton Road South",
                "Rochester, NY 14618","(585) 784-5260",
                "https://www.townofbrighton.org/264/Meridian-Centre-Park", R.drawable.meridian_centre));
        locations.add(new Location("Sandra L. Frankel Nature Park","2300 Elmwood Avenue	",
                "Rochester, NY 14618","(585) 784-5260",
                "https://www.townofbrighton.org/827/Sandra-L-Frankel-Nature-Park", R.drawable.slf_nature_park));
        locations.add(new Location("Lehigh Valley Trail","East River Road and Crittenden Road",
                "Rochester, NY 14623","(585) 784-5260",
                "https://www.townofbrighton.org/263/Lehigh-Valley-Trail", R.drawable.lehigh_valley_trail));
        locations.add(new Location("Lynch Woods Nature Park","1133 Crittenden Road",
                "Rochester, NY 14623","(585) 784-5260","	https://www.townofbrighton.org/457/Lynch-Woods-Park	",	R.drawable.lynch_woods_nature_park	));
        locations.add(new Location("Persimmon Park","1285 S Clinton Ave	","Rochester, NY 14620",
                "(585) 784-5260","https://www.townofbrighton.org/265/Persimmon-Park", R.drawable.persimmon_park));

        // Create a LocationAdapter, whose data source is a list of the locations and details
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_parks);

        // Find the ListView object in the view hierarchy of the Activity
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the LocationAdapter
        listView.setAdapter(adapter);

        return rootView;
    }}
