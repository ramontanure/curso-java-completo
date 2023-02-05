package application;

import java.util.Scanner;

import model.entities.ContaBancaria;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta bancaria");
			System.out.print("Número da conta: ");
			int numeroConta = sc.nextInt();
			System.out.print("Titular da conta: ");
			String titular = sc.nextLine();
			sc.nextLine();
			System.out.print("Saldo inicial da conta: ");
			Double saldoInicial = sc.nextDouble();
			System.out.print("Saque limite da conta: ");
			Double saqueLimit = sc.nextDouble();
			
			ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldoInicial, saqueLimit);
			
			System.out.print("\nInsira o valor para saque: ");
			Double valorSaque = sc.nextDouble();
			
			conta.saque(valorSaque);
			
			System.out.println("Novo valor: " + conta.getSaldo());
		} catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
