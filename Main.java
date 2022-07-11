
public class Main {

	public static void main(String[] args) {
		
		Cliente Ernestina = new Cliente();
		Ernestina.setNome("Ernestina");
		Ernestina.setCpf("000.000.000-00");
		
		
		Conta cc = new ContaCorrente(Ernestina);
		cc.depositar(300);
		cc.sacar(50);
		
		 		
		Conta cp = new ContaPoupanca(Ernestina);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();  //150,00
		cp.imprimirExtrato(); // 100,00
		//desafio
		cc.concederEmprestimo(); //Empréstimo disponível no valor de 1500.00
		//cp.concederEmprestimo(); //Empréstimo disponível no valor de 1000.00
		
		
		 
		
				
	}
}