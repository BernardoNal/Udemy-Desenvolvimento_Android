package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Post;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card2,parent,false);

        return new MyViewHolder(itemLista);
    }
    private List<Post> listpost;
    public Adapter(List<Post> po) {
        this.listpost=po;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        Post post = listpost.get(position);
        holder.pessoa.setText(post.getNome());
        holder.tbt.setText(post.getPostagem());
        holder.imagem.setImageResource(post.getImagem());
    }

    @Override
    public int getItemCount() {
        return listpost.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView pessoa,
                //tempo,
                tbt;
        ImageView imagem;
      //  Button Bcurtir,Bcomentar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pessoa =itemView.findViewById(R.id.pessoa);
            //tempo =itemView.findViewById(R.id.linear);
            tbt = itemView.findViewById(R.id.TBT);
            imagem =itemView.findViewById(R.id.imageView);
           // Bcurtir =itemView.findViewById(R.id.button_curtir);
            //Bcomentar=itemView.findViewById(R.id.buttoncomentar);
        }
    }
}
