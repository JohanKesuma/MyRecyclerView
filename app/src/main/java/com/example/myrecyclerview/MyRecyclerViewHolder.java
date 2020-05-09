package com.example.myrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView nip;
    TextView nama;

    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        nip = itemView.findViewById(R.id.nip);
        nama = itemView.findViewById(R.id.nama);
    }
}
