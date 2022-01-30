package br.com.comportamentos;

import br.com.interfaces.TipoDeAtaque;
import br.com.personagens.Personagem;

public class AtaqueSimples implements TipoDeAtaque {

    private int pontosDeDano;

    public AtaqueSimples(int pontosDeDano) {
        this.pontosDeDano = pontosDeDano;
    }

    @Override
    public void atacar(Personagem ativo, Personagem passivo) {

        passivo.receberDano(pontosDeDano);


    }
}
