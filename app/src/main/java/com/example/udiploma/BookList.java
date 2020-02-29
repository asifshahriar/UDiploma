package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookList extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private List<String> headerArray;
    private HashMap<String, List<String>> childArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        expandableListView = findViewById(R.id.expand_booklistId);

        expandableDataList();

        CustomAdapter customAdapter = new CustomAdapter(this,headerArray,childArray);
        expandableListView.setAdapter(customAdapter);

    }
    public void expandableDataList(){
        headerArray = new ArrayList<>();
        childArray = new HashMap<>();

//add header data
        headerArray.add("1st Semester");
        headerArray.add("2nd Semester");
        headerArray.add("3rd Semester");
        headerArray.add("4th Semester");
        headerArray.add("5th Semester");
        headerArray.add("6th Semester");
        headerArray.add("7th Semester");
        headerArray.add("8th Semester");

        //end header data

        //add child haspMap

        List<String> first_semester = new ArrayList<String>();
        first_semester.add("Computer Application");
        first_semester.add("Computer Application");
        first_semester.add("Computer Application");
        first_semester.add("Computer Application");
        first_semester.add("Computer Application");
        first_semester.add("Computer Application");
        first_semester.add("Computer Application");

        List<String> secound_semester = new ArrayList<String>();
        secound_semester.add("Computer Application");
        secound_semester.add("Computer Application");
        secound_semester.add("Computer Application");
        secound_semester.add("Computer Application");
        secound_semester.add("Computer Application");
        secound_semester.add("Computer Application");
        secound_semester.add("Computer Application");

        List<String> third_semester = new ArrayList<String>();
        third_semester.add("Computer Application");
        third_semester.add("Computer Application");
        third_semester.add("Computer Application");
        third_semester.add("Computer Application");
        third_semester.add("Computer Application");
        third_semester.add("Computer Application");
        third_semester.add("Computer Application");

        List<String> fourth_semester = new ArrayList<String>();
        fourth_semester.add("Computer Application");
        fourth_semester.add("Computer Application");
        fourth_semester.add("Computer Application");
        fourth_semester.add("Computer Application");
        fourth_semester.add("Computer Application");
        fourth_semester.add("Computer Application");
        fourth_semester.add("Computer Application");

        List<String> fifth_semester = new ArrayList<String>();
        fifth_semester.add("Computer Application");
        fifth_semester.add("Computer Application");
        fifth_semester.add("Computer Application");
        fifth_semester.add("Computer Application");
        fifth_semester.add("Computer Application");
        fifth_semester.add("Computer Application");
        fifth_semester.add("Computer Application");

        List<String> sixth_semester = new ArrayList<String>();
        sixth_semester.add("Computer Application");
        sixth_semester.add("Computer Application");
        sixth_semester.add("Computer Application");
        sixth_semester.add("Computer Application");
        sixth_semester.add("Computer Application");
        sixth_semester.add("Computer Application");
        sixth_semester.add("Computer Application");

        List<String> seven_semester = new ArrayList<String>();
        seven_semester.add("Computer Application");
        seven_semester.add("Computer Application");
        seven_semester.add("Computer Application");
        seven_semester.add("Computer Application");
        seven_semester.add("Computer Application");
        seven_semester.add("Computer Application");
        seven_semester.add("Computer Application");

        List<String> eight_semester = new ArrayList<String>();
        eight_semester.add("Industrial Attachment");
        //end child haspMap

        //put hashMap

        childArray.put(headerArray.get(0),first_semester);
        childArray.put(headerArray.get(1),secound_semester);
        childArray.put(headerArray.get(2),third_semester);
        childArray.put(headerArray.get(3),fourth_semester);
        childArray.put(headerArray.get(4),fifth_semester);
        childArray.put(headerArray.get(5),sixth_semester);
        childArray.put(headerArray.get(6),seven_semester);
        childArray.put(headerArray.get(7),eight_semester);
    }
}