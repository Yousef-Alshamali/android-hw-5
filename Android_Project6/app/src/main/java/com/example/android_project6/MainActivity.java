package com.example.android_project6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name_edittext = findViewById(R.id.editTextTextPersonName1);
        final EditText age_edittext = findViewById(R.id.editTextTextPersonName2);
        final EditText yourjob_edittext = findViewById(R.id.editTextTextPersonName3);
        final EditText phonenumber_edittext = findViewById(R.id.editTextTextPersonName4);
        final EditText email_edittext = findViewById(R.id.editTextTextPersonName5);
        Button a = findViewById(R.id.button);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name_edittext.getText().toString();
                String age = age_edittext.getText().toString();
                String yourjob = yourjob_edittext.getText().toString();
                String phonenumber = phonenumber_edittext.getText().toString();
                String email = email_edittext.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("data1", name);
                i.putExtra("data2", age);
                i.putExtra("data3", yourjob);
                i.putExtra("data4", phonenumber);
                i.putExtra("data5", email);
                startActivity(i);
            }
        });

    }
}