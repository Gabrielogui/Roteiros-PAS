package roteiro06.parte01;

public class ServicoReserva {
    private MySqlConnection connection;

    public ServicoReserva(){
        this.connection = new MySqlConnection();
    }

    public void criarReserva(){
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }

}
