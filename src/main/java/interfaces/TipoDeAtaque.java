package interfaces;

import personagens.Personagem;

public interface TipoDeAtaque {
    void atacar(Personagem ativo, Personagem passivo);
}
