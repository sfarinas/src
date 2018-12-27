package aulaJava;

import java.util.Scanner;

public class WhileInderterminado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		int numeroDeNotas = 0;
		double somaDasNotas = 0;
		
		while (nota != -1) {
			nota = scanner.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
				
			}
		}
		scanner.close();
		System.out.printf("A Média é %.2f", somaDasNotas / numeroDeNotas);
		
	}

}
