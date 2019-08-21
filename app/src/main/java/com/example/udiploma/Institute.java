package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class Institute extends AppCompatActivity {

    private String[] textView1, textView2;
    private int[] images = {R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,R.drawable.school,
            R.drawable.school};
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute);

        recyclerView = findViewById(R.id.recyclerId);

        textView1 = getResources().getStringArray(R.array.govPoly);
        textView2 = getResources().getStringArray(R.array.govPolyAddress);

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(),images,textView1,textView2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
