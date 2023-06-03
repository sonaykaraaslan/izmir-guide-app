package com.example.anamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class sk_izmirYemekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmir_yemek);

        getSupportActionBar().setTitle("İZMİR YÖRESEL YEMEKLERİ");

        ListView listView=findViewById(R.id.listvieW);
        List<String> list=new ArrayList<>();
        list.add("İZMİR KÖFTESİ");
        list.add("BOYOZ");
        list.add("YANIK MANTI");
        list.add("ETLİ EKMEK DOLMASI   ");
        list.add("ZEYTİNYAĞLI DENİZ BÖRÜLCESİ");
        list.add("SÜTLÜ DİLBALIĞI");
        ArrayAdapter arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    startActivity(new Intent(sk_izmirYemekActivity.this, sk_izmirKoftesiActivity.class));
                } else if (i==1) {
                    startActivity(new Intent(sk_izmirYemekActivity.this, sk_BoyozActivity.class));
                } else if (i==2) {
                    startActivity(new Intent(sk_izmirYemekActivity.this, sk_YanikMantiActivity.class));
                }
                else if(i==3){
                    startActivity(new Intent(sk_izmirYemekActivity.this, sk_EtliEkmekActivity.class));
                } else if (i==4) {
                    startActivity(new Intent(sk_izmirYemekActivity.this, sk_ZeytinyagliActivity.class));
                } else if (i==5) {
                    startActivity(new Intent(sk_izmirYemekActivity.this, sk_SutluDilActivity.class));
                }

            }
        });


    }
}