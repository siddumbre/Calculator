package com.example.calculator;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ButtonAdapter extends BaseAdapter {
    ArrayList<String> ButtonText;
    Activity activity;
    public ButtonAdapter(ArrayList<String> ButtonText, Activity activity){
        this.ButtonText=ButtonText;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return ButtonText.size();
    }

    @Override
    public Object getItem(int position) {
        return ButtonText.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Long.valueOf(position);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(activity,R.layout.btn_layout,null);
        Button title = view.findViewById(R.id.title);
        title.setText(ButtonText.get(i));
        return view;
    }
}
