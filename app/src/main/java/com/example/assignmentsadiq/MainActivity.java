package com.example.assignmentsadiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity implements View .OnClickListener{
Button relative,table,frame,absolute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relative=(Button)findViewById(R.id.relativeID);
        table=(Button)findViewById(R.id.tableID);
        frame=(Button)findViewById(R.id.frameID);
        absolute=(Button)findViewById(R.id.absoluteID);
        relative.setOnClickListener(this);
        table.setOnClickListener(this);
        frame.setOnClickListener(this);
        absolute.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.relativeID){
        Intent intent = new Intent(MainActivity.this,Relative.class);
        startActivity(intent);}
        else if(v.getId()==R.id.tableID){
            Intent intent = new Intent(MainActivity.this,Table.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.frameID){
            Intent intent = new Intent(MainActivity.this,Frame.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.absoluteID){
            Intent intent = new Intent(MainActivity.this,Absolute.class);
            startActivity(intent);
        }

    }
}
