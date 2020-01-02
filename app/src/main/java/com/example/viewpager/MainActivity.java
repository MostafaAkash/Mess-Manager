package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import com.pixelcan.inkpageindicator.InkPageIndicator;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private  DemoFragmentAdapter adapter;
    private InkPageIndicator indicator;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPagerIdMAinAc);
       indicator = findViewById(R.id.inkPageIndicator);
      // imageView = findViewById(R.id.createCircle);
        adapter = new DemoFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);



    }
}
