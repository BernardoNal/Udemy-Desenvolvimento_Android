package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.adapter.Adapter;
import com.example.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerP;
    private List<Post> posts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerP=findViewById(R.id.recyclerview);

        LinearLayoutManager layout =new LinearLayoutManager(this);

        recyclerP.setLayoutManager(layout);

        this.criarPosts();
        Adapter adapter = new Adapter(posts);
        recyclerP.setAdapter(adapter);
    }
    public void criarPosts(){
        Post p = new Post("Bernado Carvalho","Genshin",R.drawable.albedo);
        this.posts.add(p);

        p = new Post("Bernado Carvalho","Batman",R.drawable.bat);
        this.posts.add(p);

        p = new Post("Nal Carvalho","YU-GI-OH",R.drawable.gods);
        this.posts.add(p);
    }
}