package com.example.visitorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Button b1,b2;
    String getFn,getLn,getPr,getWm;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.fn);
        ed2=(EditText) findViewById(R.id.ln);
        ed3=(EditText) findViewById(R.id.pr);
        ed4=(EditText) findViewById(R.id.wm);
        b1=(Button) findViewById(R.id.submit);
        b2=(Button)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFn = ed1.getText().toString();
                getLn = ed2.getText().toString();
                getPr = ed3.getText().toString();
                getWm = ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getFn+" "+getLn+" "+getPr+" "+getWm, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob = new Intent(getApplicationContext(), Menu.class);
                startActivity(ob);

            }
        });


    }
}