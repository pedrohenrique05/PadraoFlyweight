package flyweight;

public class Equipamento {
    private String serialNumber;
    private Roteador roteadorEquipamento;

    public Equipamento(String serialNumber, Roteador roteadorEquipamento) {
        this.serialNumber = serialNumber;
        this.roteadorEquipamento = roteadorEquipamento;
    }

    public String infoEquipamentoRoteador(){
        return "Marca: "+ this.roteadorEquipamento.getMarca() +
                " Descricao: "+this.roteadorEquipamento.getDescricao()+
                " Numero Serial: "+this.serialNumber;
    }
}
