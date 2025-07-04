import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCash {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        try{
            System.out.println("Digite seu Nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu SobreNome: ");
            String sobreNome = scanner.next();

            System.out.println("Digite sua Idade: ");
            int idade = scanner.nextInt();
            System.out.println("O seu nome é " + nome + sobreNome + " e sua idade é " + idade);
        }
        catch(InputMismatchException e){
            System.out.println("O campo idade precisa ser numerico! ");
        }

        
    }
}
