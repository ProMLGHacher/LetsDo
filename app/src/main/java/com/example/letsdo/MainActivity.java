package com.example.letsdo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView taskGroupsRV;
    static ArrayList<String> rvAdapterValuesList = new ArrayList<>();
    RVAdapter adapter;
    String newTaskGroupName = "lol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new RVAdapter(MainActivity.this);

        taskGroupsRV = findViewById(R.id.taskGroupsRV);
        taskGroupsRV.setLayoutManager(linearLayoutManager);
        taskGroupsRV.setAdapter(adapter);




    }

    public void createNewTaskGroup(View view) {
        String add = newTaskGroupName + "\n" + " ";
        rvAdapterValuesList.add(add);
        adapter.notifyDataSetChanged();
    }

}