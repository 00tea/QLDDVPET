package com.example.qldvpet.model;

public class KhachHang {
    String maKH,hoten,SDT,diachi;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoten, String SDT, String diachi) {
        this.maKH = maKH;
        this.hoten = hoten;
        this.SDT = SDT;
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                ", hoten='" + hoten + '\'' +
                ", SDT='" + SDT + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
