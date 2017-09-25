package com.mistcorp.multiscreen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MultiScreenMainActivity extends android.app.ListActivity{

    String[] islands = { "Канары", "Курилы", "Мальдивы", "Филиппины"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, islands);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MultiScreenMainActivity.this,
                                Canari.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new
                                Intent(MultiScreenMainActivity.this, Curili.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new
                                Intent(MultiScreenMainActivity.this, Maldivi.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new
                                Intent(MultiScreenMainActivity.this, Philippini.class);
                        startActivity(intent3);
                        break;
                }
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(itemListener);

    }
}
