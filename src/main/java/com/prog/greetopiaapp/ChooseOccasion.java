package com.prog.greetopiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChooseOccasion extends AppCompatActivity {

    Button birthdayBtn;
    Button graduationBtn;
    Button anniversaryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_occasion);


        //birthday button function----------------------------------------------------------------------
        birthdayBtn = findViewById(R.id.birthdayButton);
        birthdayBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(ChooseOccasion.this,BirthdayWelcomeScreen.class));
            }
        });

        //graduation button function---------------------------------------------------------------------
        graduationBtn = findViewById(R.id.graduationButton);
        graduationBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"Card Option Not Included in Prototype", Toast.LENGTH_SHORT).show(); //pop up message
                //startActivity(new Intent(ChooseOccasion.this,GraduationWelcomeScreen.class));
            }
       });


        //anniversary button function--------------------------------------------------------------------
        anniversaryBtn = findViewById(R.id.anniversaryButton);
        anniversaryBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"Card Option Not Included in Prototype", Toast.LENGTH_SHORT).show(); //pop up message
                //startActivity(new Intent(ChooseOccasion.this,AnniversaryWelcomeScreen.class));
            }
        });




    } //oncreate
}//class