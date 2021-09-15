package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class User implements Parcelable {
    private String nama, umur, alamat;

    public User(String nama, String umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public User(){
        this.nama="";
        this.umur="";
        this.alamat="";
    }

    protected User(Parcel in) {
        nama = in.readString();
        umur = in.readString();
        alamat = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getUmur(){
        return umur;
    }

    public void setUmur(){
        this.umur = umur;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(){
        this.alamat = alamat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(umur);
        parcel.writeString(alamat);
    }
    public void delete(){

    }
    public void putParcelableArrayList(String daftar, ArrayList<User> dataUser){

    }
}
