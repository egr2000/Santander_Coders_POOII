public class AlbunsDeMusica extends Produtos {

    private String musicosBandas;
    private String genero;
    private String selos;

    public AlbunsDeMusica(String nome, int id, double preco, int quantidade, String musicosBandas, String genero, String selos) {
        super(nome,id,preco,quantidade);
        this.musicosBandas = musicosBandas;
        this.genero = genero;
        this.selos = selos;
    }

    public AlbunsDeMusica() {
    }

    @Override
    public String toString() {
        return "AlbunsDeMusica{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", musicosBandas='" + musicosBandas + '\'' +
                ", genero='" + genero + '\'' +
                ", selos='" + selos + '\'' +
                '}';
    }

    public String getMusicosBandas() {
        return musicosBandas;
    }

    public void setMusicosBandas(String musicosBandas) {
        this.musicosBandas = musicosBandas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSelos() {
        return selos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }
}
