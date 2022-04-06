package com.example.storyapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf_view extends AppCompatActivity {

    TextView storyName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        getWindow().setStatusBarColor(ContextCompat.getColor(Pdf_view.this, R.color.cardview_dark_background));



        PDFView pdfview = findViewById(R.id.pdf_view);
        storyName = findViewById(R.id.text_v);


        int position = getIntent().getIntExtra("pos", 0);

        switch (position) {
            case 0:
                pdfview.fromAsset("100 Moral Stories.pdf").load();
                storyName.setText("Hundred Moral Stories");


                break;
            case 1:
                pdfview.fromAsset("crow-and-peacock-story-in-english-pdf.pdf").load();
                storyName.setText("Crow & Peacock");
                break;

            case 2:
                pdfview.fromAsset("the-hunter-and-pigeon-pdf.pdf").load();
                storyName.setText("The Hunter & Pigeon");
                break;
            case 3:
                pdfview.fromAsset("the-lion-and-the-rabbit-pdf.pdf").load();
                storyName.setText("The Lion & The Rabbit");
                break;

            case 4:
                pdfview.fromAsset("two-friends-and-the-bear-story-pdf.pdf").load();
                storyName.setText("Two Friends & The Bear");
                break;
            case 5:
                pdfview.fromAsset("the-boy-who-cried-wolf-pdf.pdf").load();
                storyName.setText("The boy who Cried Wolf");
                break;
            case 6:
                pdfview.fromAsset("the-ant-and-the-grasshopper-pdf.pdf").load();
                storyName.setText("The Ant & The Grasshopper");
                break;
            case 7:
                pdfview.fromAsset("the-rabbit-and-tortoise-story-in-english-pdf.pdf").load();
                storyName.setText("The Rabbit & Tortoise");
                break;

            case 8:
                pdfview.fromAsset("the-ugly-duckling-story-pdf.pdf").load();
                storyName.setText("The Ugly Duckling");
                break;
            case 9:
                pdfview.fromAsset("the_golden_bird.pdf").load();
                storyName.setText("The Golden bird");
                break;
            case 10:
                pdfview.fromAsset("fresh_air_fiend.pdf").load();
                storyName.setText("Fresh Air Fiend");
                break;
            case 11:
                pdfview.fromAsset("the_pit_and_the_pendulum.pdf").load();
                storyName.setText("The Pit & The Pendulum");
                break;


        }


    }
}