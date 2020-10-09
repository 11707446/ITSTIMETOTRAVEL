package com.example.itstimetotravel.ui.home;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Fam_list6 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<aca> acaArrayList6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_list6);
        recyclerView = findViewById(R.id.fam_listr6);
        acaArrayList6 = new ArrayList<>();
        acaArrayList6.add(new aca(R.drawable.sydney,"Sydney opera House","details"));
        acaArrayList6.add(new aca(R.drawable.great,"Great Barrier Reef Marine park","details"));
        acaArrayList6.add(new aca(R.drawable.alora,"alora-kata Tjuta National park","details"));
        acaArrayList6.add(new aca(R.drawable.syd,"Sydney Harbour Bridge","details"));
        acaArrayList6.add(new aca(R.drawable.qq,"Blue Mountain National Park","details"));
        acaArrayList6.add(new aca(R.drawable.melbourne,"Melbourne","details"));
        acaArrayList6.add(new aca(R.drawable.t,"Fraser Island","details"));

        Recyadpter17 recyadpter17 = new Recyadpter17(acaArrayList6,Fam_list6.this);
        recyclerView.setAdapter(recyadpter17);
        recyclerView.setLayoutManager(new LinearLayoutManager(Fam_list6.this, LinearLayoutManager.VERTICAL,false));
    }
}
