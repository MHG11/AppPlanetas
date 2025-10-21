package com.example.appplanetas;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
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
        ItemLista item = (ItemLista) parent.getItemAtPosition(position);
        if (item.getId() == 1){
            Intent intentMercurio = new Intent(this, Mercurio.class);
            startActivity(intentMercurio);
        } else if (item.getId() == 2) {
            Intent intentVenus = new Intent(this, VenusActivity.class);
            startActivity(intentVenus);
        } else if (item.getId() == 3) {
            Intent intentTerra = new Intent(this, TerraActivity.class);
            startActivity(intentTerra);
        } else if (item.getId() == 4) {
            Intent intentMarte = new Intent(this, MarteActivity.class);
            startActivity(intentMarte);
        } else if (item.getId() == 5) {
            Intent intentJupiter = new Intent(this, JupiterActivity.class);
            startActivity(intentJupiter);
        } else if (item.getId() == 6) {
            Intent intentSaturno = new Intent(this, SaturnoActivity.class);
            startActivity(intentSaturno);
        } else if (item.getId() == 7) {
            Intent intentUrano = new Intent(this, UranoActivity.class);
            startActivity(intentUrano);
        } else if (item.getId() == 8) {
            Intent intentNetuno = new Intent(this, NetunoActivity.class);
            startActivity(intentNetuno);
        }
    }

}