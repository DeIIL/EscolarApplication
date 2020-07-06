package com.example.escolarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText urlogin, urpassword;
    Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urlogin = (EditText)findViewById(R.id.editTextLogin);
        urpassword = (EditText)findViewById(R.id.editTextPassword);
        clk = (Button)findViewById(R.id.btnLogin);
    }

    public void movepage(View view)

    {
        String stlogin = urlogin.getText().toString();
        String stpassword = urlogin.getText().toString();

        if(stlogin.equals("Jacinto Pinto") && stpassword.equals("9876543210"))
        {
            Intent in = new Intent(MainActivity.this,ActivityNote.class);
            startActivity(in);
        }

        else if()
            {

            }

    }

}