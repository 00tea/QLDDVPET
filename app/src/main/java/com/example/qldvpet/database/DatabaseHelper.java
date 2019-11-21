package com.example.qldvpet.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.qldvpet.dao.DichVuDAO;
import com.example.qldvpet.dao.HDCTDAO;
import com.example.qldvpet.dao.HoaDonDAO;
import com.example.qldvpet.dao.KhachHangDAO;
import com.example.qldvpet.dao.PetDAO;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, "QuanLyDichVuPet", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(KhachHangDAO.SQL_KHACH_HANG);
        sqLiteDatabase.execSQL(PetDAO.SQL_PET);
        sqLiteDatabase.execSQL(DichVuDAO.SQL_DICH_VU);
        sqLiteDatabase.execSQL(HoaDonDAO.SQL_HOA_DON);
        sqLiteDatabase.execSQL(HDCTDAO.SQL_HDCT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + KhachHangDAO.TB_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + PetDAO.TB_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DichVuDAO.TB_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + HoaDonDAO.TB_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + HDCTDAO.TB_NAME);

    }
}
