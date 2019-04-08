package com.example.haripertama.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Orang implements Parcelable {
    String name, job, tinggal, asal;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTinggal() {
        return tinggal;
    }

    public void setTinggal(String tinggal) {
        this.tinggal = tinggal;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.job);
        dest.writeString(this.tinggal);
        dest.writeString(this.asal);
        dest.writeInt(this.age);
    }

    public Orang() {
    }

    protected Orang(Parcel in) {
        this.name = in.readString();
        this.job = in.readString();
        this.tinggal = in.readString();
        this.asal = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<Orang> CREATOR = new Parcelable.Creator<Orang>() {
        @Override
        public Orang createFromParcel(Parcel source) {
            return new Orang(source);
        }

        @Override
        public Orang[] newArray(int size) {
            return new Orang[size];
        }
    };
}
