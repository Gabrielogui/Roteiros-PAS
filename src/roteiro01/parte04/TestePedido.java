package roteiro01.parte04;

import java.util.ArrayList;
import java.util.List;

public class TestePedido {
    
    public static void main(String[] args) {
        List<String> listaItens = new ArrayList<>();
        listaItens.add("Pizza");
        listaItens.add("Bebida");
        
        PedidoService pedido = new PedidoService(listaItens);
        pedido.processarPedido();
    }
}
