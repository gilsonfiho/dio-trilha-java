package veiculo;


public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("889957");
        jeep.ligar();

        Motocycle z400 = new Motocycle();
        z400.setChassi("454854");
        z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
