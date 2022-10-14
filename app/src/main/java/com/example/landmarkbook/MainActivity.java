package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        //Data

        Landmark pisa = new Landmark("Pisa","İtalya",R.drawable.pisa);
        Landmark eyfel = new Landmark("Eyfel","Fransa",R.drawable.eyfel);
        Landmark londra = new Landmark("Londra Köprüsü","İngiltere",R.drawable.londra);
        Landmark kolezyum = new Landmark("Kolezyum","İtalya",R.drawable.kolezyum);


        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eyfel);
        landmarkArrayList.add(londra);
        landmarkArrayList.add(kolezyum);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);


    }
}