package categoria.armas;

import gerenciador.combate.Dados;

public class ArcoCurto extends Arma{

    public ArcoCurto() {
        this.nome = "Arco Curto";
    }

    @Override
    public int getDano() {
        return Dados.rolarD6();
    }
}
