package com.example.assignmentsadiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Frame extends AppCompatActivity implements View.OnClickListener {
Button back;
ImageView pic1,pic2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        back = (Button)findViewById(R.id.backID);
        pic1=(ImageView)findViewById(R.id.pic1ID);
        pic2=(ImageView)findViewById(R.id.pic2ID);
        pic1.setOnClickListener(this);
        pic2.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.backID){
        Intent intent = new Intent(Frame.this,MainActivity.class);
        startActivity(intent);
        }
         if (v.getId()==R.id.pic1ID){

            pic1.setVisibility(View.GONE);
            pic2.setVisibility(View.VISIBLE);
        }


         if (v.getId()==R.id.pic2ID){

            pic2.setVisibility(View.GONE);
            pic1.setVisibility(View.VISIBLE);
        }
    }
}
