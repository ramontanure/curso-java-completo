package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Produto> list = new ArrayList<>();

		String path = "c:\\temp\\csvexercicio.csv";
		String pathTarget = "c:\\temp\\out.csv";


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] lineSplit = line.split(",");
				String nome = lineSplit[0];
				double preco = Double.parseDouble(lineSplit[1]);
				Integer quantidade = Integer.parseInt(lineSplit[2]);

				Produto produto = new Produto(nome, preco, quantidade);
				list.add(produto);

				line = br.readLine();
			}			

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathTarget))) {
				for (Produto item : list) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.calcula()));
					bw.newLine();
				}
				System.out.println(pathTarget + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}