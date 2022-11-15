package com.test.bai_kt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CaSi> arraylist;

    public Adapter(Context context, int layout, List<CaSi> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        CaSi caSi = arraylist.get(i);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tv_ten = view.findViewById(R.id.tv_ten);
        TextView tv_ngheDanh = view.findViewById(R.id.tv_ngheDanh);
        ImageView imageView_co = view.findViewById(R.id.imageView_co);
        TextView tv_soSao = view.findViewById(R.id.tv_soSao);

        imageView.setImageResource(caSi.getHinh());
        tv_ten.setText(caSi.getTen());
        tv_ngheDanh.setText(caSi.getNgheDanh());
        imageView_co.setImageResource(caSi.getQuocGia());
        tv_soSao.setText(caSi.getSoSao());
        return view;
    }
}
