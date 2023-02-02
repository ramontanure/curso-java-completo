package entities;

public class PessoaJuridica extends Contribuinte {
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAtual, Integer numFuncionarios) {
		super(nome, rendaAtual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calcularImposto() {
		if(numFuncionarios > 10) {
			return getRendaAtual() * 0.14;
		} else {
			return getRendaAtual() * 0.16;
		}
	}

}
