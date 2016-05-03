package com.example.robert.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grid_v;
    int[] images={R.drawable.vuln,R.drawable.invuln,R.drawable.empty,R.drawable.andriod};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_v = (GridView) findViewById(R.id.gridView1);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        double s_w = Math.floor((metrics.widthPixels / (metrics.density)-32)/25);
        //int s_w = metrics.widthPixels/25;
        double s_h = Math.floor((metrics.heightPixels / (metrics.density)-32)/25);
        //int s_h = metrics.heightPixels/25;

        Adapter adapter = new Adapter(this, getMonsters(s_w,s_h));
        grid_v.setAdapter(adapter);


    }

    private ArrayList<Monster> getMonsters(double hoz_size, double ver_size){
        ArrayList<Monster> monsters = new ArrayList<>();
        double j = hoz_size*ver_size;
        for(int i = 0; i<j;i++){
            monsters.add(new Monster(images[i%2+2]));
        }

        return monsters;

    }
}
