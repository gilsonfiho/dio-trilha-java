package msn;
public class ServiceMenssenger {
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando Conexão");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Historico");
    }
    
}
