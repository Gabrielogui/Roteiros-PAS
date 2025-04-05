package roteiro01.parte01;

import java.util.List;


public class PedidoService {
    private MysqlConnection connection;
    private List<String> itens;
    
    public PedidoService (List<String> itens) {
        this.connection = new MysqlConnection();
        this.itens      = itens;
    }
    
    public void processarPedido(){
        this.connection.Conect();
        double total = calcularTotal();
        System.out.println("O total foi: " + total);
    }
    
    private double calcularTotal(){
        double total = 0;
        for(String item: itens){
            if(item.equals("Pizza")) total += 30;
            else if(item.equals("Bebida")) total += 10;
        }
        return total;
    }
}
