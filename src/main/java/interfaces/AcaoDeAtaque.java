package interfaces;

import personagens.Personagem;

public interface AcaoDeAtaque {
    void atacar(Personagem ativo, Personagem passivo);
}
