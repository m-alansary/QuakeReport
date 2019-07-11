package com.example.android.quakereport;

public class Earthquake {
    private String ePrimaryLocation;
    private String eLocationOffset;
    private String eDate;
    private String eMag;
    private String eTime;


    public Earthquake(String primaryLocation, String locationOffset, String date, String mag, String time) {
        ePrimaryLocation = primaryLocation;
        eLocationOffset = locationOffset;
        eDate = date;
        eMag = mag;
        eTime = time;
    }

    public String getPrimaryLocation() {
        return ePrimaryLocation;
    }

    public String getLocationOffset() {
        return eLocationOffset;
    }

    public String getDate() {
        return eDate;
    }

    public String getMag() {
        return eMag;
    }

    public String geteTime() {
        return eTime;
    }
}

