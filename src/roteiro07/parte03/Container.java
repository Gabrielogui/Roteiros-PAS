package roteiro07.parte03;

public abstract class Container {
    public abstract void addComponent(Components c);
    public abstract void removerComponent(Components c);
    public abstract void doLayout();

    public void dispose(){
        System.out.println("Fechando o Container! ");
    }
}
