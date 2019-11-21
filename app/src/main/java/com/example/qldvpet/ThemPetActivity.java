package com.example.qldvpet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ThemPetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Thêm pet");
        setContentView(R.layout.activity_them_pet);
    }
}
