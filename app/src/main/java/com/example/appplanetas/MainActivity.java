package com.example.appplanetas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private MeuAdapter meuAdapter;
    private RepositoryItens repositorioItens;
    private ImageView iconSol;
    private ImageView iconLua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewsItens);
        listView.setOnItemClickListener(this);
        repositorioItens = new RepositoryItens();
        List<ItemLista> itens = repositorioItens.obterItens();
        meuAdapter = new MeuAdapter(this, itens);
        listView.setAdapter(meuAdapter);

        iconSol = findViewById(R.id.icon_sol);
        iconLua = findViewById(R.id.icon_lua);

        iconSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSol = new Intent(MainActivity.this, SolActivity.class);
                startActivity(intentSol);
            }
        });

        iconLua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLua = new Intent(MainActivity.this, LuaActivity.class);
                startActivity(intentLua);
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ItemLista itemClicado = meuAdapter.getItem(position);
        Intent intent = new Intent(MainActivity.this, DetalhesPlanetas.class);

        intent.putExtra("nomePlaneta", itemClicado.getNome());
        intent.putExtra("descricaoPlaneta", itemClicado.getDescricao());
        intent.putExtra("imagemPlaneta", itemClicado.getImagemString());

        startActivity(intent);
    }

}
