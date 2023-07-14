package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Estabelecendo uma stream(Sequencia de leitura) a partir desse caminho
			// Instancio a partir do filereader pra deixar mais rapido a leitura

			// Vai ler a linha do arquivo, se a linha estiver no final vai retornar null
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
