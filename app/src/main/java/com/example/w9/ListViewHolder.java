package com.example.w9;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder {
    TextView fnview, lnview,emailview,degreeview;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        fnview = itemView.findViewById(R.id.FN);
        lnview = itemView.findViewById(R.id.LN);
        emailview = itemView.findViewById(R.id.EMAIL);
        degreeview = itemView.findViewById(R.id.DEGREE);


    }
}
