package com.example.qldvpet.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.qldvpet.R;
import com.example.qldvpet.SuaKhachHangActivity;
import com.example.qldvpet.ThemKhachHangActivity;
import com.example.qldvpet.adapter.khachhangAdapter;
import com.example.qldvpet.dao.KhachHangDAO;
import  com.example.qldvpet.model.KhachHang;
import java.util.ArrayList;

public class KhachHangActivity extends AppCompatActivity {
    khachhangAdapter khachhangAdapter;
    private ListView lvKH;
    private KhachHangDAO khachHangDAO;
    private ArrayList<KhachHang> dsKH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Khách Hàng");
        setContentView(R.layout.activity_khach_hang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //
        lvKH=findViewById(R.id.lvKhachHang);
        khachHangDAO = new KhachHangDAO(KhachHangActivity.this);
        dsKH = new ArrayList<>();
        dsKH = (ArrayList<KhachHang>) khachHangDAO.hienthiKH();
        khachhangAdapter = new khachhangAdapter(this,dsKH,R.layout.list_item_kh);
        lvKH.setAdapter(khachhangAdapter);
        lvKH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), SuaKhachHangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("makh",dsKH.get(i).getMaKH());
                bundle.putString("tenKH",dsKH.get(i).getHoten());
                bundle.putString("sdt",dsKH.get(i).getSDT());
                bundle.putString("diachi",dsKH.get(i).getDiachi());
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_them,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itThem:
                startActivity(new Intent(getApplicationContext(), ThemKhachHangActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
