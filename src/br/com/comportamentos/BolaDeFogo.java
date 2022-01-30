package br.com.comportamentos;

import br.com.interfaces.TipoDeMagia;
import br.com.personagens.Personagem;

import java.util.Random;

public class BolaDeFogo implements TipoDeMagia {

    private static Random random;

    public BolaDeFogo() {
        random = new Random();
    }

    @Override
    public void lancarMagia(Personagem ativo, Personagem passivo) {
        int quantidadeDeBolasDeFogo = random.nextInt(6)+1;

        passivo.receberDano(quantidadeDeBolasDeFogo*6);

    }
}
