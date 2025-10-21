package com.example.appplanetas;

public class ItemLista {
    private String nome;
    private int imagem;
    private long id;
    public ItemLista(String nome, int imagem, long id) {
        this.nome = nome;
        this.imagem = imagem;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getImagem() {
        return imagem;
    }
    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public long getId() {
        return id;
    }
}
