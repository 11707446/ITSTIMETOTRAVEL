package com.example.itstimetotravel.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.itstimetotravel.R;

import java.util.ArrayList;

public class Recyadpter16 extends RecyclerView.Adapter<Recyadpter16.myviewholder> {
    private ArrayList<aca> acaArrayList5;
    private Context context;

    public Recyadpter16(ArrayList<aca> acaArrayList5, Context context) {
        this.acaArrayList5 = acaArrayList5;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycountry,parent,false);
        myviewholder myviewholders = new myviewholder(view);
        return myviewholders;
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, final int position) {
        Glide.with(this.context)
                .load(acaArrayList5.get(position).getImagg())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
        holder.textView.setText(acaArrayList5.get(position).getName());
        holder.button.setText(acaArrayList5.get(position).getDeta());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent intent = new Intent(context,Place_info39.class);
                    context.startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent = new Intent(context,Place_info40.class);
                    context.startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent = new Intent(context,Place_info41.class);
                    context.startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent = new Intent(context,Place_info42.class);
                    context.startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent = new Intent(context,Place_info43.class);
                    context.startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent = new Intent(context,Place_info44.class);
                    context.startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent = new Intent(context,Place_info45.class);
                    context.startActivity(intent);
                }
                else
                {

                }




            }
        });



    }

    @Override
    public int getItemCount() {
        return acaArrayList5.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        Button button;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img12);
            textView = itemView.findViewById(R.id.txt12);
            button = itemView.findViewById(R.id.bt12);
        }
    }
}

