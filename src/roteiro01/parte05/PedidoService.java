package roteiro01.parte05;

import java.util.List;


public class PedidoService {
    private MysqlConnection connection;
    private List<String> itens;
    private CalculadoraPreco calculadora;
    
    public PedidoService (MysqlConnection connection, List<String> itens) {
        this.connection  = connection;
        this.itens       = itens;
        this.calculadora = new CalculadoraPreco();
    }
    
    public void processarPedido(){
        this.connection.Conect();
        double total = calculadora.calcularTotal(this.itens);
        System.out.println("O total foi: " + total);
    }
    
    
}
