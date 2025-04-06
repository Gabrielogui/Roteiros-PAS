package roteiro02.parte04;

import java.util.List;

public class PedidoService {
    private List<String> itens;
    private double total;
    private RegrasDesconto regraDesconto;

    public PedidoService(List<String> itens, RegrasDesconto regrasDesconto){
        this.itens = itens;
        this.total = calcularTotal();
        this.regraDesconto = regrasDesconto;
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
        double totalFinal = regraDesconto.aplicarDesconto(total, desconto);
        System.out.println("O total foi R$" + totalFinal + "Reais");
    }
}
