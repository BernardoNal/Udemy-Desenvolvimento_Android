package com.example.passandodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar=findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getApplicationContext(),MainActivity2.class);

                Usuario user =new Usuario("Nal","nal-carvalho");

                intent.putExtra("nome","Bernardo");
                intent.putExtra("idade",23);
                intent.putExtra("objet",user);
                startActivity(intent);
            }
        });
    }
}