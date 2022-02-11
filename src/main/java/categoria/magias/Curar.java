package categoria.magias;

import gerenciador.combate.Dados;
import personagens.Personagem;

public class Curar extends Magia{

    private int qtdDadosDeCura;
    public Curar() {
        this.nome = "Curar";
    }

    @Override
    public void conjurarMagia(Personagem passivo) {
        for(int i=0; i < 3; i++){
            qtdDadosDeCura += Dados.rolarD10();
        }
        passivo.receberPvs(qtdDadosDeCura);
    }
}
