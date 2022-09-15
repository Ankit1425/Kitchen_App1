package com.example.kitchenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Billing extends AppCompatActivity {
    int Sum =0;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);
        Button sms = findViewById(R.id.sms);
        Bundle bundle = getIntent().getExtras();

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:9696117951");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", Sum);
                startActivity(intent);
            }
        });

        if (bundle.getString("message1") != null) {
            TextView data = findViewById(R.id.textView1);
            TextView r = findViewById(R.id.rate1);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message1");
            data.append(message);
            r.append("20/-");
            Sum = Sum + 20;
        }
        if (bundle.getString("message2") != null) {
            TextView data = findViewById(R.id.textView2);
            TextView r = findViewById(R.id.rate2);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message2");
            data.append(message);
            r.append("30/-");
            Sum = Sum + 30;

        }
        if (bundle.getString("message3") != null) {
            TextView data = findViewById(R.id.textView3);
            TextView r = findViewById(R.id.rate3);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message3");
            data.append(message);
            r.append("40/-");
            Sum = Sum + 40;

        }
        if (bundle.getString("message4") != null) {
            TextView data = findViewById(R.id.textView4);
            TextView r = findViewById(R.id.rate4);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message4");
            data.append(message);
            r.append("50/-");
            Sum = Sum + 50;

        }
        if (bundle.getString("message5") != null) {
            TextView data = findViewById(R.id.textView5);
            TextView r = findViewById(R.id.rate5);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message5");
            data.append(message);
            r.append("60/-");
            Sum = Sum + 60;

        }
        if (bundle.getString("message6") != null) {
            TextView data = findViewById(R.id.textView6);
            TextView r = findViewById(R.id.rate6);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message6");
            data.append(message);
            r.append("70/-");
            Sum = Sum + 70;

        }
        if (bundle.getString("message7") != null) {
            TextView data = findViewById(R.id.textView7);
            TextView r = findViewById(R.id.rate7);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message7");
            data.append(message);
            r.append("80/-");
            Sum = Sum + 80;

        }
        if (bundle.getString("message8") != null) {
            TextView data = findViewById(R.id.textView8);
            TextView r = findViewById(R.id.rate8);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message8");
            data.append(message);
            r.append("90/-");
            Sum = Sum + 90;

        }
        if (bundle.getString("message9") != null) {
            TextView data = findViewById(R.id.textView9);
            TextView r = findViewById(R.id.rate9);
            data.setVisibility(View.VISIBLE);
            r.setVisibility(View.VISIBLE);
            String message = bundle.getString("message9");
            data.append(message);
            r.append("100/-");
            Sum = Sum + 100;

        }


        TextView data = findViewById(R.id.total_name);
        TextView r = findViewById(R.id.total);
        data.setVisibility(View.VISIBLE);
        r.setVisibility(View.VISIBLE);
        r.setText(String.valueOf(Sum)+"/-");

    }
    }

