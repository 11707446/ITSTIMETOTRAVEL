package com.example.itstimetotravel.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.itstimetotravel.R;

public class Viewwpageadoptee extends PagerAdapter {
   // Context context;
    private int[] imagg ;

    public Viewwpageadoptee(Context context, int[] imagg) {
        this.imagg = imagg;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.viewppagerr,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.img1);
        imageView.setImageResource(imagg[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return imagg.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}

