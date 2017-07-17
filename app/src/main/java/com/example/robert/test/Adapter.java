package com.example.robert.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Robert on 4/27/2016.
 */
public class Adapter extends BaseAdapter {

    Context c;
    ArrayList<Monster> monsters;

    public Adapter(Context c ,ArrayList<Monster> monsters){
        this.c =c;
        this.monsters = monsters;
    }
    public void changeMonsters(Integer pos, int image){
        this.monsters.set(pos, new Monster(image));
    }

    public void changeMonsters(Integer pos, int i1, int i2){
        Integer comp = this.monsters.get(pos).getImg();
        if (comp.equals(i2)){
            this.monsters.set(pos, new Monster(i1));
        }
    }

    public void changeMonsters(Integer pos, int i1, int i2){
        Integer comp = this.monsters.get(pos).getImg();
        if (comp.equals(i2)) {
            this.monsters.set(pos, new Monster(i1));
        }
    }

    @Override
    public int getCount() {
        return monsters.size();
    }

    @Override
    public Object getItem(int position) {
        return monsters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView==null) {
            convertView = inflater.inflate(R.layout.model, parent, false);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.imageView1);
        img.setAdjustViewBounds(true);

        img.setImageResource(monsters.get(position).getImg());

        return convertView;
    }
}
