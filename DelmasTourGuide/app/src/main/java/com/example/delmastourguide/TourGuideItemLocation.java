package com.example.delmastourguide;

public class TourGuideItemLocation {
    private String mAddress;
    private String mGPS;

    public TourGuideItemLocation(String address,String gps)
    {
        mAddress=address;
        mGPS=gps;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getGps() {
        return mGPS;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public void getGps(String gps) {
        mGPS = gps;
    }
}

