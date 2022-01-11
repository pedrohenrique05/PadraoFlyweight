package flyweight;

public class Roteador {

    private String marca;
    private String descricao;

    public Roteador(String marca, String descricao) {
        this.marca = marca;
        this.descricao = descricao;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
