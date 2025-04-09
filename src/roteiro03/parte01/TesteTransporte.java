package roteiro03.parte01;

public class TesteTransporte {
    public static void main(String[] args) {
        
        double tarifa = 2.0;
        VeiculoTransporte onibus = new Onibus(tarifa);
        System.out.println("Valor: R$" + onibus.calcularTarifa() + " Reais");

        try {
            VeiculoTransporte bicicleta = new Bicicleta();
            System.out.println("Tarifa Bicicleta: R$ " + bicicleta.calcularTarifa());
        } catch (UnsupportedOperationException e) {
            System.out.println("Bicicletas não têm tarifa, então ignoramos esse cálculo.");
        }


    }
}
