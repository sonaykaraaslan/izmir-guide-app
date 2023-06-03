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

public class sk_izmirTarihYerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sk_activity_izmir_tarih_yer);

        getSupportActionBar().setTitle("İZMİR TARİHİ YERLER");

        ListView listView=findViewById(R.id.listvieW);
        List<String>list=new ArrayList<>();
        list.add("AGORA");
        list.add("SMYRNA (TEPEKULE-BAYRAKLI)");
        list.add("EFES ANTİK KENTİ (SELÇUK)");
        list.add("PERGAMON (BERGAMA)");
        list.add("KIZIL AVLU (BERGAMA)");
        list.add("ERYTHRAİ (ÇEŞME)");
        ArrayAdapter arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    startActivity(new Intent(sk_izmirTarihYerActivity.this, sk_AgoraActivity.class));
                } else if (i==1) {
                    startActivity(new Intent(sk_izmirTarihYerActivity.this, sk_SmyrnaActivity.class));
                } else if (i==2) {
                    startActivity(new Intent(sk_izmirTarihYerActivity.this, sk_EfesActivity.class));
                } else if (i==3) {
                    startActivity(new Intent(sk_izmirTarihYerActivity.this, sk_PergamonActivity.class));
                } else if (i==4) {
                    startActivity(new Intent(sk_izmirTarihYerActivity.this, sk_kizilAvluActivity.class));
                } else if (i==5) {
                    startActivity(new Intent(sk_izmirTarihYerActivity.this, sk_ErythraiActivity.class));
                }
            }
        });
    }
}