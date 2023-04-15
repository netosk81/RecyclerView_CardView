package com.example.cardview.adapter;

import static android.os.Build.VERSION_CODES.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.sql.Ref;
import java.util.List;

public class PostagemAdapter  extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {


    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> listaPostagens) {

        this.postagens = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(com.example.cardview.R.layout.postagem_detalhe,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);


        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());


        /*holder.textNome.setText("Jose Ribeiro Neto");
        holder.textPostagem.setText("#tbt Viagem Legal");
        holder.imagePostagem.setImageResource(com.example.cardview.R.drawable.imagem1);*/

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView    textNome;
        private TextView    textPostagem;
        private ImageView   imagePostagem;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            textNome = itemView.findViewById(com.example.cardview.R.id.textNome);
            textPostagem = itemView.findViewById(com.example.cardview.R.id.textPostagem);
            imagePostagem = itemView.findViewById(com.example.cardview.R.id.imagePostagem);
        }
    }
}
