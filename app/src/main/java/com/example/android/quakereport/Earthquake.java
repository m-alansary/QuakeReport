package com.example.android.quakereport;

public class Earthquake {
    private String eCountry;
    private String eDate;
    private String eMag;

    public Earthquake(String country, String date, String mag) {
        eCountry = country;
        eDate = date;
        eMag = mag;
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

}

