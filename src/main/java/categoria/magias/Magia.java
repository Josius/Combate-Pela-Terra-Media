package categoria.magias;

import personagens.Personagem;

public abstract class Magia {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public abstract void conjurarMagia(Personagem passivo);
}
