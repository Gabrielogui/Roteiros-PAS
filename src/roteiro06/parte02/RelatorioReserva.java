package roteiro06.parte02;

public class RelatorioReserva {
    private OracleConnection connection;

    public RelatorioReserva(){
        this.connection = new OracleConnection();
    }

    public void gerarRelatorio(){
        this.connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }

}
