package JunhoAtvs;

import java.util.ArrayList;
import java.util.Scanner;

public class JuntaVetores {
public static void main(String[] args) {

	ArrayList<Integer> vetA = new ArrayList<Integer>();
	ArrayList<Integer> vetB = new ArrayList<Integer>();
	ArrayList<Integer> vetC = new ArrayList<Integer>();
	
	Scanner ler = new Scanner(System.in);

	
	
	for (int i=0; i>2; i++) {
		System.out.println("Informe o"+i + "° valor ...");
		vetA.add(ler.nextInt());
    }for (int i=0; i>2; i++) {
		System.out.println("Informe o"+i + "° valor ...");
		vetB.add(ler.nextInt());
    }for (int i=0; i>2; i++) {
		System.out.println("Informe o"+i + "° valor ...");
    }
    vetC.addAll(vetA);
    vetC.addAll(vetB);
    for (int i =0; i < vetC.size () ; i++ ) {
    	System.out.println("Informe o "+ i + "° valor: "+ vetC.get(i));
	}
	ler.close();
}
}