package entities;

public abstract class Contribuinte {
	
	private String nome;
	private Double rendaAtual;
	
	public Contribuinte() {
		
	}

	public Contribuinte(String nome, Double rendaAtual) {
		this.nome = nome;
		this.rendaAtual = rendaAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAtual() {
		return rendaAtual;
	}

	public void setRendaAtual(Double rendaAtual) {
		this.rendaAtual = rendaAtual;
	}
	
	public abstract double calcularImposto();
}
