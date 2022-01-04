package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private List<Filme> listFilme =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.RecyclerView);

        this.criarFilmes();
        Adapter adapter= new Adapter(listFilme);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layout);
       // recycler.setAdapter(adapter);
        recycler.setHasFixedSize(true );
        recycler.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recycler.setAdapter(adapter);

        recycler.addOnItemTouchListener(
            new RecyclerItemClickListener(getApplicationContext(), recycler, new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Filme filme =listFilme.get(position);
                    Toast.makeText(getApplicationContext(),filme.getTituloFilme(),Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onLongItemClick(View view, int position) {
                    Filme filme =listFilme.get(position);
                    Toast.makeText(getApplicationContext(),filme.getTituloFilme()+"\n"+filme.getGenero()+"\n"+
                            filme.getAno(),Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                }
            })
        );
    }
    public void criarFilmes(){
        Filme filme = new Filme("SNK","anime","2010");
        listFilme.add(filme);
        filme = new Filme("BNH","anime","2016");
        listFilme.add(filme);
        filme = new Filme("DR.Stone","anime","2018");
        listFilme.add(filme);
        filme = new Filme("NNT","anime","2016");
        listFilme.add(filme);
        filme = new Filme("HxH","anime","1993");
        listFilme.add(filme);
        filme = new Filme("DBS","anime","2017");
        listFilme.add(filme);
    }
}