package flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoteadorFactory {

    private static Map<String, Roteador> roteadores = new HashMap<>();

    public static Roteador getRoteador(String marca, String descricao){
        Roteador roteador = roteadores.get(marca);
        if(roteador == null){
            roteador = new Roteador(marca,descricao);
            roteadores.put(marca,roteador);
        }
        return roteador;
    }

    public static int getQuantidadeRoteador(){
        return roteadores.size();
    }


}
