package com.example.passandodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView nome,idade,user,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nome=findViewById(R.id.textViewNome);
        idade=findViewById(R.id.textView_Idade);
        user=findViewById(R.id.textView_user);
        email=findViewById(R.id.email);

        Bundle dados =getIntent().getExtras();
        String name =dados.getString("nome");
        int age =dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objet");

        nome.setText(name);
        idade.setText(String.valueOf(age));
        user.setText(usuario.getNome());
        email.setText(usuario.getEmail());

    }
}