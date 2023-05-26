package com.duyle.spinnerexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NhanVienAdapter extends BaseAdapter {

    private Context ctx;
    private ArrayList<NhanVienModel> nhanVienModels;

    public NhanVienAdapter(Context ctx, ArrayList<NhanVienModel> nhanVienModels) {
        this.ctx = ctx;
        this.nhanVienModels = nhanVienModels;
    }

    @Override
    public int getCount() {
        return nhanVienModels.size();
    }

    @Override
    public Object getItem(int i) {
        return nhanVienModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = ((Activity)ctx).getLayoutInflater();

        view = inflater.inflate(R.layout.item_nhanvien, viewGroup, false);
        ImageView ivAvatar = view.findViewById(R.id.ivAvatar);
        TextView tvName  = view.findViewById(R.id.txtName);
        TextView tvMaNV = view.findViewById(R.id.txtId);
        TextView tvBophan = view.findViewById(R.id.txtBophan);

        NhanVienModel nhanVienModel = nhanVienModels.get(i);
        tvName.setText(nhanVienModel.getName());
        tvMaNV.setText(nhanVienModel.getsId());
        tvBophan.setText(nhanVienModel.getsBoPhan());

        return view;
    }
}
