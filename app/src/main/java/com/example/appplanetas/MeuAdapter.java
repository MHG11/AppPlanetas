package com.example.appplanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
public class MeuAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<ItemLista> itens;
    public MeuAdapter(Context context, List<ItemLista> itens) {
        this.itens = itens;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return itens.size();
    }
    @Override
    public ItemLista getItem(int position) {
        return itens.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_lista, parent, false);
        }
        ItemLista item = getItem(position);
        TextView texto = convertView.findViewById(R.id.textoViewItens);
        texto.setText(item.getNome());
        ImageView imagem = convertView.findViewById(R.id.imagemViewItens);
        imagem.setImageResource(item.getImagem());
        return convertView;
    }
}