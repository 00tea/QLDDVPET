package com.example.qldvpet.model;

public class HoaDon {
    String mahd,maKH,ngay;

    public HoaDon() {
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "mahd='" + mahd + '\'' +
                ", maKH='" + maKH + '\'' +
                ", ngay='" + ngay + '\'' +
                '}';
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public HoaDon(String mahd, String maKH, String ngay) {
        this.mahd = mahd;
        this.maKH = maKH;
        this.ngay = ngay;
    }
}
