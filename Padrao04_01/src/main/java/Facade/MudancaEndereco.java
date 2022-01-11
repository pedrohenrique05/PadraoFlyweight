package Facade;

public class MudancaEndereco extends OrdemServico{


    private static MudancaEndereco me = new MudancaEndereco();

    private MudancaEndereco(){}

    public static MudancaEndereco getInstance(){
        return me;
    }
}
