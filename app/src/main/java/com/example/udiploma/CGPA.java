package com.example.udiploma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowId;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CGPA extends AppCompatActivity {

    float One, Two,Three,Four,Five,Six,Seven,Eight;
    TextView tv_display, tv_input;
    EditText edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8;
    String a,b,c,d,e,f,g,h;
    private float one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_g_p);

        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        edt3 = (EditText) findViewById(R.id.editText3);
        edt4 = (EditText) findViewById(R.id.editText4);
        edt5 = (EditText) findViewById(R.id.editText5);
        edt6 = (EditText) findViewById(R.id.editText6);
        edt7 = (EditText) findViewById(R.id.editText7);
        edt8 = (EditText) findViewById(R.id.editText8);

        tv_display = findViewById(R.id.tv_displayId);

        findViewById(R.id.tv_inputID).setOnClickListener((View view)->{
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage("").setPositiveButton("Okey", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(),CGPA.class);
                    startActivity(intent);
                }
            });
        });

        findViewById(R.id.btn_calculate).setOnClickListener((View view) ->{


            a = edt1.getText().toString();
            if (a.length()==0){
                a="0";
            }
            b = edt2.getText().toString();
            if (b.length()==0){
                b="0";
            }
            c = edt3.getText().toString();
            if (c.length()==0){
                c="0";
            }
            d = edt4.getText().toString();
            if (d.length()==0){
                d="0";
            }
            e = edt5.getText().toString();
            if (e.length()==0){
                e="0";
            }
            f = edt6.getText().toString();
            if (f.length()==0){
                f="0";
            }
            g = edt7.getText().toString();
            if (g.length()==0){
                g="0";
            }
            h = edt8.getText().toString();
            if (h.length()==0){
                h="0";
            }
//cgpa
            One = Float.parseFloat(a);
            if (One!=0){
                One *=0.05;
            }
            Two = Float.parseFloat(b);
            if (Two!=0){
                Two *=0.05;
            }
            Three = Float.parseFloat(c);
            if (Three!=0){
                Three *=0.05;
            }
            Four = Float.parseFloat(d);
            if (Four!=0){
                Four *=0.10;
            }
            Five = Float.parseFloat(e);
            if (Five!=0){
                Five *=0.15;
            }
            Six = Float.parseFloat(f);
            if (Six!=0){
                Six *=0.20;
            }
            Seven = Float.parseFloat(g);
            if (Seven!=0){
                Seven *=0.25;
            }
            Eight = Float.parseFloat(h);
            if (Eight!=0){
                Eight *=0.15;
            }

            //hiding the keyboard after typing
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(edt8.getWindowToken(), 0);

            try{

                float cgpa = One+Two+Three+Four+Five+Six+Seven+Eight;
                tv_display.setText("Total CGPA: "+cgpa);

            }catch (NumberFormatException e1) {
                Toast.makeText(getApplicationContext(), "Please Required all field", Toast.LENGTH_SHORT).show();
            }

        });

        findViewById(R.id.btn_reset).setOnClickListener((View view)->{

            if(view.getId()==R.id.btn_reset){
                edt1.setText("");
                edt2.setText("");
                edt3.setText("");
                edt4.setText("");
                edt5.setText("");
                edt6.setText("");
                edt7.setText("");
                edt8.setText("");
                tv_display.setText("Please Enter Your GPA: "+" ");
            }
        });
    }


}