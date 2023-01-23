import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras<T extends Produtos> {

    public Brinquedos aux1 = new Brinquedos();
    public AlbunsDeMusica aux2 = new AlbunsDeMusica();
    public Jogos aux3 = new Jogos();
    public Livros aux4 = new Livros();
    public Filmes aux5 = new Filmes();
    List<Object> produtoCarrinho = new ArrayList<>();

    public void adicionaCarrinho(T t, int quant) {
        if (t.getQuantidade() >= quant) {
            if (t.getClass().equals(Brinquedos.class)) {
                aux1.setNome(t.getNome());
                aux1.setId(t.getId());
                aux1.setPreco(t.getPreco());
                aux1.setQuantidade(quant);
                aux1.setTipo(((Brinquedos) t).getTipo());
                produtoCarrinho.add(this.aux1);
            } else if (t.getClass().equals(AlbunsDeMusica.class)) {
                this.aux2.setNome(t.getNome());
                this.aux2.setId(t.getId());
                this.aux2.setPreco(t.getPreco());
                this.aux2.setQuantidade(quant);
                this.aux2.setMusicosBandas(((AlbunsDeMusica) t).getMusicosBandas());
                this.aux2.setGenero(((AlbunsDeMusica) t).getGenero());
                this.aux2.setSelos(((AlbunsDeMusica) t).getSelos());
                this.produtoCarrinho.add(aux2);
            } else if (t.getClass().equals(Jogos.class)) {
                this.aux3.setNome(t.getNome());
                this.aux3.setId(t.getId());
                this.aux3.setPreco(t.getPreco());
                this.aux3.setQuantidade(quant);
                this.aux3.setDistribuidora(((Jogos) t).getDistribuidora());
                this.aux3.setGenero(((Jogos) t).getGenero());
                this.aux3.setEstudio(((Jogos) t).getEstudio());
                this.produtoCarrinho.add(aux3);
            } else if (t.getClass().equals(Livros.class)) {
                this.aux4.setNome(t.getNome());
                this.aux4.setId(t.getId());
                this.aux4.setPreco(t.getPreco());
                this.aux4.setQuantidade(quant);
                this.aux4.setGenero(((Livros) t).getGenero());
                this.aux4.setEscritor(((Livros) t).getEscritor());
                this.aux4.setEditora(((Livros) t).getEditora());
                this.produtoCarrinho.add(aux4);
            } else if (t.getClass().equals(Filmes.class)) {
                this.aux5.setNome(t.getNome());
                this.aux5.setId(t.getId());
                this.aux5.setPreco(t.getPreco());
                this.aux5.setQuantidade(quant);
                this.aux5.setEstudio(((Filmes) t).getEstudio());
                this.aux5.setDiretores(((Filmes) t).getDiretores());
                this.aux5.setGeneros(((Filmes) t).getGeneros());
                this.aux5.setProdutores(((Filmes) t).getProdutores());
                this.produtoCarrinho.add(aux5);
            }
            t.setQuantidade(t.getQuantidade() - quant);
        } else {
            System.out.println("Quantidade de Produto Insuficiente");
        }
    }

    public void removeCarrinho(T t) {
        if (t.getClass().equals(Brinquedos.class)) {
            t.setQuantidade(t.getQuantidade()+aux1.getQuantidade());
            this.produtoCarrinho.remove(aux1);
        } else if (t.getClass().equals(AlbunsDeMusica.class)) {
            t.setQuantidade(t.getQuantidade() + aux2.getQuantidade());
            this.produtoCarrinho.remove(aux2);
        } else if (t.getClass().equals(Jogos.class)) {
            t.setQuantidade(t.getQuantidade() + aux3.getQuantidade());
            this.produtoCarrinho.remove(aux3);
        } else if (t.getClass().equals(Livros.class)) {
            t.setQuantidade(t.getQuantidade() + aux4.getQuantidade());
            this.produtoCarrinho.remove(aux4);
        } else if (t.getClass().equals(Filmes.class)) {
            t.setQuantidade(t.getQuantidade() + aux5.getQuantidade());
            this.produtoCarrinho.remove(aux5);
        }
    }

    public void exibeCarrinho() {
        System.out.println("Cesta de Compras: \n" + produtoCarrinho.toString());
    }

    public double finalizaCompra() {
        double total = (aux1.preco * aux1.quantidade) + (aux2.preco * aux2.quantidade) + (aux3.preco * aux3.quantidade) + (aux4.preco * aux4.quantidade) + (aux5.preco * aux5.quantidade);
        produtoCarrinho.clear();
        return total;
    }

    public CarrinhoCompras() {

    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "produto=" + this.produtoCarrinho +
                '}';
    }

}
