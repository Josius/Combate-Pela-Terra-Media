package categoria.armas;

import gerenciador.combate.Dados;

public class EspadaLonga extends Arma{

    public EspadaLonga() {
        this.nome = "Espada Longa";
    }

    @Override
    public int getDano() {
        return Dados.rolarD8();
    }
}
