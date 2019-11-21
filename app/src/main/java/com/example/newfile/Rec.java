package com.example.newfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Rec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        EditText editText = (EditText)findViewById(R.id.rec);
        editText.getText().toString();
        editText.setText(data);
    }
}
