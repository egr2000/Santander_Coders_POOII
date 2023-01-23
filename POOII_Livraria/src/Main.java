import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estoque> estoqueGeral = new ArrayList<>();

        Estoque<Brinquedos> brinquedoEstoque = new Estoque<Brinquedos>();
        Estoque<Livros> livroEstoque = new Estoque<Livros>();
        Estoque<Filmes> filmeEstoque = new Estoque<Filmes>();
        Estoque<Jogos> jogoEstoque = new Estoque<Jogos>();
        Estoque<AlbunsDeMusica> albumMudicaEstoque = new Estoque<AlbunsDeMusica>();

        //adicionando os estoques individuais ao estoque geral
        estoqueGeral.add(brinquedoEstoque);
        estoqueGeral.add(jogoEstoque);
        estoqueGeral.add(livroEstoque);
        estoqueGeral.add(filmeEstoque);
        estoqueGeral.add(albumMudicaEstoque);

        CarrinhoCompras cesta = new CarrinhoCompras();
        Caixa caixa = new Caixa();

        //criando os produtos
        Brinquedos hotwheels = new Brinquedos("HotWheels", 001, 12.99, 10, "carrinho");
        Brinquedos barbie = new Brinquedos("Barbie", 002, 19.99, 10, "boneca");
        Brinquedos carrinhoControle = new Brinquedos("Carrinho de controle remoto", 003, 109.90, 10, "carrinho");
        Brinquedos minecraft = new Brinquedos("Minecraft", 004, 9.99, 10, "boneco");
        Brinquedos sonic = new Brinquedos("Sonic", 005, 5.00, 10, "boneco");
        Brinquedos tails = new Brinquedos("Tails", 006, 5.00, 10, "boneco");
        Jogos gow = new Jogos("God of War", 007, 39.90, 10, "Sony", "Ação", "Sony");
        Jogos fifa = new Jogos("Fifa", 8, 99.90, 5, "Sony", "Futebol", "Sony");
        Jogos granTurismo = new Jogos("Gran Turismo", 9, 129.90, 5, "Sony", "corrida", "Sony");
        Jogos grid = new Jogos("GRID", 010, 199.00, 5, "Microsoft", "corrida", "Microsoft");
        Filmes mib = new Filmes("Homens de Preto", 011, 39.90, 10, "Columbia", "Barry Sonnenfeld", "Comédia", "Walter Parkes");
        Filmes voltaFuturo = new Filmes("De Volta para o Futuro", 012, 30.00, 5, "Universal", "Robert Zemeckis", "Ficção", "Bob Gale");
        Filmes starWars = new Filmes("Star Wars", 013, 50.00, 5, "Lucasfilm", "George Lucas", "Ficção", "Lucasfilm");
        Filmes tiraDaPesada = new Filmes("Um Tira da Pesada", 014, 20.90, 6, "Paramount", "John Landis", "Ação", "Paramount");
        Filmes titanic = new Filmes("Titanic", 015, 20.00, 5, "Paramount", "James Cameron", "Romance", "James Cameron");
        Livros morteAdivinho = new Livros("A morte do adivinho", 016, 31.10, 10, "Misterio", "Rudolph Fisher", "HarperCollins");
        Livros codigoLimpo = new Livros("Código Limpo", 017, 89.00, 10, "Design de Software", "Robert C. Martin", "Alta Books");
        Livros javaLeigos = new Livros("Java para Leigos", 18, 59.00, 5, "Desenvolvimento", "Barry Burd", "Alta Books");
        Livros senhorAneis = new Livros("O Senhor dos Aneis", 19, 54.50, 5, "Fantasia", "J.R.R. Tolkien", "HarperCollins");
        Livros pinoquio = new Livros("Pinoquio", 020, 49.99, 6, "infantil", "Carlo Collodi", "Darkside");
        AlbunsDeMusica metallica = new AlbunsDeMusica("Mettalica: ReLoad", 021, 19.90, 3, "Metallica", "Rock", "Vertigo");
        AlbunsDeMusica queen = new AlbunsDeMusica("Queen: Live at Wembley", 022, 19.90, 8, "Queen", "Rock", "Parlophone");
        AlbunsDeMusica chitaoXororo = new AlbunsDeMusica("Xitãozinho & Xororó", 023, 29.90, 1, "Xitãozinho e Xororó", "Sertanejo", "PolyGram");
        AlbunsDeMusica xuxa = new AlbunsDeMusica("Xuxa só para Baixinhos", 024, 5.99, 3, "Xuxa", "infantil", "Som Livre");
        AlbunsDeMusica coldplay = new AlbunsDeMusica("Coldplay: Parachutes", 025, 39.90, 5, "Coldplay", "Rock", "Capitol Record");

        //Adicionando os produtos aos estoques
        brinquedoEstoque.addProduto(hotwheels);
        brinquedoEstoque.addProduto(barbie);
        brinquedoEstoque.addProduto(carrinhoControle);
        brinquedoEstoque.addProduto(minecraft);
        brinquedoEstoque.addProduto(sonic);
        brinquedoEstoque.addProduto(tails);
        jogoEstoque.addProduto(gow);
        jogoEstoque.addProduto(fifa);
        jogoEstoque.addProduto(granTurismo);
        jogoEstoque.addProduto(grid);
        filmeEstoque.addProduto(mib);
        filmeEstoque.addProduto(voltaFuturo);
        filmeEstoque.addProduto(starWars);
        filmeEstoque.addProduto(tiraDaPesada);
        filmeEstoque.addProduto(titanic);
        livroEstoque.addProduto(morteAdivinho);
        livroEstoque.addProduto(codigoLimpo);
        livroEstoque.addProduto(javaLeigos);
        livroEstoque.addProduto(senhorAneis);
        livroEstoque.addProduto(pinoquio);
        albumMudicaEstoque.addProduto(metallica);
        albumMudicaEstoque.addProduto(queen);
        albumMudicaEstoque.addProduto(chitaoXororo);
        albumMudicaEstoque.addProduto(xuxa);
        albumMudicaEstoque.addProduto(coldplay);
        cesta.adicionaCarrinho(hotwheels, 4);
        cesta.adicionaCarrinho(metallica, 2);
        cesta.adicionaCarrinho(fifa, 1);
        cesta.adicionaCarrinho(codigoLimpo, 1);
        cesta.adicionaCarrinho(mib, 2);
        cesta.exibeCarrinho();
        double a = cesta.finalizaCompra();
        cesta.exibeCarrinho();
        caixa.adicionaDinheiro(a);
        caixa.exibeCaixa();
    }
}