package com.prog.greetopiaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BoyBirthdayGreeting extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_birthday_greeting);

        //fetch data and add it to text view
//        Database database = new Database(this);
//        TextView textView = findViewById(R.id.agetextview);
//
//        Cursor cursor = database.fetchAllData();
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(cursor.getString(0));
//
//        textView.setText(stringBuilder);



//        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
//        String recipientName = sharedpreferences.getString("recipientName", "");
//        String recipientAge = sharedpreferences.getString("recipientAge", "");
//
//        Toast.makeText(getApplicationContext(), "Welcome " +recipientName+ " you are "  +recipientAge, Toast.LENGTH_SHORT).show(); //pop up message to test if data is coming through


    }
}

//    package com.prog.greetopiaapp;
//
//        import androidx.appcompat.app.AppCompatActivity;
//        import androidx.recyclerview.widget.LinearLayoutManager;
//        import androidx.recyclerview.widget.RecyclerView;
//
//        import android.content.Context;
//        import android.content.SharedPreferences;
//        import android.os.Bundle;
//        import android.widget.TextView;
//        import android.widget.Toast;
//
//        import java.util.ArrayList;
//
//public class BoyBirthdayGreeting extends AppCompatActivity {
//
//    // creating variables for our array list,
//    // dbhandler, adapter and recycler view.
//    private ArrayList<BirthdayModal> birthdayModalArrayList;
//    private Database database;
//    private BirthdayRVAdapter birthdayRVAdapter;
//    private RecyclerView birthdayRV;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_boy_birthday_greeting);
//
//        // initializing our all variables.
//        birthdayModalArrayList = new ArrayList<>();
//        database = new Database(BoyBirthdayGreeting.this);
//
//        // getting our course array
//        // list from db handler class.
//        birthdayModalArrayList = database.readCourses();
//
//        // on below line passing our array list to our adapter class.
//        birthdayRVAdapter = new BirthdayRVAdapter(birthdayModalArrayList, BoyBirthdayGreeting.this);
//        birthdayRV = findViewById(R.id.idRVBirthday);
//
//        // setting layout manager for our recycler view.
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BoyBirthdayGreeting.this, RecyclerView.VERTICAL, false);
//        birthdayRV.setLayoutManager(linearLayoutManager);
//
//        // setting our adapter to recycler view.
//        birthdayRV.setAdapter(birthdayRVAdapter);
//
//
////        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
////        String recipientName = sharedpreferences.getString("recipientName", "");
////        String recipientAge = sharedpreferences.getString("recipientAge", "");
////
////        Toast.makeText(getApplicationContext(), "Welcome " +recipientName+ " you are "  +recipientAge, Toast.LENGTH_SHORT).show(); //pop up message to test if data is coming through
//
//
//    }
//}