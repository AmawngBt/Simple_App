package com.example.gk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    //Variables................................................................
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    //Toolbar toolbar;
    Toolbar toolbar;

    ImageView menuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //This is for removing Navigation Bar...................................
        //getSupportActionBar().hide();

        //for removing status bar
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);




        //Menu Hooks.............................................................
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        //toolbar = findViewById(R.id.toolbar);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //navigationDrawer();  // For clickable Menu Drawer........................

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
    }

    /*private void navigationDrawer()
    {
        //Navigation Drawer......................................................
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.findViewById(R.id.menu_icon);     //For clickable menu drawer...

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(drawerLayout.isDrawerVisible(GravityCompat.START))

                    drawerLayout.closeDrawer(GravityCompat.START);

                else
                    drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }*/

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}