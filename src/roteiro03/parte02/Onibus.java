package roteiro03.parte02;

public class Onibus extends VeiculoTransporte {
    
    public Onibus(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa(){
        return super.tarifaBase*1.2;
    }
}
