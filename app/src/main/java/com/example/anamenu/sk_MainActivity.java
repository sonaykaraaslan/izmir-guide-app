package com.example.anamenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sk_MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu sk_menu) {
        getMenuInflater().inflate(R.menu.menu_item,sk_menu);
        return super.onCreateOptionsMenu(sk_menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem sk_item) {
        switch (sk_item.getItemId()) {
            case R.id.sk_menu_item_home:
                Toast.makeText(getApplicationContext(), "sk_Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sk_menu_item_profile:
                Toast.makeText(getApplicationContext(), "sk_Profile", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sk_menu_item_search:
                Toast.makeText(getApplicationContext(), "sk_Search", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(sk_item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sk_activity_main);
        ListView sk_listView=findViewById(R.id.listvieW);
        List<String> sk_list= new ArrayList<>();
        sk_list.add("İZMİR TARİHÇESİ");
        sk_list.add("İZMİRDE BULUNAN TARİHİ YERLER");
        sk_list.add("İZMİR YÖRESEL YEMEKLERİ");
        sk_list.add("İZMİR YÖRESEL TATLILARI");

        ArrayAdapter sk_arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,sk_list);
        sk_listView.setAdapter(sk_arrayAdapter);

        sk_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String sk_list= sk_listView.getItemAtPosition(i).toString();
                sk_listView.setSelector(R.color.sk_purple_500);
                Toast.makeText(getApplicationContext(), ""+sk_list, Toast.LENGTH_SHORT).show();


                if(i==0){

                    startActivity(new Intent(sk_MainActivity.this, sk_izmirTarihcesiActivity.class));

                } else if (i==1) {
                    startActivity(new Intent(sk_MainActivity.this, sk_izmirTarihYerActivity.class));
                }
                else if(i==2){
                    startActivity(new Intent(sk_MainActivity.this, sk_izmirYemekActivity.class));
                }
                else if(i==3){
                    startActivity(new Intent(sk_MainActivity.this, sk_izmirTatliActivity.class));
                }

            }
        });


    }
}