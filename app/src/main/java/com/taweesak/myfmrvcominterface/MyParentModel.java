package com.taweesak.myfmrvcominterface;

import android.os.Parcel;
import android.os.Parcelable;

//Todo Step 4 ==> Create Parent Model
public class MyParentModel implements Parcelable { //Todo Step 13 implements Parcelable

    //Todo Step 12 Create Field + method set get
    double rate;
    String country;
    int imageFlag;

    public MyParentModel() {
    }

    public MyParentModel(double rate) {
        this.rate = rate;
    }

    public MyParentModel(double rate, String country, int imageFlag) {
        this.rate = rate;
        this.country = country;
        this.imageFlag = imageFlag;
    }

    protected MyParentModel(Parcel in) {
        rate = in.readDouble();
        country = in.readString();
        imageFlag = in.readInt();
    }

    public static final Creator<MyParentModel> CREATOR = new Creator<MyParentModel>() {
        @Override
        public MyParentModel createFromParcel(Parcel in) {
            return new MyParentModel(in);
        }

        @Override
        public MyParentModel[] newArray(int size) {
            return new MyParentModel[size];
        }
    };

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImageFlag() {
        return imageFlag;
    }

    public void setImageFlag(int imageFlag) {
        this.imageFlag = imageFlag;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(rate);
        parcel.writeString(country);
        parcel.writeInt(imageFlag);
    }
}
