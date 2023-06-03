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

public class sk_izmirTatliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmir_tatli);

        getSupportActionBar().setTitle("İZMİR YÖRESEL TATLILARI");

       ListView listView=findViewById(R.id.listvieW);
        List<String> list=new ArrayList<>();
        list.add("ŞAMBALİ");
        list.add("İZMİR LOKMA ");
        list.add("SAMSADES");
        list.add("LORLU KURABİYE");
        list.add("ALAÇATI KURABİYE");
        list.add("İZMİR BOMBA ");
        ArrayAdapter arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    startActivity(new Intent(sk_izmirTatliActivity.this, sk_SambaliActivity.class));
                } else if (i==1) {
                    startActivity(new Intent(sk_izmirTatliActivity.this, sk_LokmaActivity.class));
                } else if (i==2) {
                    startActivity(new Intent(sk_izmirTatliActivity.this, sk_SamsedesActivity.class));
                }
                else if(i==3){
                    startActivity(new Intent(sk_izmirTatliActivity.this, sk_LorluKurabiyeActivity.class));
                } else if (i==4) {
                    startActivity(new Intent(sk_izmirTatliActivity.this, sk_DamlaSakizActivity.class));
                } else if (i==5) {
                    startActivity(new Intent(sk_izmirTatliActivity.this, sk_BombaActivity.class));
                }

            }
        });

    }
}