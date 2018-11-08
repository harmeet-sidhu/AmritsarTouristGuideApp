package com.sidhutechpvtltd.www.amritsartourguide;

/**
 * {@link PlaceInfo} represents a Place Info.
 * It contains place name and place Address.
 */

public class PlaceInfo {
    /** Place Address  */
    private String aPlaceAddress;
    /** Place Name */
    private String aPlaceName;

    /** Images for each PlaceInfo. */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1 ;

    /**
     * Create a new PlaceInfo object.
     *
     * @param placeAddress is the address of an place.
     * @param placeName is the name of a place.
     * @param imageResourceId is resource id for images.
     */
    public PlaceInfo(String placeAddress, String placeName , int imageResourceId){
        aPlaceAddress = placeAddress;
        aPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }
    /**
     * Get the place address.
     */
    public String getPlaceAddress() {
        return aPlaceAddress;
    }
    /**
     * Get the place name.
     */
    public String getPlacename() {
        return aPlaceName;
    }

    /**
     * get the images for the Place.
     */
    public int getmImageResourceId (){ return mImageResourceId;}

    /**
     * Checks is Image provided or not.
     *
     */
    public boolean hasImage (){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
