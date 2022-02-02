package personagens;

import comportamentos.AtaqueComArco;
import enums.Tendencia;

public class Legolas extends Personagem{

    public Legolas() {
        this.pontosDeVida = 60;
        this.classeDeArmadura = 13;
        this.nome = "Legolas";
        this.tendencia = Tendencia.HEROI;
        setTipoDeAtaque(new AtaqueComArco(6));
    }
}