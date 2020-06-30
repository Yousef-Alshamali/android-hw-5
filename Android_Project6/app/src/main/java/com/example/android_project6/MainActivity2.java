package com.example.android_project6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView name_textview = findViewById(R.id.textview10);
        final TextView age_textview = findViewById(R.id.textview11);
        final TextView yourjob_textview = findViewById(R.id.textview3);
        final TextView phonenumber_textview = findViewById(R.id.textview4);
        final TextView email_textview = findViewById(R.id.textview5);
        Button x = findViewById(R.id.button);


        Bundle b = getIntent().getExtras();
        String name = b.getString("data1");
        String age = b.getString("data2");
        String yourjob = b.getString("data3");
        String phonenumber = b.getString("data4");
        String email = b.getString("data5");
        name_textview.setText("Username: " + name);
        age_textview.setText("Age: " + age);
        yourjob_textview.setText("Your job: " + yourjob);
        phonenumber_textview.setText("Phone number: " + phonenumber);
        email_textview.setText("Email: " + email);


        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}