package com.example.preferenciasdousurio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Button salvar;
    private TextInputEditText nome;
    private TextView usuario;
    private static final String ARQUIVO_PREFERENCIA ="ARQUIVO PREFERENCIA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salvar = findViewById(R.id.buttonSalvar);
        nome = findViewById(R.id.edit);
        usuario = findViewById(R.id.usuario);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
                SharedPreferences.Editor editor = preferences.edit();

                if (nome.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Preencha o nome",Toast.LENGTH_LONG).show();
                }
                else {
                    String name = nome.getText().toString();
                    editor.putString("nome",name);
                    editor.commit();
                    usuario.setText("Olá, "+name);
                }
            }
        });
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);

        if (preferences.contains("nome")){
            String name = preferences.getString("nome","usuário não definido");
            usuario.setText("Olá, "+name);

        }
        else {
            usuario.setText("Olá,usuário não definido");
        }
    }
}