package com.nhpatt.androidm.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nhpatt.androidm.R;
import com.nhpatt.androidm.databinding.ActivityBindingBinding;
import com.nhpatt.androidm.model.Movie;

public class BindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding);
        binding.setMovie(new Movie("Mad Max"));
    }


}
