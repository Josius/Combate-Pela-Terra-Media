package personagens;

import acoes.AtaqueSimples;
import categoria.armas.EspadaCurta;
import enums.Tendencia;

public class Azog extends Personagem{

    public Azog() {
        this.nome = "Azog";
        this.arma = new EspadaCurta();
        this.pontosDeVida = 30;
        this.classeDeArmadura = 15;
        this.tendencia = Tendencia.VILAO;
        this.bonusAtaque = 2;
        setTipoDeAtaque(new AtaqueSimples());
    }

}
