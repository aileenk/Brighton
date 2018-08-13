package com.example.android.brighton;

public class Location {

    /**
     * Name of location
     */
    private String mName;

    /**
     * Address Line 1 of location
     */
    private String mAddressLineOne;

    /**
     * Address Line 2 of location
     */
    private String mAddressLineTwo;

    /**
     * Phone Number of location
     */
    private String mPhoneNumber;

    /**
     * Website of location
     */
    private String mWebsite;

    /**
     * ID for the image resource
     */
    private int mImageResourceId;

    /**
     * Create a new Location object.
     *
     * @param name            is the name of the location
     * @param addressLineOne  is the first line of the address
     * @param addressLineTwo  is the second line of the address
     * @param phoneNumber     is the phone number of the location
     * @param website         is the website for the location
     * @param imageResourceId is the id of the image for the location
     */
    public Location(String name, String addressLineOne, String addressLineTwo, String phoneNumber, String website, int imageResourceId) {
        mName = name;
        mAddressLineOne = addressLineOne;
        mAddressLineTwo = addressLineTwo;
        mPhoneNumber = phoneNumber;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the location
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the first line of the address
     */
    public String getAddressLineOne() {
        return mAddressLineOne;
    }

    /**
     * Get the second line of the address
     */
    public String getAddressLineTwo() {
        return mAddressLineTwo;
    }

    /**
     * Get the phone number of the location
     */
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * Get the website of the location
     */
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the image resource id for the image assocated with the location
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "mImageResourceId=" + mImageResourceId +
                ", mName ='" + mName + '\'' +
                ", mAddressLineOne ='" + mAddressLineOne + '\'' +
                ", mAddressLineTwo ='" + mAddressLineTwo + '\'' +
                ", mPhoneNumber ='" + mPhoneNumber + '\'' +
                ", mWebsite ='" + mWebsite +
                '}';
    }
}

