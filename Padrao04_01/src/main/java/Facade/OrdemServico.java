package Facade;

import java.util.ArrayList;
import java.util.List;
public abstract class OrdemServico {

    private List<Tecnico> tecnicoServico = new ArrayList<Tecnico>();

    public void setOSAberta(Tecnico tecnico){
        this.tecnicoServico.add(tecnico);
    }

    public boolean verificaOrdemServico(Tecnico tecnico){
        return this.tecnicoServico.contains(tecnico);
    }
}
