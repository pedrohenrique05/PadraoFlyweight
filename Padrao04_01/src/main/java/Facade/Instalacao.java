package Facade;

public class Instalacao extends OrdemServico{

    private static Instalacao instalacao = new Instalacao();

    private Instalacao(){}

    public static Instalacao getInstance(){
        return instalacao;
    }
}
