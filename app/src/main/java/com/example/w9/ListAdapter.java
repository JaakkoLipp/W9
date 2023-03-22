package com.example.w9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder>{
    private ArrayList<User> UL;
    private Context context;

    public ListAdapter(Context context, ArrayList<User> UL) {
        this.context =context;
        this.UL = UL;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(context).inflate(R.layout.userview, parent, false));
    }



    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.fnview.setText(UL.get(position).getFirstName());
        holder.lnview.setText(UL.get(position).getLastName());
        holder.emailview.setText(UL.get(position).getEmail());
        holder.degreeview.setText(UL.get(position).getDegreeProgram());
    }

    @Override
    public int getItemCount() {
        return UL.size();
    }
}
