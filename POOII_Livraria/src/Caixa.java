public class Caixa {
    public double valorCaixa = 0;

    public void adicionaDinheiro(double valor) {
        valorCaixa = valorCaixa + valor;
    }

    public void exibeCaixa() {
        System.out.println("Valor do Caixa: R$ " + valorCaixa);
    }


}
