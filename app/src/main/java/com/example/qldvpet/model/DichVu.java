package com.example.qldvpet.model;

public class DichVu {
    String madv,tendv;
    double gia;

    public DichVu() {
    }

    @Override
    public String toString() {
        return "DichVu{" +
                "madv='" + madv + '\'' +
                ", tendv='" + tendv + '\'' +
                ", gia=" + gia +
                '}';
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getTendv() {
        return tendv;
    }

    public void setTendv(String tendv) {
        this.tendv = tendv;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public DichVu(String madv, String tendv, double gia) {
        this.madv = madv;
        this.tendv = tendv;
        this.gia = gia;
    }
}
