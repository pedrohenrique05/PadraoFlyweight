package Facade;

public class Suporte extends OrdemServico{



    private static Suporte suporte = new Suporte();

    private Suporte(){}

    public static Suporte getInstance(){
        return suporte;
    }
}
