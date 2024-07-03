package desafio_Dio_Banco;

public interface IConta {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);

}
