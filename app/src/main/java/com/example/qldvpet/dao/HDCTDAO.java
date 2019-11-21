package com.example.qldvpet.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.qldvpet.database.DatabaseHelper;

public class HDCTDAO {
    public static final String TB_NAME = "HDCT";
    public static final String SQL_HDCT = "CREATE TABLE HDCT(mahdct TEXT PRIMARY KEY,mahd TEXT, madv TEXT)";
    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;
    public HDCTDAO(Context context){
        dbhelper = new DatabaseHelper(context);
        db= dbhelper.getWritableDatabase();
    }
}
