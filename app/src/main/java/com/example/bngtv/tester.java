package com.example.bngtv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class tester extends AppCompatActivity {
    BottomNavigationView nbtmnav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        nbtmnav = findViewById(R.id.bottom_nav_home);

        nbtmnav.setSelectedItemId(R.id.person_icon);

        nbtmnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home_icon:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.explore_icon:
                        return true;
                    case R.id.person_icon:
                        return true;
                }
                return false;
            }
        });
    }
}