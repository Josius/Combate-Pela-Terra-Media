package br.com.comportamentos;

import br.com.interfaces.TipoDeMagia;
import br.com.personagens.Personagem;

import java.util.Random;

public class Relampago implements TipoDeMagia {

    private static Random random;

    public Relampago() {
        random = new Random();
    }

    @Override
    public void lancarMagia(Personagem ativo, Personagem passivo) {
        int quantidadeDeRaios = random.nextInt(7)+1;

        passivo.receberDano(quantidadeDeRaios*6);

    }
}
