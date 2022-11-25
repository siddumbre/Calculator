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
        ViewHolder viewHolder = new ViewHolder();
        view=View.inflate(activity,R.layout.btn_layout,null);
//        Button title = view.findViewById(R.id.title);
        viewHolder.title=(TextView) view.findViewById(R.id.title);
        view.setTag(viewHolder);
        viewHolder=(ViewHolder)view.getTag();
        viewHolder.title.setText(ButtonText.get(i));
        if(ButtonText.get(i).contains("C")){
            viewHolder.title.setTextColor(view.getResources().getColor(R.color.orange));
        }
//        title.setText(ButtonText.get(i));
        return view;
    }

    private static class ViewHolder{
        public TextView title;
    }
}
