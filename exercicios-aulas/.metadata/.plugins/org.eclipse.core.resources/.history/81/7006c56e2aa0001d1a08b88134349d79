package entities;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//Sobreposição de metodo, indica que estou implementando um metodo da superclasse na subclasse
	//override Indica que é uma sobreposição de metodo
	//Override ele procura na superclasse e se não encontra acontece um erro
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
