package com.example.itstimetotravel.ui.home;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Fam_list2 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<aca> acaArrayList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_list2);
        recyclerView = findViewById(R.id.fam_listr2);
        acaArrayList2 = new ArrayList<>();
        acaArrayList2.add(new aca(R.drawable.eiffel_tower,"Eiffel Tower,Paris","details"));
        acaArrayList2.add(new aca(R.drawable.pisa,"Leaning Tower,Pisa","details"));
        acaArrayList2.add(new aca(R.drawable.t,"Cliffs of Mohen","details"));
        acaArrayList2.add(new aca(R.drawable.rague,"Prague old town","details"));
        acaArrayList2.add(new aca(R.drawable.qq,"Fjords of Norway","details"));
        acaArrayList2.add(new aca(R.drawable.colosum,"Colosseum","details"));
        acaArrayList2.add(new aca(R.drawable.bled,"Lake Bled","details"));

        Recyadpter13 recyadpter13 = new Recyadpter13(acaArrayList2,Fam_list2.this);
        recyclerView.setAdapter(recyadpter13);
        recyclerView.setLayoutManager(new LinearLayoutManager(Fam_list2.this, LinearLayoutManager.VERTICAL,false));
    }
}
