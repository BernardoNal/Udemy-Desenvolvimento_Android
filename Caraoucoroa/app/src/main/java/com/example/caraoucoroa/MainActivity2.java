package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView volta, resultado;
    //private int moeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        volta=findViewById(R.id.Voltar);
        resultado=findViewById(R.id.Moeda);
        Bundle dados =getIntent().getExtras();

        int moeda =dados.getInt("moeda");
        if(moeda==1){
        resultado.setImageResource(R.drawable.moeda_cara);}
        else{
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}