package br.com.personagens;

import br.com.enums.Tendencia;
import br.com.interfaces.TipoDeAtaque;
import br.com.interfaces.TipoDeMagia;

import java.util.Random;

public abstract class Personagem {
    protected String nome;
    protected int pontosDeVida;
    protected int classeDeArmadura;
    protected Tendencia tendencia;
    //protected TipoDeClasse tipoDeClasse;
    //protected TipoDeRaca tipoDeRaca;
    protected TipoDeAtaque tipoDeAtaque;
    protected TipoDeMagia tipoDeMagia;
    protected static Random random;


    public Personagem() {
//        this.tipoDeClasse = null;
//        this.tipoDeRaca = null;
        this.tipoDeAtaque = null;
        random = new Random();
    }
/*

    public void setTipoDeClasse(TipoDeClasse tipoDeClasse) {
        this.tipoDeClasse = tipoDeClasse;
    }

    public void setTipoDeRaca(TipoDeRaca tipoDeRaca) {
        this.tipoDeRaca = tipoDeRaca;
    }
*/

    public void setTipoDeAtaque(TipoDeAtaque tipoDeAtaque) {
        this.tipoDeAtaque = tipoDeAtaque;
    }

    public void executarAtaque(Personagem alvo){
        if(!(alvo.getTendencia().equals(this.tendencia))){
            if(this.nome.equals("Gandalf")){
                if(this.tipoDeMagia != null){
                    int valorAtaque = random.nextInt(20)+1;

                    if (valorAtaque >= alvo.classeDeArmadura) {

                        this.tipoDeMagia.lancarMagia(this, alvo);
                    }
                }
            }
            if(this.tipoDeAtaque != null){
                int valorAtaque = random.nextInt(20)+1;

                if (valorAtaque >= alvo.classeDeArmadura) {

                    this.tipoDeAtaque.atacar(this, alvo);
                }
            }
        }

    }

    public void setTipoDeMagia(TipoDeMagia tipoDeMagia) {
        this.tipoDeMagia = tipoDeMagia;
    }

    public void verificarTendencia(Personagem alvo){
        if(!(alvo.getTendencia().equals(this.tendencia))){
            System.out.println(!(alvo.getTendencia().equals(this.tendencia)));
        }
    }
    public void receberDano(int dano){
        this.pontosDeVida -= dano;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public String toString(){

        return this.nome;
    }

    public Tendencia getTendencia() {
        return tendencia;
    }

    public String getNome() {
        return nome;
    }
}
