package roteiro05.parte04;

public class NotificacaoWpp implements Notificacao{
    public void enviar(String mensagem){
        System.out.println("Enviado por Whatsapp: " + mensagem);
    }
}
