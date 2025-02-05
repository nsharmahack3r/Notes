package com.example.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.RecyclerViewHolder>{
    CardView card;
    RandomColors randomColors;

    private ArrayList<CardItems>xList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        public TextView xHeadView;
        public TextView xDateView;
        public RecyclerViewHolder(View itemView){
            super(itemView);
            xHeadView = itemView.findViewById(R.id.textView);
            xDateView = itemView.findViewById(R.id.textView2);
        }
    }

    public AdapterActivity(ArrayList<CardItems> list){ xList = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card, parent, false);
        RecyclerViewHolder rvh = new RecyclerViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        card = card.findViewById(R.id.card_view);
        int colors = randomColors.getColor();
        card.setCardBackgroundColor(colors);


        CardItems currentItem = xList.get(position);

        holder.xHeadView.setText(currentItem.getHead());
        holder.xDateView.setText(currentItem.getDate());
    }

    @Override
    public int getItemCount() {
        return xList.size();
    }


}
