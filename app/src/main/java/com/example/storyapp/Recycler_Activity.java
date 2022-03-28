package com.example.storyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;

public class Recycler_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(Recycler_Activity.this,R.color.cardview_dark_background));
        setContentView(R.layout.activityhome);

        setContentView(R.layout.activity_recycler);
        recyclerView = findViewById(R.id.recyclerV);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                   if (mInterstitialAd != null){
                       mInterstitialAd.show(Recycler_Activity.this);
                   }
                        Toast.makeText(Recycler_Activity.this, "Ad loaded", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Toast.makeText(Recycler_Activity.this, "Ad failed loaded", Toast.LENGTH_SHORT).show();
                        mInterstitialAd = null;
                    }
                });

        ArrayList<modle> List = new ArrayList<>();

//1
        List.add(new modle("Hundred Moral Stories"));
//        2
        List.add(new modle("Crow & Peacock"));
//        3
        List.add(new modle("The Hunter & Pigeon"));
//        4
        List.add(new modle("The Lion & The Rabbit"));
//        5
        List.add(new modle("Two Friends & The Bear"));
//        6
        List.add(new modle("The boy who Cried Wolf"));
//        7
        List.add(new modle("The Ant & The Grasshopper"));
//        8
        List.add(new modle("The Rabbit & Tortoise"));
//        9
        List.add(new modle("The Ugly Duckling"));
//        10
        List.add(new modle("The Golden bird"));
//        11
        List.add(new modle("Fresh Air Fiend"));
//        12
        List.add(new modle("The Pit & The Pendulum"));


        Adp_for_book adapter = new Adp_for_book(List, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);


    }
}