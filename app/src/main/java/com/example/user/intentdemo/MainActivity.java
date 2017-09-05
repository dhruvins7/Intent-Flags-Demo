package com.example.user.intentdemo;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

import static com.example.user.intentdemo.OnClickClass.click;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String s;
    private HashMap<String, Integer> intentFlagValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> spinnerIntentArrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.intents));
        String intentValue = "";
        s = "";
        spinner.setAdapter(spinnerIntentArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                s = "null";
            }
        });
        intentFlagValue = new HashMap<>();

        intentFlagValue.put("Intent.FLAG_ACTIVITY_CLEAR_TOP", Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intentFlagValue.put("Intent.FLAG_ACTIVITY_REORDER_TO_FRONT", Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intentFlagValue.put("Intent.FLAG_ACTIVITY_NO_HISTORY", Intent.FLAG_ACTIVITY_NO_HISTORY);
        intentFlagValue.put("Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP", Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intentFlagValue.put("Intent.FLAG_ACTIVITY_SINGLE_TOP", Intent.FLAG_ACTIVITY_SINGLE_TOP);

        TextView tv1 = (TextView) findViewById(R.id.textView);
        Button button1 = (Button) findViewById(R.id.button8);
        tv1.setText("Activity1");
        Button button2 = (Button) findViewById(R.id.button9);
        Button button3 = (Button) findViewById(R.id.button10);
        Button button4 = (Button) findViewById(R.id.button11);
        Button button5 = (Button) findViewById(R.id.button12);
        Button button6 = (Button) findViewById(R.id.button13);
        Button button7 = (Button) findViewById(R.id.button14);
        Button button8 = (Button) findViewById(R.id.button15);
        Button button9 = (Button) findViewById(R.id.button16);

        intentFlagValue.put("null", 0);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = ;
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intentFlag = intentFlagValue.get(s);
                click(MainActivity.this, button1.getId(), intentFlag);
            }
        });*/


    }

    @Override
    public void onClick(View v) {
        OnClickClass.click(this, v.getId(), intentFlagValue.get(s));
    }
}