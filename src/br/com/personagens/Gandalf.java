package br.com.personagens;

import br.com.comportamentos.BolaDeFogo;
import br.com.enums.Tendencia;

public class Gandalf extends Personagem{

    public Gandalf() {
        this.pontosDeVida = 40;
        this.classeDeArmadura = 10;
        this.nome = "Gandalf";
        this.tendencia = Tendencia.HEROI;
        setTipoDeMagia(new BolaDeFogo());
    }
}
