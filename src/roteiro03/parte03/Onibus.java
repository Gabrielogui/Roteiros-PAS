package roteiro03.parte03;

public class Onibus extends VeiculoTransporte {
    private double consumoPorKm;

    public Onibus(double tarifaBase, double distancia){
        super(distancia);
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa(){
        return super.tarifaBase*1.2;
    }

    @Override
    public double calcularTotalCombustivel(double consumoPorKm){
        this.consumoPorKm = consumoPorKm;
        return this.consumoPorKm * this.getDistancia();
    }
}
