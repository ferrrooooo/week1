package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class add_user extends AppCompatActivity {
    private EditText namaAdd, umurAdd, alamatAdd;
    private Button simpan;
    private ArrayList<User> dataUser;

    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.add_user);
        initView();
        buttonclick();
    }
    private void buttonclick(){

    }
        private void initView() {
        namaAdd = findViewById(R.id.namaAdd);
        umurAdd = findViewById(R.id.umurAdd);
        alamatAdd = findViewById(R.id.alamatAdd);
        simpan = findViewById(R.id.simpan);
    }
}
