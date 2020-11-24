package com.example.pcs_movie_0097;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("EXTRA_TITLE");
        String year = getIntent().getStringExtra("EXTRA_YEAR");
        String description = getIntent().getStringExtra("EXTRA_DESCRIPTION");
        String image = getIntent().getStringExtra("EXTRA_IMAGE");

        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtYear = findViewById(R.id.txtYear);
        TextView txtDescription = findViewById(R.id.txtDescription);
        ImageView imgPoster = findViewById(R.id.imgPoster);

        txtTitle.setText(title);
        txtYear.setText(year);
        txtDescription.setText(description);

        Glide.with(this)
                .load("https://themoviedb.org/t/p/w500/"+image.toString())
                .into(imgPoster);
    }
}