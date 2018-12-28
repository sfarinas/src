package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<String>();
		
		aprovados.add("Salomao");
		aprovados.add("Adalberto");
		aprovados.add("Gustavo");
		aprovados.add("Sara");
		aprovados.add("Simone");
		aprovados.add("Renata");
		aprovados.add("Thaina");
		
		for(String nome: aprovados) {
		System.out.println(nome);	
		}
		
		System.out.println("Get ...");
		System.out.println(aprovados.get(0)); // PEGANDO PEÇO INDEXE
		System.out.println(aprovados.get(4));
		
		System.out.println("Quantos Elementos temos na Lista : ");
		System.out.println(aprovados.size());
		
		System.out.println("Vamos adicionar mais um elemento, repetido : ");
		System.out.println(aprovados.add("Salomao"));
		
		System.out.println("Recontando os Elementos na Lista : ");
		System.out.println(aprovados.size());
		
		// VENDO A LISTA TODA
		for(String nome: aprovados) {
			System.out.println(nome);	
			}
		
	}
}
