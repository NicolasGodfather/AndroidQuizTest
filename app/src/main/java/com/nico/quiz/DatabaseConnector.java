package com.nico.quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nicolas on 03.03.2017.
 */

public class DatabaseConnector
{
    // database name
    private static final String DATABASE_NAME = "Userusers";

    private SQLiteDatabase database; // for interacting with the database
    private DatabaseOpenHelper databaseOpenHelper; // creates the database

    public DatabaseConnector(Context context)
    {
        databaseOpenHelper = new DatabaseOpenHelper(context, DATABASE_NAME, null, 1);
    }

    public void openConnection() throws SQLException
    {
        // create or open a database for reading/writing
        database = databaseOpenHelper.getWritableDatabase();
    }

    public void closeConnection()
    {
        if (database != null)
            database.close();
    }

    // inserts a new User in the database
    public long insertUser(String name, String points)
    {
        ContentValues newUser = new ContentValues();
        newUser.put("name", name);
        newUser.put("points", points);

        openConnection();
        long rowID = database.insert("users", null, newUser);
        closeConnection();
        return rowID;
    }

    public void updateUser(long id, String name, String points)
    {
        ContentValues editUser = new ContentValues();
        editUser.put("name", name);
        editUser.put("points", points);

        openConnection();
        database.update("users", editUser, "_id=" + id,  null);
        closeConnection();
    }

    public Cursor getAllUsers()
    {
        return database.query("users", new String[] {"_id", "name"},
                null, null, null, null, "name");
    }

    // return a Cursor containing specified User's information
    public Cursor getOneUser(long id)
    {
        return database.query(
                "users", null, "_id=" + id, null, null, null, null);
    }


    // **** DB ****
    private class DatabaseOpenHelper extends SQLiteOpenHelper
    {
        public DatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
        {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            String createQuery = "CREATE TABLE users" +
                    "(_id integer primary key autoincrement," +
                    "place TEXT, name TEXT, points TEXT);";

            db.execSQL(createQuery);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
        {
        }
    }
}
