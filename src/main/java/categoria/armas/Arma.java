package categoria.armas;

public abstract class Arma {
    protected String nome;

    public abstract int getDano();

    public void setNome(String nome) {
        this.nome += " " + nome;
    }

    public String getNome() {
        return nome;
    }
}
