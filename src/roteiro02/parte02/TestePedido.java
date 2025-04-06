package roteiro02.parte02;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class TestePedido {
    public static void main(String args[]){
        List<String> itensTotal = new ArrayList<>();
        itensTotal.add("Camiseta");
        itensTotal.add("Calça");
        itensTotal.add("Jaqueta");

        RegrasDesconto rd01 = new DescontoLivre(0.1);
        RegrasDesconto rd02 = new DescontoLivre(0);
        RegrasDesconto rd03 = new DescontoLivre(0.4);

        PedidoService pedido01 = new PedidoService(itensTotal, rd01);
        PedidoService pedido02 = new PedidoService(itensTotal, rd02);
        PedidoService pedido03 = new PedidoService(itensTotal, rd03);
        pedido01.processarPedido(); // Desconto de 10% 
        pedido02.processarPedido(); // Sem desconto 
        pedido03.processarPedido(); // Desconto de 40%, mas não aplicado
    }
}
