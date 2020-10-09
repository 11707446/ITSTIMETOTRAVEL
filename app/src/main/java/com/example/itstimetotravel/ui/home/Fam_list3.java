package com.example.itstimetotravel.ui.home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Fam_list3 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<aca> acaArrayList3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_list3);
        recyclerView = findViewById(R.id.fam_listr3);
        acaArrayList3 = new ArrayList<>();
        acaArrayList3.add(new aca(R.drawable.belad_national,"Badland National Park","details"));
        acaArrayList3.add(new aca(R.drawable.yellow,"Yellowstone National Park","details"));
        acaArrayList3.add(new aca(R.drawable.niagara_fal,"Niagara falls,Antario","details"));
        acaArrayList3.add(new aca(R.drawable.moraine_lake,"Moraine Lake","details"));
        acaArrayList3.add(new aca(R.drawable.rague,"The Canadian","details"));
        acaArrayList3.add(new aca(R.drawable.oo,"Churchill","details"));
        acaArrayList3.add(new aca(R.drawable.victoria,"Victoria inner Harbouur","details"));
        Recyadpter14 recyadpter14 = new Recyadpter14(acaArrayList3,Fam_list3.this);
        recyclerView.setAdapter(recyadpter14);
        recyclerView.setLayoutManager(new LinearLayoutManager(Fam_list3.this, LinearLayoutManager.VERTICAL,false));
    }
}
