package desafio_Dio_Banco;

public class Main {

	public static void main(String[] args) {
		Cliente raniel = new Cliente();
		raniel.setNome("Raniel");
		
		Conta cc = new ContaCorrente(raniel);
		Conta poupanca = new ContaPoupanca(raniel);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
