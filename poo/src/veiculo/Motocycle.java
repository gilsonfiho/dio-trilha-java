package veiculo;
public class Motocycle extends Veiculo {
    public void ligar(){
        confereCombustivel();
        System.out.println("Moto Ligada Ligado!");
    }
    private void confereCombustivel(){
        System.out.println("Confere Combustivel!");
    }
}
