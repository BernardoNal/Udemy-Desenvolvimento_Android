package com.example.minhasanotacoes;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private notasPreferencias preferencias;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferencias =new notasPreferencias(getApplicationContext());

        editText = findViewById(R.id.editAnotacao);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String recuperarNota = editText.getText().toString();
                if (recuperarNota.equals("")){
                Snackbar.make(view, "Preencha a Anotação", Snackbar.LENGTH_LONG).show();
                }
                else {
                     preferencias.salvarNotas(editText.getText().toString());
                    Snackbar.make(view, "Anotação Salva", Snackbar.LENGTH_LONG).show();
                }
            }
        });

        String notas =preferencias.escreverNotas();
        if (!notas.equals("")){
             editText.setText(notas);
        }
    }


}