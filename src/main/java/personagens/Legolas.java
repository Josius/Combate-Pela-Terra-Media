package personagens;

import acoes.AtaqueSimples;
import categoria.armas.ArcoCurto;
import enums.Tendencia;

public class Legolas extends Personagem{

    public Legolas() {
        this.nome = "Legolas";
        this.arma = new ArcoCurto();
        this.pontosDeVida = 60;
        this.classeDeArmadura = 13;
        this.tendencia = Tendencia.HEROI;
        this.bonusAtaque = 2;
        setTipoDeAtaque(new AtaqueSimples());
    }
}