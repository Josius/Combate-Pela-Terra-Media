package personagens;

import comportamentos.Relampago;
import enums.Tendencia;

public class Saruman extends Personagem{

    public Saruman() {
        this.pontosDeVida = 70;
        this.classeDeArmadura = 20;
        this.nome = "Saruman";
        this.tendencia = Tendencia.VILAO;
        setTipoDeMagia(new Relampago());
    }
}