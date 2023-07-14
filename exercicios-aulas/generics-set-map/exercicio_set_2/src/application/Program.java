package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		Set<Integer> setC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int valueA = sc.nextInt();
		
		for(int i = 0; i < valueA; i++) {
			setA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		int valueB = sc.nextInt();
		
		for(int i = 0; i < valueB; i++) {
			setB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int valueC = sc.nextInt();
		
		for(int i = 0; i < valueC; i++) {
			setC.add(sc.nextInt());
		}
		
		Set<Integer> setColection = new HashSet<>(setA);
		setColection.addAll(setB);
		setColection.addAll(setC);
		System.out.print("Total students: " + setColection.size());
		
		sc.close();
	}

}
