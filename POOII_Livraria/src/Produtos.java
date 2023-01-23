public class Produtos {

    public String nome;
    public double preco;
    public int id;
    public int quantidade;

    public Produtos(String nome, int id, double preco, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produtos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
