package com.example.assignmentsadiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Absolute extends AppCompatActivity implements View.OnClickListener{

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute);
        back=(Button)findViewById(R.id.backabsID);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Absolute.this,MainActivity.class);
        startActivity(intent);

    }
}
