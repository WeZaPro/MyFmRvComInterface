package com.taweesak.myfmrvcominterface;

import android.os.Parcel;

//Todo Step 5 ==> Create Chid Model
public class MyChidModel extends MyParentModel{ //Todo Step 14 extend MyParentModel

    //Todo Step 15 create Field + mothod
    double result;

    public MyChidModel() {
    }

    public MyChidModel(double rate, String country, int imageFlag) {
        super(rate, country, imageFlag);

    }

    private void setResult(double rate, double inputValue) {
        this.result = rate*inputValue;
    }

    public double getResult() {
        return result;
    }
}
