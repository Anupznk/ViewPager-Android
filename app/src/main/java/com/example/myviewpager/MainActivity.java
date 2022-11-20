package com.example.myviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> items = new ArrayList<>();
    private ViewPagerAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.add(new Model(R.drawable.three, "Physics", 2));
        items.add(new Model(R.drawable.two, "Chemistry", 3));
        items.add(new Model(R.drawable.one, "Biology", 4));
        items.add(new Model(R.drawable.four, "Math", 5));
        items.add(new Model(R.drawable.three, "Physics", 3));
        items.add(new Model(R.drawable.two, "Chemistry", 2));
        items.add(new Model(R.drawable.one, "Biology", 5));
        items.add(new Model(R.drawable.four, "Math", 4));

        viewPager = findViewById(R.id.view_pager);

        adapter = new ViewPagerAdapter(items, this);

        viewPager.setAdapter(adapter);
        viewPager.setPadding(60, 0,60, 0);
        viewPager.setPageMargin(60);



    }
}