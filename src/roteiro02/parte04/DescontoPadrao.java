package roteiro02.parte04;

public class DescontoPadrao implements RegrasDesconto{
    @Override
    public double aplicarDesconto(double total, double desconto){
        if((desconto >= 0.0) && (desconto <= 0.3)) return total*(1 - desconto);
        return total;
    }
}
