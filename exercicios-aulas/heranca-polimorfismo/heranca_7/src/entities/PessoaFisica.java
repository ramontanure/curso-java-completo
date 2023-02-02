package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAtual, Double gastosSaude) {
		super(nome, rendaAtual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
		if(getRendaAtual() < 20000.00) {
			return getRendaAtual() * 0.15 - gastosSaude * 0.5;
		} else {
			return getRendaAtual() * 0.25 - gastosSaude * 0.5;
		}
	}

}
