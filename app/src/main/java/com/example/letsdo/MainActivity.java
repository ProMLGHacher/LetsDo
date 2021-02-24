package com.example.letsdo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView taskGroupsRV;
    static ArrayList<String> rvAdapterValuesList = new ArrayList<>();
    RVAdapter adapter;
    String newTaskGroupName;
    CreateNewTaskGroupBottomSheetDialogFragment fragment;

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
        fragment = new CreateNewTaskGroupBottomSheetDialogFragment();
        fragment.show(getSupportFragmentManager(), "CREATE_NEW_TASK_GROUP");
//        fragment.setSelectedTrue();
    }

    public void createNewTaskGroupFromFragment(View view) {

        newTaskGroupName = fragment.getTextFromEditText();


        if (newTaskGroupName != null & !newTaskGroupName.equals("")) {
            String add = newTaskGroupName + "\n" + " ";
            rvAdapterValuesList.add(add);
            adapter.notifyDataSetChanged();
            fragment.dismiss();
        }
    }

    public void moveOnTaskActivity(View view) {
        Intent intent = new Intent(MainActivity.this, OnTask.class);
        int id = view.getId();
        intent.putExtra("activityName", "id" + id);
        startActivity(intent);
    }
}