package com.example.delmastourguide;

public class TourGuideItem {
    private String mName;
    private int mImageResourceId;
    private TourGuideItemLocation mLocation;

    public TourGuideItem(String name, TourGuideItemLocation location) {
        mName = name;
        mLocation = location;
    }

    public TourGuideItem(String name, TourGuideItemLocation location, int imageId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int id) {
        mImageResourceId = id;
    }

    public TourGuideItemLocation getLocation() {
        return mLocation;
    }
}
