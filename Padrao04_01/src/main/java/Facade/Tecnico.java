package Facade;

public class Tecnico {
    public boolean encerraAtividade(){
        return TecnicoFacade.verificaAtividades(this);
    }
}
