package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatoFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {
     private Button Bconversa,Bcontato;
     private ConversasFragment Fconversa;
     private ContatoFragment Fcontato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bcontato =findViewById(R.id.Contatos);
        Bconversa = findViewById(R.id.Conversas);

        getSupportActionBar().setElevation(0);

        Fconversa = new ConversasFragment();
        Fcontato = new ContatoFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.FrameLayout,Fconversa);
        transaction.commit();

        Bcontato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.FrameLayout,Fcontato);
                transaction.commit();
            }
        });
        Bconversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.FrameLayout,Fconversa);
                transaction.commit();
            }
        });





    }
}