package categoria.armas;

import gerenciador.combate.Dados;

public class EspadaCurta extends Arma{

    public EspadaCurta() {
        this.nome = "Espada Curta";
    }

    @Override
    public int getDano() {
//        System.out.println(Dados.getDados());
        return Dados.rolarD6();
    }
}
