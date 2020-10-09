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

public class Recyadpter14 extends RecyclerView.Adapter<Recyadpter14.myviewholder> {
    private ArrayList<aca> acaArrayList3;
    private Context context;

    public Recyadpter14(ArrayList<aca> acaArrayList3, Context context) {
        this.acaArrayList3 = acaArrayList3;
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
                .load(acaArrayList3.get(position).getImagg())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
        holder.textView.setText(acaArrayList3.get(position).getName());
        holder.button.setText(acaArrayList3.get(position).getDeta());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent intent = new Intent(context,Place_info25.class);
                    context.startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent = new Intent(context,Place_info26.class);
                    context.startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent = new Intent(context,Place_info27.class);
                    context.startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent = new Intent(context,Place_info28.class);
                    context.startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent = new Intent(context,Place_info29.class);
                    context.startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent = new Intent(context,Place_info30.class);
                    context.startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent = new Intent(context,Place_info31.class);
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
        return acaArrayList3.size();
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

