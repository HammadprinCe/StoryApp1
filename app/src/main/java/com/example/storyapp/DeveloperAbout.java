package com.example.storyapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DeveloperAbout extends AppCompatActivity {


    ImageView facebook_icon, linkedin_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_about);



        facebook_icon = findViewById(R.id.fb);
        linkedin_icon = findViewById(R.id.linkedin);


//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/apple.fruit"));
//        startActivity(browserIntent);

        facebook_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100025744092523"));
                startActivity(browserIntent);

            }
        });
        linkedin_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/hammad-prince-4b6826228/"));
                startActivity(browserIntent);

            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}