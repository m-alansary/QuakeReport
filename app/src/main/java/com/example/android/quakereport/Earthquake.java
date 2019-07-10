package com.example.android.quakereport;

public class Earthquake {
    private String eCountry;
    private String eDate;
    private double eMag;

    public Earthquake(String country, String date, double mag) {
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

    public double getMag() {
        return eMag;
    }

}

