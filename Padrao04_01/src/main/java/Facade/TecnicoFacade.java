package Facade;

public class TecnicoFacade {

    public static boolean verificaAtividades(Tecnico tecnico){
        if(Instalacao.getInstance().verificaOrdemServico(tecnico)){
            return false;
        }
        if(MudancaEndereco.getInstance().verificaOrdemServico(tecnico)){
            return false;
        }
        if(Suporte.getInstance().verificaOrdemServico(tecnico)){
            return false;
        }
        return true;
    }
}
