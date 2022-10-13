package com.gin.tema3;

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
        
        EditText user = (EditText) findViewById(R.id.etuser);
        EditText password = (EditText) findViewById(R.id.etpassword);
        
        Button myButton = (Button) findViewById(R.id.buttonOpenActivity2);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("user", user.getText().toString());
                i.putExtra("password", password.getText().toString());
                startActivity(i);
            }
        });
    }
}