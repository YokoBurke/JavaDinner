package com.example.javadinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Dinner> myDinnerData = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        addDinnerList();

        mAdapter = new MyDinnerAdapter(MainActivity.this, myDinnerData);
        mRecyclerView.setAdapter(mAdapter);

    }

    private ArrayList<Dinner> addDinnerList(){
        myDinnerData.add(new Dinner(R.string.dinner_1, R.drawable.image1));
        myDinnerData.add(new Dinner(R.string.dinner_2, R.drawable.image2));
        myDinnerData.add(new Dinner(R.string.dinner_3, R.drawable.image3));
        myDinnerData.add(new Dinner(R.string.dinner_4, R.drawable.image4));
        myDinnerData.add(new Dinner(R.string.dinner_5, R.drawable.image5));
        myDinnerData.add(new Dinner(R.string.dinner_6, R.drawable.image6));
        myDinnerData.add(new Dinner(R.string.dinner_7, R.drawable.image7));
        myDinnerData.add(new Dinner(R.string.dinner_8, R.drawable.image8));
        myDinnerData.add(new Dinner(R.string.dinner_9, R.drawable.image9));
        myDinnerData.add(new Dinner(R.string.dinner_10, R.drawable.image10));
        myDinnerData.add(new Dinner(R.string.dinner_11, R.drawable.image11));
        myDinnerData.add(new Dinner(R.string.dinner_12, R.drawable.image12));
        myDinnerData.add(new Dinner(R.string.dinner_13, R.drawable.image13));
        myDinnerData.add(new Dinner(R.string.dinner_14, R.drawable.image14));
        myDinnerData.add(new Dinner(R.string.dinner_15, R.drawable.image15));

        return myDinnerData;

        //https://github.com/YokoBurke/PopularMovies/blob/master/app/src/main/java/com/example/jamesburke/popularmovies/MainActivity.java
    }
}