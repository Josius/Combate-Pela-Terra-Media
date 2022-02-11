package enums;

public enum ValorDado {
    UM(1), D2(2), D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);

    private int valor;
    ValorDado(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
