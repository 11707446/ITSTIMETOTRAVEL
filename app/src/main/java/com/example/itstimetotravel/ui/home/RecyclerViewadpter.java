package com.example.itstimetotravel.ui.home;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.itstimetotravel.R;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

class RecyclerViewadpter extends RecyclerView.Adapter<RecyclerViewadpter.myviewholder> {
    private ArrayList<Cardd> carddArrayList;
    private Context context;

    public RecyclerViewadpter(ArrayList<Cardd> carddArrayList, Context context) {
        this.carddArrayList = carddArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carddv,parent,false);
        myviewholder myviewholders = new myviewholder(view);
        return myviewholders;
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, final int position) {
        Glide.with(this.context)
                .load(carddArrayList.get(position).getMimage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(context, wonders.class);
                    Log.i(TAG, "onClick: hekko");
                    intent.putExtra("ID",position);
                    context.startActivity(intent);
                }

            }
        });
        holder.textView.setText((CharSequence) carddArrayList.get(position).getMname());
    }

    @Override
    public int getItemCount() {
        return carddArrayList.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
      //  CardView cardView;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img2);
          //  cardView = itemView.findViewById(R.id.cardd1);
            textView = itemView.findViewById(R.id.trt);
        }
    }
}

