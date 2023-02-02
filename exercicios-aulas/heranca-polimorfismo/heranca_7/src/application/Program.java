package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + " data: ");
			System.out.print("Pessoa Física ou Pessoa Jurídica? (f/j)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("Renda atual: ");
			double rendaAtual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAtual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAtual, numFuncionarios));
			}
		}
		
		System.out.println("\nTAXES PAID: ");
		double sum = 0.0;
		for(Contribuinte contribuinte : list) {
			System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.calcularImposto()));
			sum += contribuinte.calcularImposto();
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}

}
