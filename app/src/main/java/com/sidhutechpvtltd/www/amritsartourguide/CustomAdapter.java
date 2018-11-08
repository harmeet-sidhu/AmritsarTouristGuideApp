package com.sidhutechpvtltd.www.amritsartourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link CustomAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link PlaceInfo} objects.
 */
public class CustomAdapter extends ArrayAdapter<PlaceInfo>  {

    /** Resource id for background color. */
    private int mColorResourceId ;

    /**
     * Create a new {@link CustomAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param placeInfos is the list of {@link PlaceInfo}s to be displayed.
     */
    public CustomAdapter(Context context, ArrayList<PlaceInfo> placeInfos, int colorResourceId) {
        super(context, 0, placeInfos);
        mColorResourceId = colorResourceId ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link PlaceInfo} object located at this position in the list
        PlaceInfo currentPlaceInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name_text_view.
        TextView miwokTextView =  listItemView.findViewById(R.id.place_name_text_view);
        // Get the Place Name from the currentPlaceInfo object and set this text on
        // the place_name_text_view.
        miwokTextView.setText(currentPlaceInfo.getPlacename());

        // Find the TextView in the list_item.xml layout with the ID place_Info_text_view.
        TextView defaultTextView =  listItemView.findViewById(R.id.place_Info_text_view);
        // Get the place address from the currentPlaceInfo object and set this text on
        // the place info TextView.
        defaultTextView.setText(currentPlaceInfo.getPlaceAddress());

        //Find the ImageView in the list_item_xml
        ImageView imageResourceId = listItemView.findViewById(R.id.image);
        // if image is provided then image view is going to show in activity.
        if (currentPlaceInfo.hasImage()) {
        // Set the ImageView to the image resource.
            imageResourceId.setImageResource(currentPlaceInfo.getmImageResourceId());
        // Make sure that image is going to displayed.
            imageResourceId.setVisibility(View.VISIBLE);
        }

        else {
        // Otherwise it is going to hide the image.
            imageResourceId.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}