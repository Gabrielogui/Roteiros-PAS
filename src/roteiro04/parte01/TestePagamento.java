package roteiro04.parte01;

public class TestePagamento {
    public static void main(String[] args) {
        System.out.println("======= CARTÃO =======");
        MetodoPagamento cartaoCredito = new CartaoCredito();
        cartaoCredito.processarPagamento(100);
        cartaoCredito.gerarFatura();


        System.out.println("======= BOLETO =======");
        MetodoPagamento boletoBancario = new BoletoBancario();
        boletoBancario.processarPagamento(100);
        boletoBancario.gerarFatura();

        System.out.println("======= CRIPTO =======");
        MetodoPagamento criptomoeda = new Criptomoeda();
        criptomoeda.processarPagamento(100);
        criptomoeda.gerarFatura();
    }
}
