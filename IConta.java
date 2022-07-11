
public interface IConta {
	//Criando os métodos.
	//Nao precisa colocar como public porque ela já é public.
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	//criado como desafio.
	void concederEmprestimo();
	
	void imprimirExtrato();
	
		
}

//Classe abstrata delega tarefas a quem está implementando ela. Nao faz sozinha.
