package br.com.personagens;

import br.com.comportamentos.AtaqueSimples;
import br.com.comportamentos.BolaDeFogo;
import br.com.comportamentos.Relampago;
import br.com.enums.Tendencia;

public class Sauron extends Personagem{

    public Sauron() {
        this.pontosDeVida = 80;
        this.classeDeArmadura = 18;
        this.nome = "Sauron, o senhor de Mordor";
        this.tendencia = Tendencia.VILAO;
        setTipoDeAtaque(new AtaqueSimples(12));
        setTipoDeMagia(new BolaDeFogo());
        setTipoDeMagia(new Relampago());
    }
}
