package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    ArrayList<String> buttontext= new ArrayList<>();
    EditText editText;
    TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        GridView gridView=findViewById(R.id.grid);
        result_tv=findViewById(R.id.result);
        editText=findViewById(R.id.edit_text);
        ButtonAdapter buttonItemAdapter= new ButtonAdapter(buttontext,this);
        gridView.setAdapter(buttonItemAdapter);
        gridView.setOnItemClickListener(this);
    }

    public void addData(){
        buttontext.add("C");
        buttontext.add("(");
        buttontext.add(")");
        buttontext.add("/");
        buttontext.add("9");
        buttontext.add("8");
        buttontext.add("7");
        buttontext.add("*");
        buttontext.add("6");
        buttontext.add("5");
        buttontext.add("4");
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        editText.setText(buttontext.get(position));
        result_tv.setText(buttontext.get(position));
    }
}