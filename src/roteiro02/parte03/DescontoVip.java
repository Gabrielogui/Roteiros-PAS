package roteiro02.parte03;

public class DescontoVip implements RegrasDesconto{
    @Override
    public double aplicarDesconto(double total){
        return total*0.8;
    }
}
