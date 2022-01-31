package br.com.comportamentos;

import br.com.interfaces.TipoDeAtaque;
import br.com.personagens.Personagem;

public class AtaqueSimples extends Comportamento implements TipoDeAtaque {

    public AtaqueSimples(int pontosDeDano) {

        this.dano= pontosDeDano;
        this.nome = "Ataque Simples";
    }

    @Override
    public void atacar(Personagem ativo, Personagem passivo) {

        expressarDano(ativo, passivo);
        passivo.receberDano(dano);
    }
}
