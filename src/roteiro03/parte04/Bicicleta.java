package roteiro03.parte04;

public class Bicicleta extends VeiculoTransporte{

    public Bicicleta (double distancia)
    {
       super(distancia); 
    }


    @Override
    public double calcularTarifa(){
        return 0;
    }
}
