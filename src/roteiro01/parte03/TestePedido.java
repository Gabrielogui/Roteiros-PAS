package roteiro01.parte03;

import java.util.ArrayList;
import java.util.List;

public class TestePedido {
    
    public static void main(String[] args) {
        MysqlConnection connection = new MysqlConnection();
        
        List<String> listaItens = new ArrayList<>();
        listaItens.add("Pizza");
        listaItens.add("Bebida");
        
        PedidoService pedido = new PedidoService(connection, listaItens);
        pedido.processarPedido();
    }
}
