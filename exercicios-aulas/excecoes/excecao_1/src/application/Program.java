package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of program");
	}
	public static void method1() {
		System.out.println("*** METHOD 1 START ***");
		method2();
		System.out.println("*** METHOD 1 END ***");
	}
	
	public static void method2() {
		System.out.println("*** METHOD 2 START ***");
		Scanner sc = new Scanner(System.in);
		
		try {
			//Corresponde a execução normal mas pode gerar uma exceção
			String[] vect = sc.nextLine().split(" ");
			
			int position = sc.nextInt();
			System.out.println(vect[position]);
			//Catch é capturar a exceção
		} catch(ArrayIndexOutOfBoundsException e) {
			//Exceção que foi gerada a partir do try
			//Exceção de index do array, caso não for encontrado cai nessa exceção
			System.out.println("Invalid position!");
			//Imprime na tela o rastreamento do stack(pilha)
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input error! ");
		}
				
		sc.close();
		System.out.println("*** METHOD 2 END ***");

	}

}
