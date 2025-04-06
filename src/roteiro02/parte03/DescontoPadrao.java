package roteiro02.parte04;

public class DescontoPadrao implements RegrasDesconto{
    @Override
    public double aplicarDesconto(double total){
        return total*0.9;
    }
}
