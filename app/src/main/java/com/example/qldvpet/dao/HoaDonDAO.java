package com.example.qldvpet.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.qldvpet.database.DatabaseHelper;

public class HoaDonDAO {
    public static final String TB_NAME = "HoaDon";
    public static final String SQL_HOA_DON = "CREATE TABLE HoaDon(mahd TEXT PRIMARY KEY,makh TEXT, ngay DATE)";
    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;

    public HoaDonDAO(Context context) {
        dbhelper = new DatabaseHelper(context);
        db = dbhelper.getWritableDatabase();
    }
}
