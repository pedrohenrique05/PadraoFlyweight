package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado {

    private List<Equipamento> equipamentos = new ArrayList<>();

    public void cadastraEquipamento(String serialNumber, String marca, String descricao){
        Roteador roteador = RoteadorFactory.getRoteador(marca,descricao);
        Equipamento equipamento = new Equipamento(serialNumber,roteador);
        this.equipamentos.add(equipamento);
    }

    public List<String> getEquipamentos(){
        List<String> equipamentosCadastrados = new ArrayList<>();
        for(Equipamento equipamento : this.equipamentos){
            equipamentosCadastrados.add(equipamento.infoEquipamentoRoteador());
        }
        return equipamentosCadastrados;
    }
}
