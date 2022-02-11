package gerenciador.combate;

import personagens.Personagem;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Batalha {
    //talvez, transformar as duas listas abaixo em um map
    private List<Personagem> personagens;
    private List<Personagem> viloes;
    private Personagem sauron;
    private Dados dados;
    private int rolagemAtaque;

    public Batalha(List<Personagem> personagens, List<Personagem> viloes) {
        this.personagens = new ArrayList<>();
        this.viloes = new ArrayList<>();
        this.personagens.addAll(personagens);
        this.viloes.addAll(viloes);
        this.dados = Dados.getDados();
    }
    public Batalha(List<Personagem> personagens, Personagem sauron) {
        this.personagens = new ArrayList<>();
        this.personagens.addAll(personagens);
        this.sauron = sauron;
        this.dados = Dados.getDados();
    }

    public boolean verificaResultadoAtaque(Personagem ativo, Personagem passivo){
        rolagemAtaque = dados.rolarD20() + ativo.getBonusAtaque();
//        System.out.println(rolagemAtaque);
//        System.out.println(passivo.getClasseDeArmadura());
        return rolagemAtaque >= passivo.getClasseDeArmadura();
    }

    public boolean verificarTendencia(Personagem ativo, Personagem passivo){
        return ativo.getTendencia().equals(passivo.getTendencia());
    }

    public void estatisticas(){
        System.out.println("=====================================");
        for(Personagem personagem : this.personagens){
            System.out.println("Personagem " + personagem.getNome());
            System.out.println("PVs: " + personagem.getPontosDeVida() +
                    " - Classe de Armadura: " + personagem.getClasseDeArmadura());
        }
        System.out.println("=====================================");
    }
/*
    public void combateContraSauron(){
        boolean flag = false;
        Personagem ativo, passivo;

        while (!flag){

            ativo = personagens.get((int)(Math.random() * personagens.size()));
            passivo = personagens.get((int)(Math.random() * personagens.size()));
            if(!verificarTendencia(ativo, passivo)) continue;
            if(verificaResultadoAtaque(ativo, passivo)) continue;
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

    private boolean removerPersonagem(Personagem personagem, List<Personagem> personagens){
        Personagem person = personagem;
        if(personagem.getPontosDeVida() <= 0){
            personagens.remove(personagem);

            if(person.getNome().equals("Sauron, o senhor de Mordor")){
                System.out.println("****************************************************************");
                System.out.println("Sauron foi derrotado! A Terra Media agora pode descansar em paz.");
                System.out.println("****************************************************************");
                return true;
            }
        }
        return false;
    }

    private boolean verificarHerois(List<Personagem> personagens){
        if((personagens.size() == 1) && (personagens.get(0).getNome().equals("Sauron, o senhor de Mordor"))){

            System.out.println("********************************************************************");
            System.out.println("O Senhor de Mordor eh vitorioso. A Terra Media sofrera sob seu jugo!");
            System.out.println("********************************************************************");
            return true;
        }
        return false;
    }

    private boolean verificaSauron(List<Personagem> personagens, int posicao){
        if(personagens.get(posicao).getPontosDeVida() <= 0){
            System.out.println("Sauron foi derrotado! A Terra Media agora pode descansar em paz.");
            return true;
        }
        return false;
    }
*/


}
