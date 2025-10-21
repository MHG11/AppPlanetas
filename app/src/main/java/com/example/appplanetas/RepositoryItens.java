package com.example.appplanetas;

import java.util.ArrayList;
import java.util.List;

public class RepositoryItens {
    public List<ItemLista> obterItens() {
        List<ItemLista> itens = new ArrayList<>();
        itens.add(new ItemLista("Mercurio", R.drawable.mercurio, 1));
        itens.add(new ItemLista("Venus", R.drawable.venus, 2));
        itens.add(new ItemLista("Terra", R.drawable.terra, 3));
        itens.add(new ItemLista("Marte", R.drawable.marte, 4));
        itens.add(new ItemLista("Júpiter", R.drawable.jupiter, 5));
        itens.add(new ItemLista("Saturno", R.drawable.saturno, 6));
        itens.add(new ItemLista("Urano", R.drawable.urano, 7));
        itens.add(new ItemLista("Netuno", R.drawable.netuno, 8));
        return itens;
    }

}
