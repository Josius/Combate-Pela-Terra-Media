package br.com.comportamentos;

import br.com.interfaces.TipoDeAtaque;
import br.com.personagens.Personagem;

public class AtaqueComArco implements TipoDeAtaque {

    private int pontosDeDano;

    public AtaqueComArco(int pontosDeDano) {
        this.pontosDeDano = pontosDeDano;
    }

    @Override
    public void atacar(Personagem ativo, Personagem passivo) {
        revoadaDeFlechas(ativo, passivo);
    }

    private void revoadaDeFlechas(Personagem ativo, Personagem passivo){
        for(int i=0; i <= 2; i++){

            passivo.receberDano(pontosDeDano);

        }
    }
}
