package personagens;

import comportamentos.AtaqueSimples;
import enums.Tendencia;

public class Aragorn extends Personagem {
    public Aragorn() {
        this.pontosDeVida = 50;
        this.classeDeArmadura = 15;
        this.nome = "Aragorn";
        this.tendencia = Tendencia.HEROI;
        setTipoDeAtaque(new AtaqueSimples(8));
    }
}