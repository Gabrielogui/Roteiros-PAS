package roteiro03.parte02;

public class TesteTransporte {
    public static void main(String[] args) {
        
        VeiculoTransporte veiculo01 = new Onibus(5.0);
        VeiculoTransporte veiculo02 = new Bicicleta();

        System.out.println("Tarifa Ônibus: R$ " + veiculo01.calcularTarifa());
        System.out.println("Tarifa Bicicleta: R$ " + veiculo02.calcularTarifa()); 

    }
}
