package gerenciador.combate;

import enums.ValorDado;

import java.util.Random;

public class Dados {

    private static Random random;
    private static Dados dados;

    private Dados(){
        super();
        random = new Random();
    }

    public static Dados getDados(){
        if(dados == null){
            dados = new Dados();
        }
        return dados;
    }

    public static int rolarD2(){
        return random.nextInt(ValorDado.D2.getValor()) + ValorDado.UM.getValor();
    }
    public static int rolarD4(){
        return random.nextInt(ValorDado.D4.getValor()) + ValorDado.UM.getValor();
    }
    public static int rolarD6(){
        return random.nextInt(ValorDado.D6.getValor()) + ValorDado.UM.getValor();
    }
    public static int rolarD8(){
        return random.nextInt(ValorDado.D8.getValor()) + ValorDado.UM.getValor();
    }
    public static int rolarD10(){
        return random.nextInt(ValorDado.D10.getValor()) + ValorDado.UM.getValor();
    }
    public static int rolarD12(){
        return random.nextInt(ValorDado.D12.getValor()) + ValorDado.UM.getValor();
    }
    public static int rolarD20(){
        return random.nextInt(ValorDado.D20.getValor()) + ValorDado.UM.getValor();
    }

}
