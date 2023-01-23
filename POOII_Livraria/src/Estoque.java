import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Produtos> {

    List<T> produtos = new ArrayList<>();

    public void addProduto(T t) {
        produtos.add(t);
    }

    public void removeProduto(T t){
        produtos.remove(t);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produtos=" + produtos +
                '}';
    }
}