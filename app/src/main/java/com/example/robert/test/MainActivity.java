package com.example.robert.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double sw;
    double sh;
    GridView grid_v;
    int[] images={R.drawable.vuln,R.drawable.invuln,R.drawable.empty};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_v = (GridView) findViewById(R.id.gridView1);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        sw = Math.floor(((metrics.widthPixels/ metrics.density)));
        //int s_w = metrics.widthPixels/5;
        sh = Math.floor(((metrics.heightPixels/ metrics.density));
        //int s_h = metrics.heightPixels/5;

        final Adapter adapter = new Adapter(this, getMonsters(sw,sh));
        grid_v.setAdapter(adapter);
        grid_v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Integer j = position;
                adapter.changeMonsters(j,R.drawable.empty);
                adapter.changeMonsters(j,R.drawable.empty, R.drawable.vuln);
                grid_v.setAdapter(adapter);
            }
        });

    }

    private ArrayList<Monster> getMonsters(double hoz_size, double ver_size, Integer pos) {
        ArrayList<Monster> monsters = new ArrayList<>();
        double j = Math.floor(hoz_size * ver_size);
        for (int i = 0; i < j; i++) {
            monsters.add(new Monster(images[i % 3]));
        }
        if (pos > 1 && pos < monsters.size()) {
            monsters.set(pos, new Monster(images[1]));
            return monsters;
        } else {
            return monsters;
        }
    }

    private ArrayList<Monster> getMonsters(double hoz_size, double ver_size){
        ArrayList<Monster> monsters = new ArrayList<>();
        double j = hoz_size * ver_size;
        for(int i = 0; i<j;i++){
            monsters.add(new Monster(images[i%3]));
        }

        return monsters;

    }
}
