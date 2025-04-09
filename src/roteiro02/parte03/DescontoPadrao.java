package roteiro02.parte03;

public class DescontoPadrao implements RegrasDesconto{
    @Override
    public double aplicarDesconto(double total){
        return total*0.9;
    }
}
