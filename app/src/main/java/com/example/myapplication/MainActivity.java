package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView namaView, umurView, alamatView;
    private CardView cardView;
    private Intent newIntent;
    private FloatingActionButton  floatingbutton;
    private RecyclerView recyclerView;
    private EditText namaAdd, umurAdd, alamatAdd;
    rvAdapter adapter;
    static ArrayList<User> dataUser = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaView = findViewById(R.id.namaView);
        umurView = findViewById(R.id.umurView);
        alamatView = findViewById(R.id.alamatView);
        floatingbutton = findViewById(R.id.floatingbutton);
        recyclerView = findViewById(R.id.recyclerView );

        initView();
        setupRecyclerView();
        User user = new User("hi","hi","hi");
        dataUser.add(user);

        floatingbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,add_user.class);
                startActivity(intent);
            }

        });
    }

    private void setupRecyclerView() {
        RecyclerView.LayoutManager mgr = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(mgr);
        recyclerView.setAdapter(adapter);
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new rvAdapter(dataUser);
    }
}