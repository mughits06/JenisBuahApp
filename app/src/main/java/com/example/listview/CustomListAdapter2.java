package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter2 extends ArrayAdapter<String> {
    private final Activity context2;
    private final String[] judulList2;
    private final Integer[] gambarList2;


    public CustomListAdapter2(Activity context1, String[] judulList1, Integer[] gambarList1 ){
        super(context1, R.layout.row_item_1,judulList1);
        this.context2 = context1;
        this.judulList2 = judulList1;
        this.gambarList2 = gambarList1;
    }

    public View getView(int postion, View view, ViewGroup viewGroup){
        LayoutInflater inflater = context2.getLayoutInflater();

        View rowView1 = inflater.inflate(R.layout.row_item_1,null,true);


        TextView txtList1 = rowView1.findViewById(R.id.txt_list1);
        ImageView imgList1 = rowView1.findViewById(R.id.image_list1);

        txtList1.setText(judulList2[postion]);
        imgList1.setImageResource(gambarList2[postion]);

        return rowView1;
    }
}
