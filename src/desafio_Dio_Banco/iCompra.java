package desafio_Dio_Banco;

public interface iCompra {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);

}