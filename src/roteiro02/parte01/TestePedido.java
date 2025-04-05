package roteiro02.parte01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestePedido {
    public static void main(String args[]){
        List<String> itensTotal = new ArrayList<>();
        itensTotal.add("Camiseta");
        itensTotal.add("Calça");
        itensTotal.add("Jaqueta");

        PedidoService pedido01 = new PedidoService(itensTotal);
        PedidoService pedido02 = new PedidoService(itensTotal);
        PedidoService pedido03 = new PedidoService(itensTotal);
        pedido01.processarPedido(0.2); // Desconto de 10% 
        pedido02.processarPedido(0.1); // Sem desconto 
        pedido03.processarPedido(0.4); // Desconto de 40%, mas não aplicado
    }
}
