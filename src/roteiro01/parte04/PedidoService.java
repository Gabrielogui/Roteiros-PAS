package roteiro01.parte04;

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
        int pizza = 0;
        int bebida = 0;
        for(String item: itens){
            if(item.equals("Pizza")){
                total += 30;
                pizza = 1;
            }
            else if(item.equals("Bebida")){
                total += 10;
                bebida = 1;
            }
        }
        if (pizza == 1)
        {
            if (bebida == 1) return total * 0.85;
            else return total * 0.90;
        }
        else return total;
    }
}
