package personagens;

import acoes.AtaqueSimples;
import categoria.armas.EspadaCurta;
import enums.Tendencia;

public class Sauron extends Personagem{

    public Sauron() {
        this.nome = "Sauron, o senhor de Mordor";
        this.arma = new EspadaCurta();
        this.pontosDeVida = 80;
        this.classeDeArmadura = 18;
        this.tendencia = Tendencia.VILAO;
        setTipoDeAtaque(new AtaqueSimples());
//        setTipoDeMagia(new BolaDeFogo());
//        setTipoDeMagia(new Relampago());
    }
}
