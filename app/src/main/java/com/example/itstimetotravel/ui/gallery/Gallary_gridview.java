package com.example.itstimetotravel.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Gallary_gridview extends BaseAdapter {
    private Context context;
    int ima[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.g,R.drawable.h,
            R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,
            R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,
            R.drawable.y,R.drawable.z,R.drawable.qq,R.drawable.ww,R.drawable.ee,R.drawable.rr,R.drawable.tt,R.drawable.yy,
            R.drawable.uu,R.drawable.ii,R.drawable.oo,R.drawable.pp,R.drawable.aa};

    public Gallary_gridview(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return ima.length;
    }

    @Override
    public Object getItem(int position) {
        return ima[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = convertView;
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = layoutInflater.inflate(R.layout.grid_viewdesign,null);
        ImageView imageView = v.findViewById(R.id.gridimagw);
        imageView.setImageResource(ima[position]);

        return v;
    }
}
