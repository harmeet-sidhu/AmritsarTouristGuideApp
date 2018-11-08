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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of placeInfos
        final ArrayList<PlaceInfo> placeInfos = new ArrayList<PlaceInfo>();
        placeInfos.add(new PlaceInfo(R.string.hotel1_info, R.string.hotel1, R.drawable.hyatt_amritsar));
        placeInfos.add(new PlaceInfo(R.string.hotel2_info, R.string.hotel2, R.drawable.mk_hotel));
        placeInfos.add(new PlaceInfo(R.string.hotel3_info, R.string.hotel3, R.drawable.holiday_inn_amritsar));
        placeInfos.add(new PlaceInfo(R.string.hotel4_info, R.string.hotel4, R.drawable.comfort_inn));

        // Create an {@link CustomAdapter}, whose data source is a list of {@link PlaceInfo}s. The
        // adapter knows how to create list items for each item in the list.
        CustomAdapter adapter = new CustomAdapter(getActivity(), placeInfos, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xmlml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link PlaceInfo} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}

