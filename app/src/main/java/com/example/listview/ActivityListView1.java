package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityListView1 extends AppCompatActivity {

    ListView listView1;

    String[] judulList1 = {
            "wortel",
            "brokoli",
            "kentang",
            "kangkung",
            "seledri",
            "tomat",
            "kol"
    };

    Integer[] gambarList1 = {
            R.drawable.wortel,
            R.drawable.brokolo,
            R.drawable.kentang,
            R.drawable.kangkung,
            R.drawable.seledri,
            R.drawable.tomat,
            R.drawable.kol
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);

        listView1 = findViewById(R.id.listview1);

        CustomListAdapter1 adapter = new CustomListAdapter1(this, judulList1, gambarList1);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int positon, long id) {
                Toast.makeText(getApplicationContext(), "anda memilih :" + judulList1[positon], Toast.LENGTH_SHORT).show();


            }


        });
    }
}
