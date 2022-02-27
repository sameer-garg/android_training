package com.example.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recycleract extends AppCompatActivity {
    private RecyclerView nview;
    private RecyclerView.Adapter nadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleract);
        nview= findViewById(R.id.recycler_view);
        ArrayList<String> list= getData();
        nadapter= new nAdapter(list);
        nview.setAdapter(nadapter);
    }
    private ArrayList<String> getData(){
        ArrayList<String> list = new ArrayList<>();
        for(char c='a'; c<'r';c++){
            list.add(c-'a',c+ "alphabet");
        }
        return list;
    }
}