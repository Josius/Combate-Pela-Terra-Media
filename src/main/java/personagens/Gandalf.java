package personagens;

import acoes.Conjurar;
import categoria.magias.BolaDeFogo;
import enums.Tendencia;

public class Gandalf extends Personagem{

    public Gandalf() {
        this.nome = "Gandalf";
        this.magia = new BolaDeFogo();
        this.pontosDeVida = 40;
        this.classeDeArmadura = 10;
        this.tendencia = Tendencia.HEROI;
        setTipoDeMagia(new Conjurar());
    }
}