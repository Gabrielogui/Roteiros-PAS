package roteiro05.parte01;

public class TesteNotificacao {
    
    public static void main(String args[]){
        NotificacaoService notificacao = new NotificacaoService();

        notificacao.enviarNotificacaoEmail("Bem Vindo ao Sistema!");
        notificacao.enviarNotificacaoSMS("Seu código de verificação é 1234");
        notificacao.enviarNotificacaoPush("Alerta: Você tem uma nova mensagem!");
    }
}
