package roteiro01.parte05;

import java.util.List;

public class CalculadoraPreco {
    public double calcularTotal(List<String> itens){
        double total = 0;
        boolean pizzaFlag = false;
        boolean bebidaFlag = false;
        for(String item: itens){
            if(item.equals("Pizza")){
                total += 30;
                pizzaFlag = true;
            }
            else if(item.equals("Bebida")){
                total += 10;
                bebidaFlag = true;
            }
        }
        return calcularDesconto(total, pizzaFlag, bebidaFlag);
    }
    
    private double calcularDesconto(double total, boolean pizza, boolean bebida)
    {
        if (pizza == true)
        {
            if (bebida == true) return total * 0.85;
            
            else return total * 0.90;
        }
        else return total;
    }
}
