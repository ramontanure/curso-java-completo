package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		Pessoa[] pessoas = new Pessoa[n];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa: ", i + 1);
			System.out.print("\nNome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			pessoas[i] = new Pessoa(nome, idade, altura);
		}

		double soma = 0.0;
		int cont = 0;

		for (int i = 0; i < pessoas.length; i++) {
			soma += pessoas[i].getAltura();

			if (pessoas[i].getIdade() < 16) {
				cont++;
			}
		}

		double mediaAlturas = soma / n;

		System.out.printf("\nAltura média: %.2f%n", mediaAlturas);

		double percent = cont * 100.0 / n;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}

		sc.close();

	}

}