package com.example.bngtv;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;


import com.example.bngtv.HelperClasses.adapterphone;
import com.example.bngtv.HelperClasses.phonehelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements adapterphone.ListItemClickListener {

    RecyclerView phoneRecycler1,phoneRecycler2,phoneRecycler3;
    RecyclerView.Adapter adapter,adapter2,adapter3;
    BottomNavigationView nbtmnav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_home);

        //Bottomnavigation
        nbtmnav = findViewById(R.id.bottom_nav_home);

        nbtmnav.setSelectedItemId(R.id.home_icon);

        nbtmnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home_icon:
                        return true;
                    case R.id.explore_icon:
                        return true;
                    case R.id.person_icon:
                        startActivity(new Intent(getApplicationContext(),tester.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        //Hooks
        phoneRecycler1 = findViewById(R.id.my_recycler1);
        phoneRecycler2 = findViewById(R.id.my_recycler2);
        phoneRecycler3 = findViewById(R.id.my_recycler3);
        phoneRecycler();

    }

    private void phoneRecycler() {

//        //All Gradients
//        GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
//        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
//        GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
//        GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});


        phoneRecycler1.setHasFixedSize(true);
        phoneRecycler1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<phonehelper> phonelocations = new ArrayList<>();
        phonelocations.add(new phonehelper( R.drawable.guitar1,"No Guidance","100m Views/Chris Brown"));//,gradient1
        phonelocations.add(new phonehelper( R.drawable.girl1pili, "Earfquake","130k Views/The Creator"));//,gradient4
        phonelocations.add(new phonehelper(R.drawable.hands1tatu, "ModeEva","120k Views/Beyonce"));//,gradient2
        phonelocations.add(new phonehelper(R.drawable.guitar1, "No Guidance","100k Views/Chris Brown"));//,gradient4

        phonelocations.add(new phonehelper( R.drawable.girl1pili, "Paradise","20k Views,Chris Martin"));//,gradient2


        adapter = new adapterphone(phonelocations,this);
        phoneRecycler1.setAdapter(adapter);

        //second RecyclerVIew
        phoneRecycler2.setHasFixedSize(true);
        phoneRecycler2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<phonehelper> phonelocations2 = new ArrayList<>();
        phonelocations2.add(new phonehelper( R.drawable.djbooth,"No Guidance","100m Views/Chris Brown"));//,gradient1
        phonelocations2.add(new phonehelper( R.drawable.mic2pili, "Earfquake","130k Views/The Creator"));//,gradient4
        phonelocations2.add(new phonehelper(R.drawable.hands1tatu, "ModeEva","120k Views/Beyonce"));//,gradient2
        phonelocations2.add(new phonehelper(R.drawable.guitar1, "No Guidance","100k Views/Chris Brown"));//,gradient4

        phonelocations2.add(new phonehelper( R.drawable.guy2kwanza, "Paradise","20k Views,Chris Martin"));//,gradient2


        adapter2 = new adapterphone(phonelocations2,this);
        phoneRecycler2.setAdapter(adapter2);

        //last recyclerView
        phoneRecycler3.setHasFixedSize(true);
        phoneRecycler3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<phonehelper> phonelocations3 = new ArrayList<>();
        phonelocations3.add(new phonehelper( R.drawable.guitar1,"No Guidance","100m Views/Chris Brown"));//,gradient1
        phonelocations3.add(new phonehelper( R.drawable.mixer3tatu, "Earfquake","130k Views/The Creator"));//,gradient4
        phonelocations3.add(new phonehelper(R.drawable.disco3tatu, "ModeEva","120k Views/Beyonce"));//,gradient2
        phonelocations3.add(new phonehelper(R.drawable.guitar1, "No Guidance","100k Views/Chris Brown"));//,gradient4

        phonelocations3.add(new phonehelper( R.drawable.guy2kwanza, "Paradise","20k Views,Chris Martin"));//,gradient2


        adapter3 = new adapterphone(phonelocations3,this);
        phoneRecycler3.setAdapter(adapter3);



    }

    @Override
    public void onphoneListClick(int clickedItemIndex) {


//            Intent mIntent;
//            switch (clickedItemIndex){
//                case 0: //first item in Recycler view
//                    mIntent  = new Intent(FirstActivity.this, samsung.class);
//                    startActivity(mIntent);
//                    break;
//                case 1: //second item in Recycler view
//                    mIntent = new Intent(FirstActivity.this, vivo.class);
//                    startActivity(mIntent);
//                    break;
//                case 2: //third item in Recycler view
//                    mIntent = new Intent(FirstActivity.this, apple.class);
//                    startActivity(mIntent);
//                    break;
        //              case 3: //third item in Recycler view
//                    mIntent = new Intent(FirstActivity.this, realme.class);
//                    startActivity(mIntent);
//                    break;
//                case 4: //third item in Recycler view
//                    mIntent = new Intent(FirstActivity.this, poco.class);
//                    startActivity(mIntent);
//                    break;
//
//        }


    }
}