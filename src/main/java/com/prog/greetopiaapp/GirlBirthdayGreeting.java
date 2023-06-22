package com.prog.greetopiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Locale;

public class GirlBirthdayGreeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_birthday_greeting);


        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String name = sharedpreferences.getString("name", "").toString();
        String age = sharedpreferences.getString("age", "").toString();

        Toast.makeText(getApplicationContext(), "Welcome " +name+ " you are "  +age, Toast.LENGTH_SHORT).show(); //pop up message to test if data is coming through

    }
}