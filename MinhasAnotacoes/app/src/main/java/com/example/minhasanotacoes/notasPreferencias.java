package com.example.minhasanotacoes;

import android.content.Context;
import android.content.SharedPreferences;

public class notasPreferencias {

    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private final String Nome_Arquivo = "notas.preferencias";
    private final String Nome_Chave = "notas.nome";

    public notasPreferencias(Context c) {
        this.context =c;
        preferences = context.getSharedPreferences(Nome_Arquivo,0);
        editor = preferences.edit();

    }

    public void salvarNotas(String anotacao){
      editor.putString(Nome_Chave,anotacao);
      editor.commit();
    }
    public String escreverNotas(){
      return preferences.getString(Nome_Chave,"Não existe anotação salva");
    }
}
