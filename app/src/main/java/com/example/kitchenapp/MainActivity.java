package com.example.kitchenapp;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.kitchenapp.MESSAGE";
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = findViewById(R.id.btn);

        CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);
        checkBox5 = findViewById(R.id.checkbox5);
        checkBox6 = findViewById(R.id.checkbox6);
        checkBox7 = findViewById(R.id.checkbox7);
        checkBox8 = findViewById(R.id.checkbox8);
        checkBox9 = findViewById(R.id.checkbox9);



        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Bundle bundle = new Bundle();

                if (checkBox1.isChecked()){
                    bundle.putString("message1",checkBox1.getText().toString().trim());}
                if (checkBox2.isChecked()){
                    bundle.putString("message2",checkBox2.getText().toString().trim());}
                if (checkBox3.isChecked()){
                    bundle.putString("message3",checkBox3.getText().toString().trim());}
                if (checkBox4.isChecked()){
                    bundle.putString("message4",checkBox4.getText().toString().trim());}
                if (checkBox5.isChecked()){
                    bundle.putString("message5",checkBox5.getText().toString().trim());}
                if (checkBox6.isChecked()){
                    bundle.putString("message6",checkBox6.getText().toString().trim());}
                if (checkBox7.isChecked()){
                    bundle.putString("message7",checkBox7.getText().toString().trim());}
                if (checkBox8.isChecked()){
                    bundle.putString("message8",checkBox8.getText().toString().trim());}
                if (checkBox9.isChecked()){
                    bundle.putString("message9",checkBox9.getText().toString().trim());}


                startActivity(new Intent(MainActivity.this, Billing.class).putExtras(bundle));

            }

        });

    }
}


