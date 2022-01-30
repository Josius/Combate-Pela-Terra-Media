import br.com.enums.Tendencia;
import br.com.personagens.*;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Personagem sauron = new Sauron();
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Aragorn());
        personagens.add(new Gandalf());
        personagens.add(new Legolas());
        personagens.add(sauron);

        //Combate contra Sauron
        combateContraSauron(personagens, sauron);
    }

    public static void combateContraSauron(List<Personagem> personagens, Personagem sauron){
        boolean flag = false;
        Personagem ativo, passivo;

        while (!flag){

            ativo = personagens.get((int)(Math.random() * personagens.size()));
            passivo = personagens.get((int)(Math.random() * personagens.size()));
            ativo.executarAtaque(passivo);

            boolean rmPerson = removerPersonagem(passivo, personagens);
            if(rmPerson) {
                break;
            }

            boolean vrfHrs = verificarHerois(personagens);
            if(vrfHrs) {
                break;
            }
            int posicao = personagens.indexOf(sauron);
            boolean vrfSrn = verificaSauron(personagens, posicao);
            if(vrfSrn) {
                break;
            }
        }
    }

    public static boolean removerPersonagem(Personagem personagem, List<Personagem> personagens){
        Personagem person = personagem;
        if(personagem.getPontosDeVida() <= 0){
            personagens.remove(personagem);
            
            if(person.getNome().equals("Sauron, o senhor de Mordor")){
                System.out.println("Sauron foi derrotado! A Terra Media agora pode descansar em paz.");
                return true;
            }
        }
        return false;
    }

    public static boolean verificarHerois(List<Personagem> personagens){
        if((personagens.size() == 1) && (personagens.get(0).getNome().equals("Sauron, o senhor de Mordor"))){

            System.out.println("O Senhor de Mordor eh vitorioso. A Terra Media sofrera sob seu jugo!");
            return true;
        }
        return false;
    }

    public static boolean verificaSauron(List<Personagem> personagens, int posicao){
        if(personagens.get(posicao).getPontosDeVida() <= 0){
            System.out.println("Sauron foi derrotado! A Terra Media agora pode descansar em paz.");
            return true;
        }
        return false;
    }
}
