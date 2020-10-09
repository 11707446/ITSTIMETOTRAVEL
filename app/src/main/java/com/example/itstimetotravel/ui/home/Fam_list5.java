package com.example.itstimetotravel.ui.home;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Fam_list5 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<aca> acaArrayList5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_list5);
        recyclerView = findViewById(R.id.fam_listr5);
        acaArrayList5 = new ArrayList<>();
        acaArrayList5.add(new aca(R.drawable.maasai,"Maasai Mara National Reserve,Kenya","details"));
        acaArrayList5.add(new aca(R.drawable.vvctoria,"Victoria falls,Zambia","details"));
        acaArrayList5.add(new aca(R.drawable.djenne,"Djenne,Mali","details"));
        acaArrayList5.add(new aca(R.drawable.cape,"Cape Town,South Africa","details"));
        acaArrayList5.add(new aca(R.drawable.marraliech,"Marraliech,Morocco","details"));
        acaArrayList5.add(new aca(R.drawable.mount,"Mount Kilimanjaro, Tanzania","details"));
        Recyadpter16 recyadpter16 = new Recyadpter16(acaArrayList5,Fam_list5.this);
        recyclerView.setAdapter(recyadpter16);
        recyclerView.setLayoutManager(new LinearLayoutManager(Fam_list5.this, LinearLayoutManager.VERTICAL,false));
    }
}
