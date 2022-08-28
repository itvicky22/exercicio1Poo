package aplication;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
			
		System.out.println("Entre com a Altura e a Largura: ");
		x.a = ler.nextDouble();
		ler.nextLine();
		x.b = ler.nextDouble();

		double A = x.area();		// A - area
		double B = x.perimetro();	// B - perimetro
		double C = x.diagonal();	// C - diagonal
		
		System.out.println("AREA = "+A);
		System.out.println("PERIMETRO = "+B);
		System.out.println("DIAGONAL = "+C);
		
		ler.close();
	}

}
