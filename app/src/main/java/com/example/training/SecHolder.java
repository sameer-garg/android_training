package com.example.training;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SecHolder extends RecyclerView.ViewHolder {
    private TextView mMain;
    public SecHolder(@NonNull View itemView) {
        super(itemView);
        mMain= itemView.findViewById(R.id.main_text);
    }

    public TextView getMaintextView() {
        return mMain;
    }
}
