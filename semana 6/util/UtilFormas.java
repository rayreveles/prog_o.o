package util;

import java.util.List;
import java.util.Scanner;

import entidades.*;

public final class UtilFormas {
	
	public static void imprimir(List<Forma> formas)
	{
		//percorrer a lista
		System.out.println("Areas de Formas Geometricas");
		for (Forma forma : formas) {
			
			if(forma instanceof Circulo )
				System.out.println("Area do Circulo = " + forma.getArea());
			else if(forma instanceof Quadrado)
				System.out.println("Area do Quadrado = " + forma.getArea());			
		}
	}

	public static void imprimir(Circulo circulo) {
		System.out.println("Circulo");
		System.out.println("Area = " + circulo.getArea());
	}
  
public static Double ler() {
	Double raio;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Entre com o valor do raio:");
	raio = in.nextDouble();
	
	return raio;
	}
}
