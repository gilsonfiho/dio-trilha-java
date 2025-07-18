
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	@Override
	protected boolean autenticarCliente(String string) {
		throw new UnsupportedOperationException("Unimplemented method 'autenticarCliente'");
	}

	@Override
	public String toString() {
		return "ContaPoupanca []";
	}

	
}
