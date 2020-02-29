package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultOption extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        button1 = findViewById(R.id.resultId1);
        button2 = findViewById(R.id.resultId2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.resultId1){
            Intent intent = new Intent(ResultOption.this, SemesterResult.class);
            startActivity(intent);
        }else if(view.getId()== R.id.resultId2){
            Intent intent = new Intent(ResultOption.this, DiplomaResult.class);
            startActivity(intent);
        }
    }
}
