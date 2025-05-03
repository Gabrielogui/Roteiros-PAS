package roteiro06.parte01;

public class RelatorioReserva {
    private MySqlConnection connection;

    public RelatorioReserva(){
        this.connection = new MySqlConnection();
    }

    public void gerarRelatorio(){
        this.connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }

}
