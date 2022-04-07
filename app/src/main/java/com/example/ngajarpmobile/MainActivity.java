package com.example.ngajarpmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKaryawan;
    private ArrayList<SetGetItem> item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKaryawan = findViewById(R.id.rvKaryawan);
        rvKaryawan.setHasFixedSize(true);

        item.addAll(ItemData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList () {
        rvKaryawan.setLayoutManager(new LinearLayoutManager(this));
        myAdapter adapter = new myAdapter(item, this);
        rvKaryawan.setAdapter(adapter);
    }
}