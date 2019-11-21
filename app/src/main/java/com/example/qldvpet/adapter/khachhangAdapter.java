package com.example.qldvpet.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qldvpet.R;
import com.example.qldvpet.dao.KhachHangDAO;

import java.util.ArrayList;

import com.example.qldvpet.model.KhachHang;
import com.example.qldvpet.ui.KhachHangActivity;
public class khachhangAdapter extends BaseAdapter {
    KhachHangActivity khachHangActivity;
    ArrayList<KhachHang> dsKH;
    int layoutKH;
    KhachHangDAO khachHangDAO;

    public khachhangAdapter(KhachHangActivity khachHangActivity, ArrayList<KhachHang> dsKH, int layoutKH) {
        this.khachHangActivity = khachHangActivity;
        this.dsKH = dsKH;
        this.layoutKH = layoutKH;
    }

    @Override
    public int getCount() {
       return dsKH.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) khachHangActivity.getSystemService(khachHangActivity.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layoutKH,null);
            holder.ivKH = view.findViewById(R.id.ivKH);
            holder.ivXoa = view.findViewById(R.id.ivXoa);
            holder.tvTenKH = view.findViewById(R.id.tvTenKH);
            holder.tvSDT = view.findViewById(R.id.tvSDT);
            holder.tvDiaChi = view.findViewById(R.id.tvDiaChi);
            holder.ivXoa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    khachHangDAO = new KhachHangDAO(khachHangActivity);
                    khachHangDAO.xoaKH(dsKH.get(i).getMaKH());
                    dsKH.remove(i);
                    notifyDataSetChanged();
                }
            });
            view.setTag(holder);
        }  else holder= (ViewHolder) view.getTag();
        holder.tvTenKH.setText(dsKH.get(i).getHoten());
        holder.tvSDT.setText(dsKH.get(i).getSDT());
        holder.tvDiaChi.setText(dsKH.get(i).getDiachi());
        return view;

    }
    public static class ViewHolder{
        ImageView ivKH,ivXoa;
        TextView tvTenKH,tvSDT,tvDiaChi;

    }
}
