import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Digite se Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Faça seu primeiro Deposito, Valor: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar a conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }


}
