public class Filmes extends Produtos {

    private String estudio;
    private String diretores;
    private String generos;
    private String produtores;

    public Filmes(String nome, int id, double preco, int quantidade, String estudio, String diretores, String generos, String produtores) {
        super(nome,id,preco,quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public Filmes(){

    }

    @Override
    public String toString() {
        return "Filmes{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", estudio='" + estudio + '\'' +
                ", diretores='" + diretores + '\'' +
                ", generos='" + generos + '\'' +
                ", produtores='" + produtores + '\'' +
                '}';
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }
}
