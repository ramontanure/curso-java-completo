package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			List<Funcionario> funcionarios = new ArrayList<>();

			String line = br.readLine();
			
			while(line != null) {
				String[] splitLine = line.split(",");
				
				funcionarios.add(new Funcionario(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2])));
				
				line = br.readLine();
			}
			
			System.out.print("Entre com o salário: ");
			double salario = sc.nextDouble();
			
			List<String> emails = funcionarios.stream()
					.filter(f -> f.getSalario() > salario)
					.map(f -> f.getEmail()).collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double somaSalariosM = funcionarios.stream()
					.filter(f -> f.getNome().charAt(0) == 'M')
					.map(f -> f.getSalario())
					.reduce(0.0, (a,b) -> a + b);
			
			System.out.println(somaSalariosM);
					
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
