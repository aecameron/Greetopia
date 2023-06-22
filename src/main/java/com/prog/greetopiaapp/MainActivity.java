package com.prog.greetopiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get started button function
        btn = findViewById(R.id.getstartedbutton);
        btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                   //Toast.makeText(getApplicationContext(),"Let's create some cards", Toast.LENGTH_SHORT).show(); //pop up message
                    startActivity(new Intent(MainActivity.this,ChooseOccasion.class));
                }
        });
    }
}