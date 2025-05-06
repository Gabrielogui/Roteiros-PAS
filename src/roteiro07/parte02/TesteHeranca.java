package roteiro07.parte02;

public class TesteHeranca {
    public static void main(String[] args) {
        
        Components button = new Components("Button");
        Components textBox = new Components("TextBox");
        Components textField = new Components("TextField");
        Components checkBox = new Components("CheckBox");
        Components combobox = new Components("ComboBox");
        Components label = new Components("Label");
        Components radiobutton = new Components("RadioButton");
        
        // Criando um GridContainer para adicionar os elementos
        Container c1 = new GridContainer(2, 2);
        c1.addComponent(button);     
        c1.addComponent(textBox);
        c1.addComponent(textField);  
        c1.addComponent(checkBox);
        
        c1.doLayout();
        System.out.println(" ************************ ");
        
        // Criando um FlowContainer para adicionar os elementos
        Container c2 = new FlowContainer();
        c2.addComponent(combobox);       
        c2.addComponent(label);
        c2.addComponent(radiobutton);
        
        c2.doLayout();
        System.out.println(" ************************ ");
        
        // Criando um FlowContainer com Pordas Pontilhadas para adicionar os elementos
        Container c3 = new FlowContainerBordaPontilhada();
        c3.addComponent(radiobutton);      
        c3.addComponent(label);
        c3.addComponent(combobox);
        
        c3.doLayout();
        System.out.println(" ************************ ");

        // Criando um FlowContainer com Bordas Solidas para adicionar os elementos
        Container c4 = new FlowContainerBordaSolida();
        c4.addComponent(radiobutton);         
        c4.addComponent(label);
        c4.addComponent(combobox);
        
        c4.doLayout();


    }
}
