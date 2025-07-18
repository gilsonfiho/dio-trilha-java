
public class Main {

	public static void main(String[] args) {
		Cliente gilson = new Cliente();
		gilson.setNome("Gilson");

		Conta cc = new ContaCorrente(gilson);
		Conta poupanca = new ContaPoupanca(gilson);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
