package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private ListView locais;
     private String[] itens ={
         "Aracaju","HYRULE","Atena","Elisios","Inferno"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locais = findViewById(R.id.ListLocais);

        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(getApplicationContext()
                , android.R.layout.simple_expandable_list_item_1
                ,android.R.id.text1,itens);

        locais.setAdapter(adaptador);

        locais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),itens[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}