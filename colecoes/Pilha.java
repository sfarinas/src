package colecoes;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		Stack<String> Pilha = new Stack<String>();
		
		Pilha.add("Jobs");
		Pilha.add("O Hobbit");
		Pilha.push("Don Quixote");
		Pilha.push("O Pequeno Principe");
		
		
		for(String nome: Pilha) {
			System.out.println("Pilha atual  " + nome);
		}
			System.out.println("Vendo o primeiro a ser lido " );
			System.out.println(Pilha.peek());
			
			System.out.println("pop ira tira da pilha");
			System.out.println(Pilha.pop());
			
			for(String nome: Pilha) {
				System.out.println("Pilha atual  " + nome);
			}
		
	}

}
