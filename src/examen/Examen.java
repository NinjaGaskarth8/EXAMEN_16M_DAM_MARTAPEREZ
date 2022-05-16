package examen;

import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		int numero;
		
		System.out.println("Buenos días Ceinmark, soy Marta Pérez");
		
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		numero = ent.nextInt();
		
	}
		public static boolean esPrimo(int numero){
			  int contador = 2;
			  boolean primo=true;
			  while ((primo) && (contador!=numero)){
			    if (numero % contador == 0)
			      primo = false;
			    contador++;
			  }
			  return primo;
	
	}

}
