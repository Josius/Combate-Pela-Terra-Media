package personagens;

import categoria.armas.Arma;
import categoria.magias.Magia;
import enums.Tendencia;
import interfaces.AcaoDeAtaque;
import interfaces.AcaoDeMagia;

public abstract class Personagem {
    protected String nome;
    protected Arma arma;
    protected Magia magia;
    protected int pontosDeVida;
    protected int classeDeArmadura;
    protected int bonusAtaque;
    protected Tendencia tendencia;

    protected AcaoDeAtaque acaoDeAtaque;
    protected AcaoDeMagia acaoDeMagia;

    public Personagem() {
        this.acaoDeAtaque = null;
    }

    public void setTipoDeAtaque(AcaoDeAtaque acaoDeAtaque) {
        this.acaoDeAtaque = acaoDeAtaque;
    }
    public void setTipoDeMagia(AcaoDeMagia acaoDeMagia) {
        this.acaoDeMagia = acaoDeMagia;
    }

    public void executarAtaque(Personagem alvo){

        if(this.acaoDeAtaque != null) this.acaoDeAtaque.atacar(this, alvo);
    }

    public void executarMagia(Personagem alvo){

        if(this.acaoDeMagia != null) this.acaoDeMagia.conjurar(this, alvo);
    }

    public void receberDano(int dano){

        if(dano >= 0){
            this.pontosDeVida -= dano;
        }
    }

    public Arma getArma() {
        return arma;
    }

    public Magia getMagia() {
        return magia;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public int getClasseDeArmadura() {
        return classeDeArmadura;
    }

    public int getBonusAtaque() {
        return bonusAtaque;
    }

    public AcaoDeAtaque getTipoDeAtaque() {
        return acaoDeAtaque;
    }

    public Tendencia getTendencia() {
        return tendencia;
    }

    public void receberPvs(int pontosDeVida) {
        this.pontosDeVida += pontosDeVida;
    }
}
