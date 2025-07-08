package msn;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fac = new FacebookMessenger();
        fac.enviarMensagem();
        fac.receberMensagem();

        TelegramMessenger tel = new TelegramMessenger();
        tel.enviarMensagem();
        tel.receberMensagem();
    }
}
