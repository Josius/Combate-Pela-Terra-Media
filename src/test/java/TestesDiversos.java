import org.junit.jupiter.api.Test;
import personagens.*;

import java.util.ArrayList;
import java.util.List;

public class TestesDiversos {

    @Test
    public void estabelecerBatalha(){
        Personagem sauron = new Sauron();
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Aragorn());
        personagens.add(new Gandalf());
        personagens.add(new Legolas());
        personagens.add(sauron);

        Batalha batalha = new Batalha(personagens, sauron);

        batalha.estatisticas();
        batalha.combateContraSauron();
        batalha.estatisticas();


    }
}
