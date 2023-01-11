package id.ac.poliban.mi.nabila.e020320021.materialmestarter5_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar()!=null) getSupportActionBar().setTitle("Detail Material Me!");

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        Intent intent = getIntent();
        String titleString = intent.getStringExtra("title");
        int imageInt = intent.getIntExtra("image_resource", 0);

        sportsTitle.setText(titleString);
        Glide.with(this).load(imageInt).into(sportsImage);
    }
}