package com.example.qldvpet.model;

public class Pet {
    String mapet,maKH,tenpet,giong;
    int tuoi;

    public Pet() {
    }

    public Pet(String mapet, String maKH, String tenpet, String giong, int tuoi) {
        this.mapet = mapet;
        this.maKH = maKH;
        this.tenpet = tenpet;
        this.giong = giong;
        this.tuoi = tuoi;
    }

    public String getMapet() {
        return mapet;
    }

    public void setMapet(String mapet) {
        this.mapet = mapet;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenpet() {
        return tenpet;
    }

    public void setTenpet(String tenpet) {
        this.tenpet = tenpet;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "mapet='" + mapet + '\'' +
                ", maKH='" + maKH + '\'' +
                ", tenpet='" + tenpet + '\'' +
                ", giong='" + giong + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
