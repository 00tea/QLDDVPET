package com.example.qldvpet.model;

public class HDCT {
    String mahdct,mahd,madv;

    @Override
    public String toString() {
        return "HDCT{" +
                "mahdct='" + mahdct + '\'' +
                ", mahd='" + mahd + '\'' +
                ", madv='" + madv + '\'' +
                '}';
    }

    public String getMahdct() {
        return mahdct;
    }

    public void setMahdct(String mahdct) {
        this.mahdct = mahdct;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public HDCT(String mahdct, String mahd, String madv) {
        this.mahdct = mahdct;
        this.mahd = mahd;
        this.madv = madv;
    }

    public HDCT() {
    }
}
