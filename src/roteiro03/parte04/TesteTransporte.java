package roteiro03.parte04;

public class TesteTransporte {
    public static void main(String[] args) {
        
        VeiculoTransporte veiculo01 = new Onibus(5.0, 10.0);
        VeiculoTransporte veiculo02 = new Bicicleta(10.0);

        System.out.println("Tarifa Ônibus: R$ " + veiculo01.calcularTarifa());
        System.out.println("Tarifa Bicicleta: R$ " + veiculo02.calcularTarifa()); 

        System.out.println("Tarifa Ônibus: R$ " + veiculo01.calcularTarifa());
        System.out.println("Distância Ônibus: " + veiculo01.getDistancia());
        System.out.println("Tarifa Bicicleta: R$ " + veiculo02.calcularTarifa()); 
        System.out.println("Distância Bicicleta: " + veiculo01.getDistancia());
        
        System.out.println("CALCULO DE CONSUMO DA VIAGEM");
        if (veiculo01 instanceof Onibus){
            System.out.println("Consumo Veiculo 1: " + ((Onibus)veiculo01).calcularTotalCombustivel(12));
        }
        else{
            System.out.println("Veiculo 1: Não é um veículo motorizado");
        }

        if (veiculo02 instanceof Onibus){
            System.out.println("Consumo Veiculo 2: " + ((Onibus)veiculo02).calcularTotalCombustivel(12));
        }
        else{
            System.out.println("Veiculo 2: Não é um veículo motorizado");
        }

    }
}
