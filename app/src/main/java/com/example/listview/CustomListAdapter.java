package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] judulList;
    private final Integer[] gambarList;



    public CustomListAdapter(Activity context, String[] judulList, Integer[] gambarList)  {
        super(context, R.layout.row_item,judulList);
        this.context = context;
        this.judulList = judulList;
        this.gambarList = gambarList;
    }
    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater inflater = context.getLayoutInflater();
        //memanggil layout untuk datanya
        View rowView = inflater.inflate(R.layout.row_item,null,true);

        //menegenalkan widget - widget dari layout yang kita panggil
        TextView txtList = rowView.findViewById(R.id.txt_list);
        ImageView imageList = rowView.findViewById(R.id.image_list);


        //mensinkronisasi dengan model yang dibuat
        txtList.setText(judulList[position]);

        imageList.setImageResource(gambarList[position]);


        return rowView;


    }

}

