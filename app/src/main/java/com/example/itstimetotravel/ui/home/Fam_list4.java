package com.example.itstimetotravel.ui.home;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Fam_list4 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<aca> acaArrayList4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_list4);
        recyclerView = findViewById(R.id.fam_listr4);
        acaArrayList4 = new ArrayList<>();
        acaArrayList4.add(new aca(R.drawable.machipichu,"Machu Picchu,Peru","details"));
        acaArrayList4.add(new aca(R.drawable.angel,"Angel falls,Venezuela","details"));
        acaArrayList4.add(new aca(R.drawable.torres,"Torres del Paine, Chile","details"));
        acaArrayList4.add(new aca(R.drawable.salar,"Salar de Uyuni,Bolivia","details"));
        acaArrayList4.add(new aca(R.drawable.y,"Salar de Uyuni,Bolivia","details"));
        acaArrayList4.add(new aca(R.drawable.san,"San Pedrode de Atacama","details"));
        acaArrayList4.add(new aca(R.drawable.easter,"Easter Island,Chile","details"));
        Recyadpter15 recyadpter15 = new Recyadpter15(acaArrayList4,Fam_list4.this);
        recyclerView.setAdapter(recyadpter15);
        recyclerView.setLayoutManager(new LinearLayoutManager(Fam_list4.this, LinearLayoutManager.VERTICAL,false));
    }
}
