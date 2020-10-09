package com.example.itstimetotravel.ui.home;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.itstimetotravel.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    ViewPager viewPager;
    Viewwpageadoptee vvv;
    RecyclerView recyclerView1,recyclerView2;
    TextView vi;
    private ArrayList<Cardd> carddArrayList ;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private int[] imagg = {R.drawable.taj,R.drawable.colosum,R.drawable.christ,R.drawable.wallofchi,R.drawable.petra,R.drawable.chichen};




    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView1 = view.findViewById(R.id.recyy);
        viewPager = view.findViewById(R.id.viewpp);
        recyclerView2 = view.findViewById(R.id.recyyy);
        vi = view.findViewById(R.id.v1);


        viewpag();
       // recyview1();
        recyview2();


        rrrt();
        return  view;
    }

    private void recyview2()
    {
        carddArrayList =  new ArrayList<>();
        carddArrayList.add(new Cardd(R.drawable.asia1,"ASIA"));
        carddArrayList.add(new Cardd(R.drawable.europe1,"EUROPE"));
        carddArrayList.add(new Cardd(R.drawable.north_america1,"NORTH AMERICA"));
        carddArrayList.add(new Cardd(R.drawable.south_america,"SOUTH AMERICA"));
        carddArrayList.add(new Cardd(R.drawable.africa,"AFRICA"));
        carddArrayList.add(new Cardd(R.drawable.australia,"AUSTRALIA"));
        if(getActivity()!=null) {


            RecyclerView1 recyclerViewadpter1 = new RecyclerView1(carddArrayList, getActivity());
            recyclerView1.setAdapter(recyclerViewadpter1);
            recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
            recyclerView1.setItemAnimator(new DefaultItemAnimator());

        }

    }
    private void viewpag() {


       if(getActivity()!=null) {
           vvv = new Viewwpageadoptee(getActivity(), imagg);
           viewPager.setAdapter(vvv);
       }

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == imagg.length) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);
    }
    private void rrrt() {

        carddArrayList = new ArrayList<>();
        carddArrayList.add(new Cardd(R.drawable.taj,"Taj Mahal"));
        carddArrayList.add(new Cardd(R.drawable.petra,"Petra (Jordan)"));
        carddArrayList.add(new Cardd(R.drawable.chichen,"Chichen Itza"));
        carddArrayList.add(new Cardd(R.drawable.christ,"Christ the Redeemer Statue"));
        carddArrayList.add(new Cardd(R.drawable.colosum,"The Roman Colosseum"));
        carddArrayList.add(new Cardd(R.drawable.wallofchi,"Great Wall of China"));
        carddArrayList.add(new Cardd(R.drawable.machipichu,"Machu Picchu"));
        carddArrayList.add(new Cardd(R.drawable.egptyq,"Egypt"));
        if (getActivity() != null) {
            RecyclerViewadpter recyclerViewadpter = new RecyclerViewadpter(carddArrayList, getActivity());
            recyclerView2.setAdapter(recyclerViewadpter);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
    }


    }
