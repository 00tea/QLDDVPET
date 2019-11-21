package com.example.qldvpet.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.qldvpet.database.DatabaseHelper;

public class PetDAO {
    public static final String TB_NAME = "Pet";
    public static final String SQL_PET = "CREATE TABLE Pet(mapet TEXT PRIMARY KEY, makh TEXT, tenpet TEXT, tuoi INT, giong TEXT)";
    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;
    public PetDAO(Context context){
        dbhelper = new DatabaseHelper(context);
        db = dbhelper.getWritableDatabase();
    }
}
