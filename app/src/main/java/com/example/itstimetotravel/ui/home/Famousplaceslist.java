package com.example.itstimetotravel.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Famousplaceslist extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<aca> acaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famousplaceslist);
        recyclerView = findViewById(R.id.rec1);
        acaArrayList = new ArrayList<>();
        acaArrayList.add(new aca(R.drawable.manal,"Shimla-Manali,India","details"));
        acaArrayList.add(new aca(R.drawable.kau,"Kuala Lumpur,Malaysia","details"));
        acaArrayList.add(new aca(R.drawable.ha,"Ha Long Bay, Vietnam","details"));
        acaArrayList.add(new aca(R.drawable.wallofchi,"Great Wall Of China","details"));
        acaArrayList.add(new aca(R.drawable.v,"Bali,Indonesia","details"));
        acaArrayList.add(new aca(R.drawable.dehan,"Daehan Dawan,South Korea","details"));
        acaArrayList.add(new aca(R.drawable.shwedagon,"Shwedagon,Maynmar","details"));
        Recyadpter12 recyadpter12 = new Recyadpter12(acaArrayList,Famousplaceslist.this);
        recyclerView.setAdapter(recyadpter12);
        recyclerView.setLayoutManager(new LinearLayoutManager(Famousplaceslist.this, LinearLayoutManager.VERTICAL,false));

    }

    }

