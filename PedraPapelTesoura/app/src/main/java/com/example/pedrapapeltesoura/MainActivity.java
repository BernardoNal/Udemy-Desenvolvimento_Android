package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void clickPedra(View view){
        this.decision(2);
    }
    public void clickPapel(View view){
        this.decision(1);
    }
    public void clickTesoura(View view){
        this.decision(0);
    }
    public void decision(int Opcao){


        ImageView imagemGerada = findViewById(R.id.maquina);
        TextView text = findViewById(R.id.decisao);
        int random =new Random().nextInt(3);
        switch (random){
            case 0:
                imagemGerada.setImageResource(R.drawable.tesoura);
                switch (Opcao){
                    case 0:
                        text.setText("Empate");
                        break;
                    case 1:
                        text.setText("Você Perdeu! :|");
                        break;
                    case 2:
                        text.setText("Parabéns você ganhou :)");
                        break;
                }
                break;

            case 1 :
                imagemGerada.setImageResource(R.drawable.papel);
                switch (Opcao){
                    case 1:
                        text.setText("Empate");
                        break;
                    case 2:
                        text.setText("Você Perdeu! :|");
                        break;
                    case 0:
                        text.setText("Parabéns você ganhou :)");
                        break;
                }
                break;
            case 2:
                imagemGerada.setImageResource(R.drawable.pedra);
                switch (Opcao){
                    case 2:
                        text.setText("Empate");
                        break;
                    case 0:
                        text.setText("Você Perdeu! :|");
                        break;
                    case 1:
                        text.setText("Parabéns você ganhou :)");
                        break;
                }
                break;
        }
    }
}