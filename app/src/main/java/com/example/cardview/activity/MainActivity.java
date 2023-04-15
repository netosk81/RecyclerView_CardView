package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclePostagem;
    private List<Postagem> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclePostagem = findViewById(R.id.recyclerPostagem);

        //definir layout
        this.prepararPostagens();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclePostagem.setLayoutManager( layoutManager );

        //define adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclePostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Carla", "Viagem Carla", R.drawable.imagem1);
        this.postagens.add( p );
         p = new Postagem("Maria", "Viagem Maria", R.drawable.imagem2);
        this.postagens.add( p );
         p = new Postagem("Luiz", "Viagem Luiz", R.drawable.imagem3);
        this.postagens.add( p );
         p = new Postagem("Joao", "Viagem Joao", R.drawable.imagem4);
        this.postagens.add( p );

    }

}