package aulaJava;

import java.util.Scanner;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double somaDasNotas = 0;
		
		int indice = 0;
		while (indice < 3) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		scanner.close();
		System.out.printf("A Media � %.2f", somaDasNotas / 3);
	}

}
