package roteiro02.parte04;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class TestePedido {
    public static void main(String args[]){
        List<String> itensTotal = new ArrayList<>();
        itensTotal.add("Camiseta");
        itensTotal.add("Calça");
        itensTotal.add("Jaqueta");

        // DESCONTO PADRÃO:
        RegrasDesconto descontoPadrao = new DescontoPadrao();
        PedidoService pedidoService01 = new PedidoService(itensTotal, descontoPadrao);
        pedidoService01.processarPedido(0.15);

        // DESCONTO VIP:
        RegrasDesconto descontoVip    = new DescontoVip();
        PedidoService pedidoService02 = new PedidoService(itensTotal, descontoVip);
        pedidoService02.processarPedido(0.2);
    }
}
