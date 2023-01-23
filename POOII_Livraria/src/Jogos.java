public class Jogos extends Produtos {

    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogos(String nome, int id, double preco, int quantidade, String distribuidora, String genero, String estudio) {
        super(nome,id,preco,quantidade);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Jogos() {
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
