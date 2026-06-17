package JunhoAtvs;

import java.util.Scanner;

public class Multiplo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double numero;
		System.out.println("Informe um valor: ");
		numero = ler.nextDouble();
		
		if (numero % 5 ==0) {
			System.out.println("O Número "+ numero + " é multiplo de 5 ");
			
		if (numero % 5 != 0) {
			System.out.println("O Número "+ numero+ " não é multiplo de 5 ");
		 }ler.close();
	   }
		
	}
}
