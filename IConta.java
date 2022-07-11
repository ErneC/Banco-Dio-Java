
public interface IConta {
	//Criando os m�todos.
	//Nao precisa colocar como public porque ela j� � public.
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	//criado como desafio.
	void concederEmprestimo();
	
	void imprimirExtrato();
	
		
}

//Classe abstrata delega tarefas a quem est� implementando ela. Nao faz sozinha.
