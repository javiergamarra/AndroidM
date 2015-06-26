package com.nhpatt.androidm;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.nhpatt.androidm.databinding.ActivityMainBinding;
import com.nhpatt.androidm.model.Movie;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Movie movie = new Movie("Mad Max");
        binding.setMovie(movie);
    }
}
