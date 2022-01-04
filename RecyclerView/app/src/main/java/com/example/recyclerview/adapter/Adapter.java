package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.Filme;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listFilme;

    public Adapter(List<Filme> lista) {
        this.listFilme=lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filme filme = listFilme.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.ano.setText(filme.getAno());
        holder.genero.setText(filme.getGenero());
    }

    @Override
    public int getItemCount() {
        return listFilme.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView titulo,genero,ano;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                titulo =itemView.findViewById(R.id.textTitulo);
                genero =itemView.findViewById(R.id.textGenero);
                ano = itemView.findViewById(R.id.TextAno);
            }
    }
}
