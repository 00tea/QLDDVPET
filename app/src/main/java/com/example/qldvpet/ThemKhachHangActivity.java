package com.example.qldvpet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qldvpet.dao.KhachHangDAO;
import com.example.qldvpet.model.KhachHang;
import com.example.qldvpet.ui.KhachHangActivity;

public class ThemKhachHangActivity extends AppCompatActivity {
    EditText edmakh,edhoten,edsdt,eddiachi;
    Button btnthem,btnhuy,btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_khach_hang);
        setTitle("Thêm Khách Hàng");
        edmakh = findViewById(R.id.edMaKH);
        edhoten = findViewById(R.id.edHoTen);
        edsdt = findViewById(R.id.edSDT);
        eddiachi = findViewById(R.id.edDiaChi);
        btnthem = findViewById(R.id.btnThemKH);
        btnhuy = findViewById(R.id.btnHuyKH);
        btnshow = findViewById(R.id.btnshowKH);
        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KhachHangDAO khachHangDAO = new KhachHangDAO(ThemKhachHangActivity.this);
                String makh =edmakh.getText().toString();
                String tenkh = edhoten.getText().toString();
                String SDT = edsdt.getText().toString();
                String diachia = eddiachi.getText().toString();
                KhachHang khachHang;
                khachHang = new KhachHang(makh,tenkh,SDT,diachia);
                if (makh.isEmpty() || tenkh.isEmpty() || SDT.isEmpty() || diachia.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Không được để trống dữ liệu", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isInsertTrue = khachHangDAO.themKhachHang(khachHang);
                    if (isInsertTrue) {
                        Toast.makeText(getApplicationContext(), "Thêm thành công", Toast.LENGTH_SHORT).show();
                    } else
                        Toast.makeText(getApplicationContext(), "Thêm thất bại", Toast.LENGTH_SHORT).show();

                }

            }
        });
        }

    public void showKH(View view) {  finish();
        startActivity(new Intent(getApplicationContext(), KhachHangActivity.class));
    }
}
