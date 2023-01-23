public class Livros extends Produtos {

    private String genero;
    private String escritor;
    private String editora;

    public Livros(String nome, int id, double preco, int quantidade, String genero, String escritor, String editora) {
        super(nome,id,preco,quantidade);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public Livros(){

    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
