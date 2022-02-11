package acoes;

import interfaces.AcaoDeAtaque;
import personagens.Personagem;

public class AtaqueSimples implements AcaoDeAtaque {

    @Override
    public void atacar(Personagem ativo, Personagem passivo) {

        passivo.receberDano(ativo.getArma().getDano());
    }
}
