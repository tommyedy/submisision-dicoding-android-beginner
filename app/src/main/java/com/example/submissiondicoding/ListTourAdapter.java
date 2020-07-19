package com.example.submissiondicoding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListTourAdapter extends RecyclerView.Adapter<ListTourAdapter.ListViewHolder> {

    private ArrayList<TourData> listTourData;


    public ListTourAdapter(ArrayList<TourData> listTourData) {
        this.listTourData = listTourData;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =  inflater.inflate(R.layout.list_layout, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        TourData list_event = listTourData.get(position);
        holder.imageView.setImageResource(list_event.getImage());
        holder.headingSatu.setText(list_event.getHeadingSatu());
        holder.caption.setText(list_event.getCaption());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tourDetail = new Intent(holder.itemView.getContext(), TourDetail.class);
                tourDetail.putExtra("title",listTourData.get(position).getHeadingSatu());
                tourDetail.putExtra("image",listTourData.get(position).getImage());
                tourDetail.putExtra("caption",listTourData.get(position).getDescription());
                holder.itemView.getContext().startActivity(tourDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTourData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView headingSatu, caption;
        private ImageView imageView;
        private CardView cardView;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            headingSatu = itemView.findViewById(R.id.headingSatu_id);
            caption = itemView.findViewById(R.id.caption_id);
            imageView = itemView.findViewById(R.id.imgView_id);
            cardView = itemView.findViewById(R.id.cardView_id);
        }
    }
}
