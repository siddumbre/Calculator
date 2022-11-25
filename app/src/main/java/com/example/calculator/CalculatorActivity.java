package com.example.calculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity{


    ArrayList<String> buttontext= new ArrayList<>();
    EditText editText;
    TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        ActionBar actionBar=getSupportActionBar();
        GridView gridView=findViewById(R.id.grid);
        result_tv=findViewById(R.id.result);
        editText=findViewById(R.id.edit_text);
        ButtonAdapter buttonItemAdapter= new ButtonAdapter(buttontext,this);
        gridView.setAdapter(buttonItemAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                editText.setText(buttontext.get(position));
                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_LONG).show();
                result_tv.setText(buttontext.get(position));
            }
        });
    }

    public void addData(){
        buttontext.add("C");
        buttontext.add("(");
        buttontext.add(")");
        buttontext.add("/");
        buttontext.add("7");
        buttontext.add("8");
        buttontext.add("9");
        buttontext.add("*");
        buttontext.add("4");
        buttontext.add("5");
        buttontext.add("6");
        buttontext.add("+");
        buttontext.add("1");
        buttontext.add("2");
        buttontext.add("3");
        buttontext.add("-");
        buttontext.add("AC");
        buttontext.add("0");
        buttontext.add(".");
        buttontext.add("=");
    }

}