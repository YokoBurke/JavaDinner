package com.example.javadinner;

public class Dinner {

    private int myMenu;
    private int imageMenu;

    public Dinner(){
    }

    public Dinner(int dinnerMenu, int dinnerImage){
        myMenu = dinnerMenu;
        imageMenu = dinnerImage;
    }

    public int getDinnerMenu(){
        return myMenu;
    }

    public int getMyImage(){
        return imageMenu;
    }

}
