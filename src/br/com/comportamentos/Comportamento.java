package br.com.comportamentos;

import br.com.personagens.Personagem;

public abstract class Comportamento {
    protected static final int MULTIPLICADOR = 6;

    protected String nome;
    protected int dano;

    public String toString(){

        return this.nome;
    }

    protected void expressarDanoMagico(Personagem ativo, Personagem passivo){
        System.out.println(ativo.getNome() + " lanca " + this + " em " + passivo);
        System.out.println("Dano: " + dano);
    }

    protected void expressarDano(Personagem ativo, Personagem passivo){
        System.out.println(ativo.getNome() + " ataca com " + this + " em " + passivo);
        System.out.println("Dano: " + dano);
    }

}
