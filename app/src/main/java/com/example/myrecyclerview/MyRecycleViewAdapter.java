package com.example.myrecyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {
    private Pegawai[] pegawaiList;

    public MyRecycleViewAdapter(Pegawai[] pegawaiList) {
        this.pegawaiList = pegawaiList;
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list_pegawai, parent, false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        holder.nip.setText(pegawaiList[position].getNip());
        holder.nama.setText(pegawaiList[position].getNama());
    }

    @Override
    public int getItemCount() {
        return pegawaiList.length;
    }
}
