package com.sidhutechpvtltd.www.amritsartourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragments extends Fragment {

    public RestaurantsFragments() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // Create a list of placeInfos
        final ArrayList<PlaceInfo> placeInfos = new ArrayList<PlaceInfo>();
        placeInfos.add(new PlaceInfo("Ranjit Avenue", "Kulcha Land", R.drawable.kulcha_land));
        placeInfos.add(new PlaceInfo("Crystal Chowk", "Gyani Tea Stall", R.drawable.gyani_tea_stall));
        placeInfos.add(new PlaceInfo("Ranjit Avenue", "Brijwasi Chat", R.drawable.brijwasi_chat));
        placeInfos.add(new PlaceInfo("Town Hall", "Brothers Dhaba", R.drawable.brothers_dhaba));

        // Create an {@link CustomAdapter}, whose data source is a list of {@link PlaceInfo}s. The
        // adapter knows how to create list items for each item in the list.
        CustomAdapter adapter = new CustomAdapter(getActivity(), placeInfos, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_listst.xml layout file.
        ListView listView =  rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link PlaceInfo} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}
