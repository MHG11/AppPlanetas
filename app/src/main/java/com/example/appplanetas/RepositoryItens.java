package com.example.appplanetas;

import java.util.ArrayList;
import java.util.List;

public class RepositoryItens {
    public List<ItemLista> obterItens() {
        List<ItemLista> itens = new ArrayList<>();
        itens.add(new ItemLista("Mercúrio", "Gravidade deste planeta: 3,7m²", R.drawable.mercurio, "mercurio"));
        itens.add(new ItemLista("Vênus", "Gravidade deste planeta: 8,9m²", R.drawable.venus, "venus"));
        itens.add(new ItemLista("Terra", "Gravidade deste planeta: 9,8m²", R.drawable.terra, "terra"));
        itens.add(new ItemLista("Marte", "Gravidade deste planeta: 3,72m²", R.drawable.marte, "marte"));
        itens.add(new ItemLista("Júpiter", "Gravidade deste planeta: 24,8m²", R.drawable.jupiter, "jupiter"));
        itens.add(new ItemLista("Saturno", "Gravidade deste planeta: 10,7m²", R.drawable.saturno, "saturno"));
        itens.add(new ItemLista("Urano", "Gravidade deste planeta: 8,8m²", R.drawable.urano, "urano"));
        itens.add(new ItemLista("Netuno", "Gravidade deste planeta: 11m²", R.drawable.netuno, "netuno"));
        return itens;
    }

}
