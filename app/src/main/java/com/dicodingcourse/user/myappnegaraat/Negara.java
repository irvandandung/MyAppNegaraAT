package com.dicodingcourse.user.myappnegaraat;

import android.os.Parcel;
import android.os.Parcelable;

public class Negara implements Parcelable{
    private String negara;

    protected Negara(Parcel in) {
        negara = in.readString();
        kota = in.readString();
        bendera = in.readString();
        ContentDetail = in.readString();
        lagukebangsaan = in.readString();
        bahasakebangsaan = in.readString();
    }

    public static final Creator<Negara> CREATOR = new Creator<Negara>() {
        @Override
        public Negara createFromParcel(Parcel in) {
            return new Negara(in);
        }

        @Override
        public Negara[] newArray(int size) {
            return new Negara[size];
        }
    };

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getBendera() {
        return bendera;
    }

    public void setBendera(String bendera) {
        this.bendera = bendera;
    }

    private String kota;
    private String bendera;

    public String getContentDetail() {
        return ContentDetail;
    }

    public void setContentDetail(String contentDetail) {
        ContentDetail = contentDetail;
    }

    public String getLagukebangsaan() {
        return lagukebangsaan;
    }

    public void setLagukebangsaan(String lagukebangsaan) {
        this.lagukebangsaan = lagukebangsaan;
    }

    public String getBahasakebangsaan() {
        return bahasakebangsaan;
    }

    public void setBahasakebangsaan(String bahasakebangsaan) {
        this.bahasakebangsaan = bahasakebangsaan;
    }

    private String ContentDetail;
    private String lagukebangsaan;
    private String bahasakebangsaan;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(negara);
        parcel.writeString(kota);
        parcel.writeString(bendera);
        parcel.writeString(ContentDetail);
        parcel.writeString(lagukebangsaan);
        parcel.writeString(bahasakebangsaan);
    }
}
