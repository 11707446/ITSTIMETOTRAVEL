package com.example.itstimetotravel.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class fullscreen_activity_gridview extends AppCompatActivity {
    ImageView imageView;
    ArrayList<Liist> arrayList1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_gridview);
        imageView = findViewById(R.id.Fullscreen_image);
        Intent i = getIntent();
        int position = i.getExtras().getInt("ID");
        Gallary_gridview gallary_gridview = new Gallary_gridview(this);
        imageView.setImageResource(gallary_gridview.ima[position]);




    }
}
