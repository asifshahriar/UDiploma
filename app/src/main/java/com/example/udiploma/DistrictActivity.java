package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.udiploma.District.BarishalDistrict;
import com.example.udiploma.District.ChittagongDistrict;
import com.example.udiploma.District.DhakaDistrict;
import com.example.udiploma.District.KhulnaDistrict;
import com.example.udiploma.District.MymenshinghDistrict;
import com.example.udiploma.District.RajshahiDistrict;
import com.example.udiploma.District.RangpurDistrict;
import com.example.udiploma.District.SylhetDistrict;

public class DistrictActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);

        cardView1 = findViewById(R.id.cardViewId1);
        cardView2 = findViewById(R.id.cardViewId2);
        cardView3 = findViewById(R.id.cardViewId3);
        cardView4 = findViewById(R.id.cardViewId4);
        cardView5 = findViewById(R.id.cardViewId5);
        cardView6 = findViewById(R.id.cardViewId6);
        cardView7 = findViewById(R.id.cardViewId7);
        cardView8 = findViewById(R.id.cardViewId8);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.cardViewId1){
            Intent intent = new Intent(getApplicationContext(), DhakaDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId2){
            Intent intent = new Intent(getApplicationContext(), ChittagongDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId3){
            Intent intent = new Intent(getApplicationContext(), BarishalDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId4){
            Intent intent = new Intent(getApplicationContext(), KhulnaDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId5){
            Intent intent = new Intent(getApplicationContext(), MymenshinghDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId6){
            Intent intent = new Intent(getApplicationContext(), RajshahiDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId7){
            Intent intent = new Intent(getApplicationContext(), SylhetDistrict.class);
            startActivity(intent);
        }if(view.getId()==R.id.cardViewId8){
            Intent intent = new Intent(getApplicationContext(), RangpurDistrict.class);
            startActivity(intent);
        }

    }
}
