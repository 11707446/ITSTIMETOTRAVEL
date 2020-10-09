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

public class Recyadpter15 extends RecyclerView.Adapter<Recyadpter15.myviewholder> {
    private ArrayList<aca> acaArrayList4;
    private Context context;

    public Recyadpter15(ArrayList<aca> acaArrayList4, Context context) {
        this.acaArrayList4 = acaArrayList4;
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
                .load(acaArrayList4.get(position).getImagg())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
        holder.textView.setText(acaArrayList4.get(position).getName());
        holder.button.setText(acaArrayList4.get(position).getDeta());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent intent = new Intent(context,Place_info32.class);
                    context.startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent = new Intent(context,Place_info33.class);
                    context.startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent = new Intent(context,Place_info34.class);
                    context.startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent = new Intent(context,Place_info35.class);
                    context.startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent = new Intent(context,Place_info36.class);
                    context.startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent = new Intent(context,Place_info37.class);
                    context.startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent = new Intent(context,Place_info38.class);
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
        return acaArrayList4.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        Button button,button1;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img12);
            textView = itemView.findViewById(R.id.txt12);
            button = itemView.findViewById(R.id.bt12);
        }
    }
}

