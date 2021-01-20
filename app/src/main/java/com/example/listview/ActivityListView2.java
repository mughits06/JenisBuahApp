package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityListView2 extends AppCompatActivity {

    ListView listView2;


    String[] judulList2 = {
            "indomie rendang",
            "indomie cabe ijo",
            "indomie ayam geprek",
            "indomie biasa",
            "indomie pedas",
            "indomie rica raca",
            "indomie sambal matah"
    };

    Integer[] gambarList2 = {
            R.drawable.rendang,
            R.drawable.ijo,
            R.drawable.ayamgeprek,
            R.drawable.biasa1,
            R.drawable.pedas,
            R.drawable.rica,
            R.drawable.matah
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        listView2 = findViewById(R.id.listView2);

        CustomListAdapter2 adapter = new CustomListAdapter2(this, judulList2, gambarList2);
        listView2.setAdapter(adapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int positon, long id) {
                Toast.makeText(getApplicationContext(), "anda memilih :" + judulList2[positon], Toast.LENGTH_SHORT).show();


            }
        });
    }
}
