public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(15);
        System.out.println("Novo Status - Canal Atual: " + smartTv.canal);
    }
}
