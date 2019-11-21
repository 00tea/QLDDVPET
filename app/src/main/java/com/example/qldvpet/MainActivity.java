package com.example.qldvpet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.qldvpet.ui.DichVuActivity;
import com.example.qldvpet.ui.HoaDonActivity;
import com.example.qldvpet.ui.KHTTActivity;
import com.example.qldvpet.ui.KhachHangActivity;
import com.example.qldvpet.ui.PetActivity;
import com.example.qldvpet.ui.ThongKeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewKhachHang(View view) {
        startActivity(new Intent(getApplicationContext(), KhachHangActivity.class));
    }

    public void ViewPet(View view) {
        startActivity(new Intent(getApplicationContext(), PetActivity.class));
    }

    public void viewDichVu(View view) {
        startActivity(new Intent(getApplicationContext(), DichVuActivity.class));
    }

    public void viewHoaDon(View view) {
        startActivity(new Intent(getApplicationContext(), HoaDonActivity.class));
    }

    public void viewThongKe(View view) {
        startActivity(new Intent(getApplicationContext(), ThongKeActivity.class));
    }

    public void viewKHTT(View view) {
        startActivity(new Intent(getApplicationContext(), KHTTActivity.class));
    }
}
