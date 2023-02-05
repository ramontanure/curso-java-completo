package model.entities;

import model.exceptions.DomainException;

public class ContaBancaria {
	private Integer numeroConta;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(Double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void saque(Double valorSaque) {
		if(valorSaque > limiteSaque) {
			throw new DomainException("Saque error: o valor excedeu o limite de saque");
		}
		if(valorSaque > saldo) {
			throw new DomainException("Saque error: saldo insuficiente");
		}
		this.saldo -= valorSaque;
	}
}
