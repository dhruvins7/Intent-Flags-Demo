package com.example.user.intentdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user on 04-09-2017.
 */

public class ObjectClass implements Parcelable {
    String name;
    String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.surName);
    }

    public ObjectClass() {
    }

    protected ObjectClass(Parcel in) {
        this.name = in.readString();
        this.surName = in.readString();
    }

    public static final Parcelable.Creator<ObjectClass> CREATOR = new Parcelable.Creator<ObjectClass>() {
        @Override
        public ObjectClass createFromParcel(Parcel source) {
            return new ObjectClass(source);
        }

        @Override
        public ObjectClass[] newArray(int size) {
            return new ObjectClass[size];
        }
    };
}
