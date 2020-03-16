package com.example.assignmentsadiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity implements View.OnClickListener{
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        back = (Button)findViewById(R.id.BACKID) ;
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(login.this, Relative.class);
        startActivity(intent);

    }
}
