package com.example.recyclerviewsunyifr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.americano, R.drawable.coffeelatte, R.drawable.matchalatte,R.drawable.choclate, R.drawable.bananamilkshake, R.drawable.lemontea, R.drawable.chitsu,
                    R.drawable.teriyaki, R.drawable.ramen, R.drawable.spaghetti, R.drawable.frenchfries, R.drawable.gyoza, R.drawable.tacos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.menu);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}