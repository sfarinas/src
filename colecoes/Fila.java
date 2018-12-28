package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.offer("Zorro");
		fila.offer("Salomao");
		fila.offer("Simone");
		fila.add("Sara");
		
		// PEEK RETORNA NULO SE FILA = VAZIO,
		// ELEMENT RETORNA ERRO SE FILA = VAZIO. 
		System.out.println("Peek/Element ... ");
		System.out.println("Olhando o proximo " + fila.peek());
		System.out.println("Em atendimento " + fila.poll()); // REMOVE O PRIMEIRO DA FILA
		System.out.println("Proximo " + fila.element());
		System.out.println("Em atendimento " + fila.remove()); // REMOVE O PRIMEIRO DA FILA
		
		for(String nome: fila) {
			System.out.println("Quem ainda esta na espera " + nome);
		}
	}

}
