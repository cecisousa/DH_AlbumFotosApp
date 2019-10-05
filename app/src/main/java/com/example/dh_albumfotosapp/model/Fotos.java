package com.example.dh_albumfotosapp.model;

import androidx.fragment.app.Fragment;

public class Fotos {

    private int imagem;
    private String nome;
    private Fragment fragment;

    public Fotos(String nome, Fragment fragment) {
        this.nome = nome;
        this.fragment = fragment;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

}
