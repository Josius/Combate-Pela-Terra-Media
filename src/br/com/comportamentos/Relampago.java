package br.com.comportamentos;

import br.com.interfaces.TipoDeMagia;
import br.com.personagens.Personagem;

import java.util.Random;

public class Relampago extends Comportamento implements TipoDeMagia {

    private static Random random;
    private int quantidadeDeRaios;

    public Relampago() {

        random = new Random();
        this.nome = "Relampago";
    }

    @Override
    public void lancarMagia(Personagem ativo, Personagem passivo) {
        quantidadeDeRaios = random.nextInt(7)+1;
        dano = MULTIPLICADOR * quantidadeDeRaios;

        expressarDanoMagico(ativo, passivo);
        passivo.receberDano(dano);

    }
}
