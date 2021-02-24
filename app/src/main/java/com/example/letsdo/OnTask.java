package com.example.letsdo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class OnTask extends AppCompatActivity {

    private static String BD_NAME;

    int taskId;
    String taskContent;
    int count = 2892348;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_task);

        BD_NAME = getIntent().getStringExtra("activityName");

        String create_table_if_not_exist = "CREATE TABLE IF NOT EXISTS " + BD_NAME + " (taskContent TEXT)";
        String insert_into = "INSERT INTO " + BD_NAME + " VALUES ('" + "ojubfgir" + "')";
        String select_from_all = "SELECT * FROM " + BD_NAME;

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL(create_table_if_not_exist);
        db.execSQL(insert_into);

        Cursor query = db.rawQuery(select_from_all, null);

        if (query.moveToFirst()) {
            taskContent = query.getString(0) + "\n";
        }

        while (query.moveToNext()) {
            taskContent += query.getString(0) + "'\n";
        }

        TextView textView = findViewById(R.id.textView827346587423);
        textView.setText(taskContent);
    }
}