package com.example.bd_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.text);

        try {

            SQLiteDatabase banco = openOrCreateDatabase("app",MODE_PRIVATE,null);

            banco.execSQL("CREATE TABLE IF NOT EXISTS pessoas( nome VARCHAR, idade INT(3)) ");

            banco.execSQL("INSERT INTO pessoas (nome,idade) VALUES ('ppp',28)");
            banco.execSQL("INSERT INTO pessoas (nome,idade) VALUES ('lyly',66)");

            Cursor cursor =banco.rawQuery("Select * FROM pessoas",null);

            int Inome = cursor.getColumnIndex("nome");
            int Iidade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while (cursor != null) {
                Log.i("Resultado - nome",cursor.getString(Inome));
                Log.i("Resultado - idade",cursor.getString(Iidade));
                cursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
  /*  public void test (View view){
        SQLiteDatabase banco = openOrCreateDatabase("app",MODE_PRIVATE,null);

        banco.execSQL("CREATE TABLE IF NOT EXISTS pessoas( nome VARCHAR, idade INT(3)) ");

        banco.execSQL("INSERT INTO pessoas (nome,idade) VALUES ('Nal',23)");
        banco.execSQL("INSERT INTO pessoas (nome,idade) VALUES ('magro',16)");

        Cursor cursor = banco.rawQuery("Select * FROM pessoas",null);

        cursor.moveToLast();
        texto.setText("nome:"+ cursor.getString(0)+"\n idade"+cursor.getString(1));
    }*/
}