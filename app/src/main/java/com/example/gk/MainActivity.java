package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //APP variables...........................................................................
    private static int SPLASH_SCREEN = 4000;

    //variables...............................................................................
    Animation topAnim, botAmin;
    ImageView image;
    TextView logo, brand;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //This is for removing Navigation Bar.................................................
        getSupportActionBar().hide();

        //this one is for removing status bar of the top of the screen.........................
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);   //this main do not modify....................


        //animation for the SPLASH SCREEN......................................................
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botAmin = AnimationUtils.loadAnimation(this,R.anim.bot_animation);


        //-------------------------HOOKS----------------------------
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        //brand = findViewById(R.id.textView2);

        image.setAnimation(topAnim);
        logo.setAnimation(botAmin);



        // This is for after SPLASH landing on the main called DASHBOARD........................
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}