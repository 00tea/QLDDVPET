package com.example.qldvpet.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.qldvpet.R;
import com.example.qldvpet.ThemHoaDonActivity;

public class HoaDonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Hóa Đơn");
        setContentView(R.layout.activity_hoa_don);


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
                startActivity(new Intent(getApplicationContext(), ThemHoaDonActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
