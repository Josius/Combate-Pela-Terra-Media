package categoria.armas;

import gerenciador.combate.Dados;

public class ArcoLongo extends Arma{

    public ArcoLongo() {
        this.nome = "Arco Longo";
    }

    @Override
    public int getDano() {
        return Dados.rolarD8();
    }
}
