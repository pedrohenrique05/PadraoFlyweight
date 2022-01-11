package flyweight;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlmoxarifadoTest {

    @Test
    void deveRetornarEquipamentosRoteadores(){
        Almoxarifado almox = new Almoxarifado();
        almox.cadastraEquipamento("1","Dlink","Roteador 2.4Ghz");
        almox.cadastraEquipamento("2","TPlink","Roteador 5.8Ghz");
        almox.cadastraEquipamento("3","TPlink","Roteador 5.8Ghz");

        List<String> equipamentos = Arrays.asList("Marca: Dlink Descricao: Roteador 2.4Ghz" +
                " Numero Serial: 1","Marca: TPlink Descricao: Roteador 5.8Ghz" +
                " Numero Serial: 2","Marca: TPlink Descricao: Roteador 5.8Ghz" +
                " Numero Serial: 3");

        assertEquals(equipamentos,almox.getEquipamentos());

    }

    @Test
    void deveRetornaQuantidadeRoteadorCadastrado(){
        Almoxarifado almox = new Almoxarifado();
        almox.cadastraEquipamento("1","Dlink","Roteador 2.4Ghz");
        almox.cadastraEquipamento("2","TPlink","Roteador 5.8Ghz");
        almox.cadastraEquipamento("3","TPlink","Roteador 5.8Ghz");

        assertEquals(2,RoteadorFactory.getQuantidadeRoteador());
    }

}