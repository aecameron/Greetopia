package com.prog.greetopiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class BirthdayWelcomeScreen extends AppCompatActivity {

    EditText recipientName, recipientAge;
    Button birthdayBoyBtn;
    Button birthdayGirlBtn;
    private Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_welcome_screen);

        database = new Database(getApplicationContext());
        recipientName = findViewById(R.id.recipientnametextfield);
        recipientAge = findViewById(R.id.recipientagetextfield);


       // birthday boy button function--------------------------------------------------------------
        birthdayBoyBtn = findViewById(R.id.birthdayboybutton);

        birthdayBoyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String name = recipientName.getText().toString();
                String age =  recipientAge.getText().toString();

                if(name.length()==0 || age.length()==0){
                    Toast.makeText(getApplicationContext(),"Please add name and age", Toast.LENGTH_SHORT).show(); //pop up message
                } else {

                    database.insertData(new Data(name, age));
                    database.fetchAllData();

//                    SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
//                    //create editor
//                    SharedPreferences.Editor editor = sharedpreferences.edit();
//                    //to save data into local memory w key and value
//                    editor.putString("name", name);
//                    editor.putString("age", age);
//                    editor.apply();

                    startActivity(new Intent(BirthdayWelcomeScreen.this,BoyBirthdayGreeting.class));
                }
            }
        });


       // birthday girl button function-------------------------------------------------------------
        birthdayGirlBtn = findViewById(R.id.birthdaygirlbutton);
        birthdayGirlBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Card Option Not Included in Prototype", Toast.LENGTH_SHORT).show(); //pop up message

//                String name = recipientName.getText().toString();
//                String age = recipientAge.getText().toString();
//
//                //Database db = new Database(getApplicationContext(), "birthdaydatabase", null, 1);
//
//                if (name.length() == 0 || age.length() == 0) {
//                    Toast.makeText(getApplicationContext(), "Please add name and age", Toast.LENGTH_SHORT).show(); //pop up message
//                    return;
//                } else {
//                    db.makecard(name, age);
//                    SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
//                    //create editor
//                    SharedPreferences.Editor editor = sharedpreferences.edit();
//                    //to save data into local memory w key and value
//                    editor.putString("name", name);
//                    editor.putString("age", age);
//
//                    editor.apply();
//
//                    startActivity(new Intent(BirthdayWelcomeScreen.this,GirlBirthdayGreeting.class));
                }
        });

    }//oncreate
}//class

//
//package com.prog.greetopiaapp;
//
//        import androidx.appcompat.app.AppCompatActivity;
//
//        import android.content.Context;
//        import android.content.Intent;
//        import android.content.SharedPreferences;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.Button;
//        import android.widget.EditText;
//        import android.widget.Toast;
//
//        import java.util.Locale;
//
//public class BirthdayWelcomeScreen extends AppCompatActivity {
//
//    EditText recipientName, recipientAge;
//    Button birthdayBoyBtn;
//    Button birthdayGirlBtn;
//
//    Database database;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_birthday_welcome_screen);
//
////        recipientName = findViewById(R.id.recipientnametextfield);
////        recipientAge = findViewById(R.id.recipientagetextfield);
//
//        // creating a new database class
//        // and passing our context to it.
//        database = new Database(BirthdayWelcomeScreen.this);
//
//        // below line is to add on click listener for our button.
//        birthdayBoyBtn = findViewById(R.id.birthdayboybutton);
//        birthdayBoyBtn.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                // below line is to get data from all edit text fields.
//                String recipientName = findViewById(R.id.recipientnametextfield).toString();
//                String recipientAge = findViewById(R.id.recipientagetextfield).toString();
//
//                // on below line we are calling a method to add new
//                // course to sqlite data and pass all our values to it.
//                database.addBirthday(recipientName, recipientAge);
//
//                // after adding the data we are displaying a toast message.
////                Toast.makeText(MainActivity.this, "Course has been added.", Toast.LENGTH_SHORT).show();
////                courseNameEdt.setText("");
////                courseDurationEdt.setText("");
////                courseTracksEdt.setText("");
////                courseDescriptionEdt.setText("");
//
//                SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
//                //create editor
//                SharedPreferences.Editor editor = sharedpreferences.edit();
//                //to save data into local memory w key and value
//                editor.putString("recipientName", recipientName);
//                editor.putString("recipientAge", recipientAge);
//
//                editor.apply();
//
//
//                startActivity(new Intent(BirthdayWelcomeScreen.this,BoyBirthdayGreeting.class));
//
//            }
//        });
