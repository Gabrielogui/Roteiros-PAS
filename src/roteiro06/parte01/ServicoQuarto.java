package roteiro06.parte01;

public class ServicoQuarto {
    private MySqlConnection connection;

    public ServicoQuarto(){
        this.connection = new MySqlConnection();
    }

    public void verificarQuarto(){
        this.connection.connect();
        System.out.println("Lógica de negócio para o Serviço de Quarto");
    }
 
}
