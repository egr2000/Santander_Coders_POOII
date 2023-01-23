public class Brinquedos extends Produtos {

    private String tipo;

    public Brinquedos(String nome, int id, double preco, int quantidade, String tipo) {
        super(nome,id,preco,quantidade);
        this.tipo = tipo;
    }

    public Brinquedos() {
        //super();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Brinquedos{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

