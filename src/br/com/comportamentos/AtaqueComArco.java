package br.com.comportamentos;

import br.com.interfaces.TipoDeAtaque;
import br.com.personagens.Personagem;

public class AtaqueComArco extends Comportamento implements TipoDeAtaque {
    
    public AtaqueComArco(int dano) {
        this.dano = dano;
        this.nome = "Disparo de Flecha";
    }

    @Override
    public void atacar(Personagem ativo, Personagem passivo) {
        revoadaDeFlechas(ativo, passivo);
    }

    private void revoadaDeFlechas(Personagem ativo, Personagem passivo){
        for(int i=0; i <= 2; i++){
            expressarDano(ativo, passivo);
            passivo.receberDano(dano);

        }
    }
}
