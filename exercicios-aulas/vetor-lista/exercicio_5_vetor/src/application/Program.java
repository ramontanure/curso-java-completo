package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}

		double maiorValor = 0;
		int posicaoMaiorValor = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicaoMaiorValor = i;
			}
		}

		System.out.printf("MAIOR VALOR: " + maiorValor);
		System.out.printf("\nPOSIÇÃO DO MAIOR VALOR: " + posicaoMaiorValor);

		sc.close();

	}

}
