package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vendedor:");
		String nome = sc.nextLine();
		System.out.println("Meta: ");
		double meta = sc.nextDouble();
		System.out.println("Total Vendido: ");
		double totalVendido = sc.nextDouble();
	
		Vendedor vendedor = new Vendedor(nome, meta, totalVendido);
		
		vendedor.calcularComissao();
		 
		System.out.println(vendedor);
		
		sc.close();
		
	}

}
