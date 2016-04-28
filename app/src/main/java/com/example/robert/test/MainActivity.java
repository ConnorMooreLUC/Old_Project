package com.example.robert.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grid_v;
    int[] images={R.drawable.vuln,R.drawable.invuln,R.drawable.empty};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_v = (GridView) findViewById(R.id.gridView1);

        Adapter adapter = new Adapter(this, getMonsters());
        grid_v.setAdapter(adapter);
    }

    private ArrayList<Monster> getMonsters(){
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));
        monsters.add(new Monster(images[2]));

        return monsters;

    }
}
