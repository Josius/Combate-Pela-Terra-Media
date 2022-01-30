package br.com.personagens;

import br.com.comportamentos.AtaqueSimples;
import br.com.enums.Tendencia;

public class Azog extends Personagem{

    public Azog() {
        this.pontosDeVida = 30;
        this.classeDeArmadura = 13;
        this.nome = "Azog";
        this.tendencia = Tendencia.VILAO;
        setTipoDeAtaque(new AtaqueSimples(8));
    }

}
