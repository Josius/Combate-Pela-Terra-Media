package acoes;

import interfaces.AcaoDeMagia;
import personagens.Personagem;

public class Conjurar implements AcaoDeMagia {
    @Override
    public void conjurar(Personagem ativo, Personagem passivo) {
        ativo.getMagia().conjurarMagia(passivo);
    }
}
