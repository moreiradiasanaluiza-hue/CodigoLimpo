package JunhoAtvs;

import java.util.Scanner;

public class Senha {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int Senha, Tentativa;
	double n1, n2, soma;
	
	System.out.println("Cadastre uma senha (Somente Numeros): ");
	Senha = ler.nextInt();
	
	System.out.println("Digite um número: ");
	n1 = ler.nextDouble();
	
	System.out.println("Digite outro número: ");
	n2 = ler.nextDouble();
	
	soma = (n1+n2);
	
	System.out.println("Digite sua senha para desbloquear a soma: ");
	Tentativa= ler.nextInt();
	
	if (Senha == Tentativa) {
		System.out.println("A Soma é "+ soma);
	
	if (Senha != Tentativa) {
	System.out.println("Erro! Senha Errada! ");
	} ler.close();
}
}
}