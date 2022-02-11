package categoria.magias;

import gerenciador.combate.Dados;
import personagens.Personagem;

public class BolaDeFogo extends Magia {

    private int qtdBolasDeFogo;

    public BolaDeFogo() {
        this.nome = "Bola de Fogo";
    }

    @Override
    public void conjurarMagia(Personagem passivo) {
        for(int i=0; i < 6; i++){
            qtdBolasDeFogo += Dados.rolarD6();
        }
        passivo.receberDano(qtdBolasDeFogo);
    }
}
