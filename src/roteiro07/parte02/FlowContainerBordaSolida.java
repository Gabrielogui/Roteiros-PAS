package roteiro07.parte02;

import java.util.ArrayList;

public class FlowContainerBordaSolida extends Container {
    private ArrayList<Components> elements; 
    
    public FlowContainerBordaSolida() {
      this.elements = new ArrayList<Components>();
    }

    @Override
    public void addComponent(Components c) {
        this.elements.add(c);
    }

    @Override
    public void removerComponent(Components c) {
        this.elements.remove(c);
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o FlowContainer");
        System.out.println("Este container contêm bordas solidas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");

    }

}
