package br.com.comportamentos;

import br.com.interfaces.TipoDeMagia;
import br.com.personagens.Personagem;

import java.util.Random;

public class BolaDeFogo extends Comportamento implements TipoDeMagia {

    private static Random random;
    private int quantidadeDeBolasDeFogo;

    public BolaDeFogo() {
        this.nome = "Bola de Fogo";
        random = new Random();
    }

    @Override
    public void lancarMagia(Personagem ativo, Personagem passivo) {
        quantidadeDeBolasDeFogo = random.nextInt(6)+1;
        dano = MULTIPLICADOR * quantidadeDeBolasDeFogo;

        expressarDanoMagico(ativo, passivo);
        passivo.receberDano(dano);

    }


}
