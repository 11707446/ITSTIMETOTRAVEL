package com.example.itstimetotravel.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {
    GridView gridView;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        gridView = root.findViewById(R.id.gridview1);
        Gallary_gridview gallary_gridview = new Gallary_gridview(getActivity());
        gridView.setAdapter(gallary_gridview);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(),fullscreen_activity_gridview.class);
                intent.putExtra("ID",position);
                startActivity(intent);
            }
        });



    return root;
    }
}