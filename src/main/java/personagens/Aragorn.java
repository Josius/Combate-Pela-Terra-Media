package personagens;

import acoes.AtaqueSimples;
import categoria.armas.EspadaLonga;
import enums.Tendencia;

public class Aragorn extends Personagem{

    public Aragorn() {
        this.nome = "Aragorn";
        this.arma = new EspadaLonga();
        this.pontosDeVida = 50;
        this.classeDeArmadura = 13;
        this.tendencia = Tendencia.HEROI;
        this.bonusAtaque = 3;
        setTipoDeAtaque(new AtaqueSimples());
    }
}
