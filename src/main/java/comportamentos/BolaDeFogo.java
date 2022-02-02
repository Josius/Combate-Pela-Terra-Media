package comportamentos;

import interfaces.TipoDeMagia;
import personagens.Personagem;

import java.util.Random;

public class BolaDeFogo extends Comportamento implements TipoDeMagia {

    private static Random random;

    public BolaDeFogo() {
        this.nome = "Bola de Fogo";
        random = new Random();
    }



    @Override
    public void lancarMagia(Personagem ativo, Personagem passivo) {
        int qtdDeBolasDeFogo = random.nextInt(6) + 1;
        dano = MULTIPLICADOR * qtdDeBolasDeFogo;

        expressarDanoMagico(ativo, passivo);
        passivo.receberDano(dano);

    }


}