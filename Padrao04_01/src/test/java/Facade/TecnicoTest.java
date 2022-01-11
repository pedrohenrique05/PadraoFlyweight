package Facade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {

    @Test
    void deveRetornaServicoInstalacao(){
        Tecnico tecnico = new Tecnico();
        Instalacao.getInstance().setOSAberta(tecnico);
        assertEquals(false,tecnico.encerraAtividade());
    }

    @Test
    void deveRetronarServicoMudancaEndereco(){
        Tecnico tecnico = new Tecnico();
        MudancaEndereco.getInstance().setOSAberta(tecnico);
        assertEquals(false, tecnico.encerraAtividade());
    }

    @Test
    void deveRetornaServicoSuporte(){
        Tecnico tecnico = new Tecnico();
        Suporte.getInstance().setOSAberta(tecnico);
        assertEquals(false, tecnico.encerraAtividade());
    }

    @Test
    void deveRetornaNenhumServico(){
        Tecnico tecnico = new Tecnico();

        assertEquals(true, tecnico.encerraAtividade());
    }

}