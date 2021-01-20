package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;

public class ActivityListView extends AppCompatActivity {
    ListView listView;
    //data yang akan digunakan
    //tipe data string yang berbentuk text
    String[] judulLIst = {
            "alpukat",
            "apel",
            "ceri",
            "durian",
            "jambu air",
            "manggis",
            "strawberry"
    };
    // tipe data Intereger untuk data yang berbentuk gambar atau angka
    Integer[] gambarList = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry
    };

    int[] list_musik = {
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //dekrarasi listview
        listView = findViewById(R.id.listview);

        //memanggil Adapter untuk memunculkan data
        CustomListAdapter adapter = new CustomListAdapter(this, judulLIst, gambarList);
        listView.setAdapter(adapter);

        //perintah agar data dalam bentuk list bisa di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int positon, long id) {
                //toast untuk membuat pesan singkat
                Toast.makeText(getApplicationContext(),"anda memilih :"+ judulLIst[positon],Toast.LENGTH_SHORT).show();

                //Uri untuk media player
                Uri myUri = Uri.parse("android.resource://" + getPackageName() + "/" +  list_musik[positon]);
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mediaPlayer.setDataSource(getApplicationContext(), myUri);
                }catch (IOException e){
                    e.printStackTrace();
                }
                try {
                    mediaPlayer.prepare();
                }catch (IOException e){
                    e.printStackTrace();
                }
                mediaPlayer.start();
            }
        });
    }



    }

