package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa>mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        //mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.ten),));

        mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.bapak),"Molyono", "Ayah", ""));
        mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.ebok),"Rifatul Hasanah", "Ibu", ""));
        mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.engkok),"Wildan Maulidi Molyono", "Anak", ""));
        mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.mida),"Ummu Fahmida Ikromiya", "Anak", ""));
    }
}
