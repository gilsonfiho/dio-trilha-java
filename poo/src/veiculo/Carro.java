package veiculo;
public class Carro extends Veiculo {

    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado!");
    }
    private void confereCombustivel(){
        System.out.println("Confere Combustivel!");
    }
    private void confereCambio(){
        System.out.println("Confere Cambio!");
    }
       
       
    
}
