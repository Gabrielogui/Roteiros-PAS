package roteiro02.parte02;

public class DescontoLivre implements RegrasDesconto {
    private double desconto;

    public DescontoLivre(double desconto){
        this.desconto = desconto;
    }

    public double aplicarDesconto(double total){
        if((desconto >= 0.0) && (desconto <= 0.3)){
            total -= (total*desconto);
        }
        return total;
    }
}
