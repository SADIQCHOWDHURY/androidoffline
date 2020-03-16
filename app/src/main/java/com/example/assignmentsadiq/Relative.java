package com.example.assignmentsadiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Relative extends AppCompatActivity implements View.OnClickListener {
    Button back,login;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        back = (Button)findViewById(R.id.backID);
        login = (Button)findViewById(R.id.loginID);
        user = (EditText)findViewById(R.id.userID);
        pass = (EditText)findViewById(R.id.passID);

        back.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = user.getText().toString();
        String password= pass.getText().toString();
        if(v.getId()==R.id.loginID) {
            if(name.equals("sadiq") && password.equals("1234")) {

                Intent intent = new Intent(Relative.this, login.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(Relative.this, "Wrong input", Toast.LENGTH_SHORT).show();

            }
        }
        if(v.getId()==R.id.backID){

            Intent intent = new Intent(Relative.this, MainActivity.class);
            startActivity(intent);
        }

    }
}
