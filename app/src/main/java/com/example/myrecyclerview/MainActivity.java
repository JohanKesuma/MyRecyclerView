package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private MyRecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pegawai[] pegawaiList = {new Pegawai("001", "John"),
                new Pegawai("002", "Smith"),
                new Pegawai("003", "Doe")};

        myRecyclerView = findViewById(R.id.myrecyclerview);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecycleViewAdapter(pegawaiList);
        myRecyclerView.setAdapter(adapter);
    }
}
