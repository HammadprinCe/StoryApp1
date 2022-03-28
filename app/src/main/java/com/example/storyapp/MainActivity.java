package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Animatable;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Animation topAnimation,bottomAnimation,middleAnimation;
    Handler handler;

    View first,second,third,fourth,fifth,sixth;
    TextView s,sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.btm_anim);
middleAnimation= AnimationUtils.loadAnimation(this,R.anim.midle_anim);
first=findViewById(R.id.firstline);
second=findViewById(R.id.sec_line);
third=findViewById(R.id.third_line);
fourth=findViewById(R.id.forth_line);
fifth=findViewById(R.id.fift_line);
sixth=findViewById(R.id.sixth_line);
s=findViewById(R.id.S);
sb=findViewById(R.id.SB);

first.setAnimation(topAnimation);
second.setAnimation(topAnimation);
third.setAnimation(topAnimation);
fourth.setAnimation(topAnimation);
fifth.setAnimation(topAnimation);
sixth.setAnimation(topAnimation);
s.setAnimation(middleAnimation);
sixth.setAnimation(bottomAnimation);



        handler=new Handler ();


        handler.postDelayed ( new Runnable () {
            @Override
            public void run() {
                Intent intent=new Intent ( MainActivity.this, activityHome.class );
                startActivity ( intent );
                finish ();
            }
        },3000 );

    }
}