package com.example.qldvpet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.qldvpet.dao.KhachHangDAO;
import com.example.qldvpet.ui.KhachHangActivity;

public class SuaKhachHangActivity extends AppCompatActivity {
    EditText edmakh,edtenkh,edsdt,eddiachi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_khach_hang);
        setTitle("Sửa thông tin khách hàng");
        edmakh=findViewById(R.id.edMaKH);
        edtenkh=findViewById(R.id.edHoTen);
        edsdt=findViewById(R.id.edSDT);
        eddiachi=findViewById(R.id.edDiaChi);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle!=null){
            edmakh.setText(bundle.getString("makh"));
            edtenkh.setText(bundle.getString("tenKH"));
            edsdt.setText(bundle.getString("sdt"));
            eddiachi.setText(bundle.getString("diachi"));
        }
    }

    public void HuyKH(View view) {
        finish();
    }

    public void SuaKH(View view) {
        KhachHangDAO khachHangDAO = new KhachHangDAO(SuaKhachHangActivity.this);
        String makh = edmakh.getText().toString();
        String tenkh = edtenkh.getText().toString();
        String sdt = edsdt.getText().toString();
        String diachi= eddiachi.getText().toString();
        if(makh.isEmpty()||tenkh.isEmpty()||sdt.isEmpty()||diachi.isEmpty()){
            Toast.makeText(getApplicationContext(),"Không được để trống dữ liệu",Toast.LENGTH_SHORT).show();
        }else {
            khachHangDAO.suaKH(makh,tenkh,sdt,diachi);
            startActivity( new Intent(getApplicationContext(), KhachHangActivity.class));
        }
    }
}
