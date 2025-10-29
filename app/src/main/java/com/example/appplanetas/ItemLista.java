package com.example.appplanetas;

public class ItemLista {
    private String nome;
    private String descricao;
    private int imagem;
    private String imagemString;

    public ItemLista(String nome, String descricao, int imagem, String imagemString) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.imagemString = imagemString;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getImagemString() {
        return imagemString;
    }

    public void setImagemString(String imagemString) {
        this.imagemString = imagemString;
    }
}
