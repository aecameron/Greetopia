// file for different database set up not currently used on this version


package com.prog.greetopiaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {

    private static final String TAG = "Database";

    // creating a constructor for our database handler.
    public Database(@Nullable Context context) {
        super(context, "myDatabase.db", null, 21);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists mytable (id integer primary key autoincrement, name text, age text)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("drop table if exists mytable");
        onCreate(db);
    }

    public void insertData(Data data) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", data.getName());
        contentValues.put("age", data.getAge());
        long mytable = sqLiteDatabase.insert("mytable", null, contentValues);
        Log.e(TAG, "insertData: " + mytable);
    }

    //retrieving data method
    public Cursor fetchAllData() {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from  mytable", null, null);
        while (cursor.moveToNext()){
            Log.e(TAG, "fetchAllData: name is: "+cursor.getString(1)+ " and age is: " +cursor.getString(2));
        }
        return cursor;
    }


    //delete data
//    public void deleteData() {
//        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
//        sqLiteDatabase.delete();
//    }
}
//    public void fetchAllData(){
//        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
//        Cursor cursor = sqLiteDatabase.rawQuery("select * from  mytable", null, null);
//        while (cursor.moveToNext()){
//            Log.e(TAG, "fetchAllData: name is: "+cursor.getString(1)+ " and age is: " +cursor.getString(2));
//        }
//        cursor.close();
//    }


//  code for different database set up not currently used on this version
//    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        String qry1 = "create table userbirthday(name text, age text)";
//        sqLiteDatabase.execSQL(qry1);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//    }
//
//    //explicit function
//    public void makecard(String name, String age){
//        ContentValues cv = new ContentValues();
//
//        //pass values in
//        cv.put("name",name);
//        cv.put("age",age);
//
//        //create database
//        SQLiteDatabase db = getWritableDatabase();
//        db.insert("userbirthday", null,cv);
//        db.close();
//
//    }


//package com.prog.greetopiaapp;
//
//        import android.content.ContentValues;
//        import android.content.Context;
//        import android.database.Cursor;
//        import android.database.sqlite.SQLiteDatabase;
//        import android.database.sqlite.SQLiteOpenHelper;
//
//        import androidx.annotation.Nullable;
//
//        import java.util.ArrayList;
//
//public class Database extends SQLiteOpenHelper {
//
//    // creating a constant variables for our database.
//    // below variable is for our database name.
//    private static final String DB_NAME = "birthdays";
//
//    // below int is our database version
//    private static final int DB_VERSION = 1;
//
//    // below variable is for our table name.
//    private static final String TABLE_NAME = "userbirthday";
//
////    // below variable is for our id column.
////    private static final String ID_COL = "id";
//
//    // below variable is for our course name column
//    private static final String NAME_COL = "name";
//
//
//    // below variable for our age column.
//    private static final String AGE_COL = "age";
//
//
//    // creating a constructor for our database handler.
//    public Database(Context context) {
//        super(context, DB_NAME, null, DB_VERSION);
//    }
//
//    // below method is for creating a database by running a sqlite query
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        // on below line we are creating
//        // an sqlite query and we are
//        // setting our column names
//        // along with their data types.
//        String query = "CREATE TABLE " + TABLE_NAME + " ("
//                + NAME_COL + " TEXT,"
//                + AGE_COL + " TEXT)";
//
//        // at last we are calling a exec sql
//        // method to execute above sql query
//        db.execSQL(query);
//    }
//
//    // this method is use to add new course to our sqlite database.
//    public void addBirthday(String name, String age) {
//        // on below line we are creating a variable for
//        // our sqlite database and calling writable method
//        // as we are writing data in our database.
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        // on below line we are creating a
//        // variable for content values.
//        ContentValues values = new ContentValues();
//
//        // on below line we are passing all values
//        // along with its key and value pair.
//        values.put(NAME_COL, name);
//        values.put(AGE_COL, age);
//
//        // after adding all values we are passing
//        // content values to our table.
//        db.insert(TABLE_NAME, null, values);
//
//        // at last we are closing our
//        // database after adding database.
//        db.close();
//    }
//
//
//    //method for reading all the birthdays out of database
//    public ArrayList<BirthdayModal> readCourses() {
//        // on below line we are creating a
//        // database for reading our database.
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        // on below line we are creating a cursor with query to read data from database.
//        Cursor cursorBirthdays = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
//
//        // on below line we are creating a new array list.
//        ArrayList<BirthdayModal> birthdayModalArrayList = new ArrayList<>();
//
//        // moving our cursor to first position.
//        if (cursorBirthdays.moveToFirst()) {
//            do {
//                // on below line we are adding the data from cursor to our array list.
//                birthdayModalArrayList.add(new BirthdayModal(cursorBirthdays.getString(0),
//                        cursorBirthdays.getString(1)));
//            } while (cursorBirthdays.moveToNext());
//            // moving our cursor to next.
//        }
//        // at last closing our cursor
//        // and returning our array list.
//        cursorBirthdays.close();
//        return birthdayModalArrayList;
//    }
//
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        // this method is called to check if the table exists already.
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
//
//
//
//
//
//
////    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
////        super(context, name, factory, version);
////    }
////
////    @Override
////    public void onCreate(SQLiteDatabase sqLiteDatabase) {
////        String qry1 = "create table userbirthday(name text, age text)";
////        sqLiteDatabase.execSQL(qry1);
////    }
////
////    @Override
////    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
////    }
////
////    //explicit function
////    public void makecard(String name, String age){
////        ContentValues cv = new ContentValues();
////
////        //pass values in
////        cv.put("name",name);
////        cv.put("age",age);
////
////        //create database
////        SQLiteDatabase db = getWritableDatabase();
////        db.insert("userbirthday", null,cv);
////        db.close();
////
////    }
//}