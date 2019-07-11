package com.example.android.quakereport;

public class Earthquake {
    private String eCountry;
    private String eDate;
    private String eMag;
    private String eTime;

    public Earthquake(String country, String date, String mag, String time) {
        eCountry = country;
        eDate = date;
        eMag = mag;
        eTime = time;
    }

    public String getCountry() {
        return eCountry;
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

