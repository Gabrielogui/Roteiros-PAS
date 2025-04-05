package roteiro02.parte01;

import java.util.List;

public class PedidoService {
    private List<String> itens;
    private double total;

    public PedidoService(List<String> itens){
        this.itens = itens;
        this.total = calcularTotal();
    }

    public double aplicarDesconto(double desconto){
        System.out.println(desconto);
        if((desconto >= 0.0) && (desconto <= 0.3)){
            total -= (total*desconto);
        }
        System.out.println(desconto);
        return total;
    }

    public double calcularTotal(){
        double total = 0; 
        for (String item : itens) { 
            if (item.equals("Camiseta")) total += 50.0; 
            else if (item.equals("Calça")) total += 100.0;
            else if (item.equals("Jaqueta")) total += 200.0; 
        } 
        return total;
    }

    public void processarPedido(double desconto){
        double totalFinal = aplicarDesconto(desconto);
        System.out.println("O total foi R$" + totalFinal + "Reais");
    }
}
