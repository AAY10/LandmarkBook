package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        //Casting
        Landmark selectLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectLandmark.name);
        binding.countryText.setText(selectLandmark.country);
        binding.imageView.setImageResource(selectLandmark.image);



    }
}