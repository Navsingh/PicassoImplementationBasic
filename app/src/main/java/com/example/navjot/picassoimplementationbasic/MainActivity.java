package com.example.navjot.picassoimplementationbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
  private ImageView imageView ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageview);
        Picasso picasso = Picasso.with(this);
        picasso.setIndicatorsEnabled(true);
        picasso.load("http://i.imgur.com/DvpvklR.png")
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_action_name)
                .into(imageView);

    }
}
