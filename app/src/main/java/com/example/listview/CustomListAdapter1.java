package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter1 extends ArrayAdapter<String> {
    private final Activity context1;
    private final String[] judulList1;
    private final Integer[] gambarList1;


    public CustomListAdapter1(Activity context1, String[] judulList1, Integer[] gambarList1 ){
        super(context1, R.layout.row_item_1,judulList1);
        this.context1 = context1;
        this.judulList1 = judulList1;
        this.gambarList1 = gambarList1;
    }

    public View getView(int postion, View view, ViewGroup viewGroup){
        LayoutInflater inflater = context1.getLayoutInflater();

        View rowView1 = inflater.inflate(R.layout.row_item_1,null,true);


        TextView txtList1 = rowView1.findViewById(R.id.txt_list1);
        ImageView imgList1 = rowView1.findViewById(R.id.image_list1);

        txtList1.setText(judulList1[postion]);
        imgList1.setImageResource(gambarList1[postion]);

        return rowView1;
    }
}
