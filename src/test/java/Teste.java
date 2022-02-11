import gerenciador.combate.Batalha;
import gerenciador.combate.Dados;
import org.junit.jupiter.api.Test;
import personagens.*;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    @Test
    public void testeDados(){

        Dados dados = Dados.getDados();
        System.out.println(dados.rolarD2());
        System.out.println(dados.rolarD4());
        System.out.println(dados.rolarD6());
        System.out.println(dados.rolarD8());
        System.out.println(dados.rolarD10());
        System.out.println(dados.rolarD12());
        System.out.println(dados.rolarD20());

        Personagem aragorn = new Aragorn();
        Personagem gandalf = new Gandalf();
        gandalf.executarMagia(aragorn);
        System.out.println(aragorn.getArma().getNome());
        Personagem aragorn1 = new Aragorn();
        Personagem bal = new Azog();
        Personagem bol = new Azog();
        Personagem sauron = new Sauron();
        List<Personagem> h = new ArrayList<>();
        List<Personagem> v = new ArrayList<>();
        h.add(aragorn);
        h.add(aragorn1);
        v.add(bal);
        v.add(bol);

        Batalha batalha = new Batalha(h, sauron);
        //batalha.combateContraSauron();
        System.out.println(batalha.verificaResultadoAtaque(aragorn, bal));
        System.out.println(batalha.verificaResultadoAtaque(aragorn, bal));
        System.out.println(batalha.verificaResultadoAtaque(aragorn, bal));
        System.out.println(batalha.verificaResultadoAtaque(bal, aragorn));
        System.out.println(batalha.verificaResultadoAtaque(bol, aragorn));
        System.out.println(batalha.verificaResultadoAtaque(bal, aragorn));
        aragorn.executarAtaque(aragorn1);
        System.out.println(batalha.verificarTendencia(aragorn, bal));
        System.out.println(batalha.verificarTendencia(aragorn, aragorn1));
        System.out.println(batalha.verificarTendencia(bal, bol));
        System.out.println(batalha.verificarTendencia(aragorn1, bol));



    }
}