package entities;

//A classe business herda de account, ou seja tem todos os dados e comportamentos
//É uma sub classe de account
public final class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		//Caso tenha alguma regra no constructor da super classe eu posso inserir nessa classe também com o super vazio
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//Chamando o constructor da super classe, ou seja da classe pai e passando os argumentos
		//Executa a lógica do constructor da super classe(classe pai)
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	//Esse metodo não pode ser sobreposto por uma subclasse
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
