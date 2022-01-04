package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button abrir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abrir = findViewById(R.id.button);
        abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(v,"botao presssionadp",Snackbar.LENGTH_INDEFINITE).setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        abrir.setText("botao alterado");
                    }
                }).show();
            }
        });
    }
}