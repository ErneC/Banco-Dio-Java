
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;
	
	//Costructor da conta
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); //this é o objeto de origem.
		contaDestino.depositar(valor);
		
	}
	
	// Criando o método como foi sugerido no desafio da aula.
	@Override
	public void concederEmprestimo() {
		saldo = saldo * 10;
		System.out.println("\nEmpréstimo disponivel no valor de R$: "+saldo);
	}
	
		
	// Criando getters.
	public int getAgencia() {
		return agencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	
	//public void imprimirEmprestimo() {
		//System.out.println("Empréstimo disponivel no valor de: ");
	//}
	
}
