package com.example.udiploma.District;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udiploma.R;

public class SylhetDistrict extends AppCompatActivity {


    private RecyclerView recyclerView;
    private String[] title;
    private String[] subTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_district);

        title = getResources().getStringArray(R.array.SylhetDistrict);
        subTitle = getResources().getStringArray(R.array.SylhetDistrict_subTitle);
        recyclerView = findViewById(R.id.recyclerViewId);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getApplicationContext(),title, subTitle);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
