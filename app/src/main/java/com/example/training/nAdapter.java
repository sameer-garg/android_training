package com.example.training;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class nAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
     private ArrayList<String> mlist;
    public nAdapter(ArrayList<String> list) {
        mlist= list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.list_item,parent, false);
        return new SecHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
     SecHolder holder =(SecHolder)viewHolder;
        TextView main= holder.getMaintextView();
        String data= mlist.get(position);
        Log.d("sank",""+data);

        main.setText(data);
    }

    @Override
    public int getItemCount() {
        Log.d("sank",""+mlist.size());
        return mlist.size();
    }
}
