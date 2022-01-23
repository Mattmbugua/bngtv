package com.example.bngtv.HelperClasses;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class phonehelper {

    int image;
    String title1,title2;
//    GradientDrawable color;

    public phonehelper(int image, String title1, String title2) {
        this.image = image;
        this.title1 = title1;
        this.title2 = title2;
        //this.color = color;
    }


//    public phonehelper(int image, String title1, String title2, GradientDrawable color) {
//        this.image = image;
//        this.title1 = title1;
//        this.title2 = title2;
//        this.color = color;
//    }




    //    public phonehelper(GradientDrawable color, int image, String title) {
//        this.image = image;
//        this.title = title;
//        this.color = color;
//    }


    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    public int getImage() {
        return image;
    }




//    public Drawable getgradient() {
//        return color;
//    }


}
