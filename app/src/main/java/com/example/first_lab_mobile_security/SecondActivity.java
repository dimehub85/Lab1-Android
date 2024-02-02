package com.example.first_lab_mobile_security;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    String groupMembers[] = {"Nurzhan","Ruslan", "Daniya"};

    ListView listView;

    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        listView = (ListView) findViewById(R.id.customListView);
        MyAdapter myAdapter = new MyAdapter(getApplicationContext(), groupMembers);
        listView.setAdapter(myAdapter);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
             finish();
            }
        } );

    }
}