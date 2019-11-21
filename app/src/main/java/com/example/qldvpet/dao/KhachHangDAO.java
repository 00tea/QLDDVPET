package com.example.qldvpet.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.qldvpet.database.DatabaseHelper;
import com.example.qldvpet.model.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {
    public static final String TB_NAME = "KhachHang";
    public static final String SQL_KHACH_HANG = "CREATE TABLE KhachHang(makh TEXT PRIMARY KEY, tenkh TEXT," +
            " SDT INT, diachi TEXT)";
    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;

    public KhachHangDAO(Context context) {
        dbhelper = new DatabaseHelper(context);
        db = dbhelper.getWritableDatabase();

    }

    public boolean themKhachHang(KhachHang kh) {
        ContentValues values = new ContentValues();
        values.put("makh", kh.getMaKH());
        values.put("tenkh", kh.getHoten());
        values.put("SDT", kh.getSDT());
        values.put("diachi", kh.getDiachi());
        long result = db.insert(TB_NAME, null, values);
        try {
            if (result == -1) {
                return false;
            }
        } catch (Exception e) {
            Log.e("KhachHangDao", e.toString());
            return false;
        }
        return true;
    }
    public List<KhachHang> hienthiKH() {
        List<KhachHang> dsKH = new ArrayList<>();
        Cursor c = db.query(TB_NAME, null, null, null, null, null, null);
        c.moveToFirst();

        while (c.isAfterLast() == false) {
            KhachHang khachHang = new KhachHang();
            khachHang.setMaKH(c.getString(0));
            khachHang.setHoten(c.getString(1));
            khachHang.setSDT(c.getString(2));
            khachHang.setDiachi(c.getString(3));
            dsKH.add(khachHang);
            Log.d("//=====", khachHang.toString());
            c.moveToNext();
        }
        c.close();
        return dsKH;
    }

    public int xoaKH(String makh) {
        int result = db.delete(TB_NAME, "makh=?", new String[]{makh});
        if (result == 0) {
            return -1;

        } else {
            return 1;
        }
    }

    public int suaKH(String makh, String hoten, String sdt,String diachi) {
        ContentValues values = new ContentValues();
        values.put("makh", makh);
        values.put("tenkh", hoten);
        values.put("SDT", sdt);
        values.put("diachi",diachi);
        int result = db.update(TB_NAME, values, "makh=?", new String[]{makh});
        if (result == 0) {
            return -1;
        }
        return 1;
    }
}

