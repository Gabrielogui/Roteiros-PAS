package roteiro05.parte01;

public class NotificacaoService {
    
    // NOTIFICAÇÃO POR EMAIL
    public void enviarNotificacaoEmail(String mensagem){
        System.out.println("Email enviado: " + mensagem);
    }

    // NOTIFICAÇÃO POR SMS
    public void enviarNotificacaoSMS(String mensagem){
        System.out.println("SMS enviado: " + mensagem);
    }

    // NOTIFICAÇÃO POR PUSH
    public void enviarNotificacaoPush(String mensagem){
        System.out.println("Enviando notificção de PUSH: " + mensagem);
    }
    

}
