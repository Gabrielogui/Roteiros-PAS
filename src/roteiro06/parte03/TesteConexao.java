package roteiro06.parte03;

public class TesteConexao {
 
    public static void main(String[] args) {
        
        Connection cMysql = new MySqlConnection();
        Connection cOracle = new OracleConnection();

        ServicoQuarto quarto01 = new ServicoQuarto(cMysql);
        ServicoQuarto quarto02 = new ServicoQuarto(cOracle);
        quarto01.verificarQuarto();
        quarto02.verificarQuarto();
        
        ServicoReserva reserva01 = new ServicoReserva(cMysql);
        ServicoReserva reserva02 = new ServicoReserva(cOracle);
        reserva01.criarReserva();
        reserva02.criarReserva();
        
        RelatorioReserva relatorio01 = new RelatorioReserva(cMysql);
        RelatorioReserva relatorio02 = new RelatorioReserva(cOracle);
        relatorio01.gerarRelatorio();
        relatorio02.gerarRelatorio();
    }
}

