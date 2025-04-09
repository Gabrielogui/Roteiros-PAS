package roteiro03.parte03;

public abstract class VeiculoTransporte {
    protected double tarifaBase;
    protected double distancia;

    public VeiculoTransporte(double distancia){
        this.distancia = distancia;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public abstract double calcularTarifa();
    public abstract double calcularTotalCombustivel(double consumoPorKm);
}
