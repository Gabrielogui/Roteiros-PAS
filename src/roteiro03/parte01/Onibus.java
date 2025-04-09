package roteiro03.parte01;

public class Onibus extends VeiculoTransporte {
    
    public Onibus(double tarifaBase){
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa(){
        return super.tarifaBase*1.2;
    }
}
