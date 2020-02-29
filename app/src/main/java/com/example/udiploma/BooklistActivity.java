package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class BooklistActivity extends AppCompatActivity {


    ListView myListView;
    Spinner mySpinner;
    ArrayAdapter<CosmicBody> adapter;
    String[] categories={
            "01. Telecommunication -54",
            "02. Mining and Mine Survey -53",
            "03. Mechatronic -52",
            "04. Instrumentation and process -51",
            "05. Environmental -50",
            "06. Garments Design and Pattern \n      Making-49",
            "07. Construction -48",
            "08. Architecture and Interior \n      Design -47",
            "09. Electro-medical -46",
            "10. Computer Science and -45",
            "11. Data Telecommunication and \n      Networking-44",
            "12. Surveying -43",
            "13. Aircraft Maintenance -83",
            "14. Aircraft Maintenance -82",
            "15. Marine -79",
            "16. Ceramic -76",
            "17. Graphic Reproduction Printing -75",
            "18. Offset Printing -74",
            "19. Power -71",
            "20. Mechanical -60",
            "21. Food -69",
            "22. Electronic -68",
            "23. Electrical -67",
            "24. Computer -66",
            "25. Civil -64",
            "26. Chemical -63",
            "27. Automobile -62",
            "28. Architecture -61",
            "29. Glass -77"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        initializeViews();
    }

    /*
   Initialize ListView and Spinner, set their adapters and listen to spinner itemSelection events
   */
    private void initializeViews() {

        mySpinner = findViewById(R.id.mySpinner);
        mySpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories));

        myListView = findViewById(R.id.myListView);
        myListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getCosmicBodies()));

        //spinner selection events
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long itemID) {
                if (position >= 0 && position < categories.length) {
                    getSelectedCategoryData(position);
                } else {
                    Toast.makeText(getApplicationContext(), "Selected Category Does not Exist!", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    /*
    Populate an arraylist that will act as our data source.
     */
    private ArrayList<CosmicBody> getCosmicBodies() {
        ArrayList<CosmicBody> data = new ArrayList<>();
        data.clear();

        data.add(new CosmicBody("1st Semester", 0));
        data.add(new CosmicBody("2nd Semester", 0));
        data.add(new CosmicBody("3rd Semester", 0));
        data.add(new CosmicBody("4th Semester", 0));
        data.add(new CosmicBody("5th Semester", 0));
        data.add(new CosmicBody("6th Semester", 0));
        data.add(new CosmicBody("7th Semester", 0));
        data.add(new CosmicBody("8th Semester", 0));

        return data;
    }
    /*
    Get the selected category's cosmic bodies and bind to ListView
     */
    private void getSelectedCategoryData(int categoryID) {
        //arraylist to hold selected cosmic bodies
        ArrayList<CosmicBody> cosmicBodies = new ArrayList<>();
        if(categoryID == 0)
        {
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getCosmicBodies());
        }else{
            //filter by id
            for (CosmicBody cosmicBody : getCosmicBodies()) {
                if (cosmicBody.getCategoryId() == categoryID) {
                    cosmicBodies.add(cosmicBody);
                }
            }
            //instatiate adapter a
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cosmicBodies);
        }
        //set the adapter to GridView
        myListView.setAdapter(adapter);
    }
}
/*
Data Object class to represent a single Cosmic body. Class has default access modifier
 */
class CosmicBody {
    private String name;
    private int categoryID;

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryID;
    }

    public CosmicBody(String name, int categoryID) {
        this.name = name;
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return name;
    }
}
