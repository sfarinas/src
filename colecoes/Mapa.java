package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "Salomao");
		aprovados.put(2, "Simone");
		aprovados.put(3, "Ana");
		aprovados.put(4, "Zeze");
		
		System.out.println(aprovados.keySet()); // AQUI ELE MOSTRA SÓ OS SET'S
		System.out.println(aprovados.values()); // AQUI SOMENTE OS VALORES
		System.out.println(aprovados.entrySet()); // AQUI OS 2

		//VENDO TODOS OS INDICES A SUA ESCOLHA
		System.out.println("Me mostre o indice 2: " + aprovados.get(2));
		System.out.println("Me mostre o indice 1: " + aprovados.get(1));
		System.out.println("Me mostre o indice 3: " + aprovados.get(3));
		System.out.println("Me mostre o indice 4: " + aprovados.get(4));
		
		//ALTERANDO O INDEX 3
		// aprovados.put(3, Beatriz);
		System.out.println("Mudando o index 3: " + aprovados.put(3, "Beatriz"));
		System.out.println("Me mostre o indice 3: " + aprovados.get(3));
		
		System.out.println(aprovados.containsKey(3)); //TESTANDO PARA SABER DE TEM CONTEUDO
		System.out.println(aprovados.containsValue("Ana")); // COMPARANDO A VARIAVEL COM O VALOR BIA
		
		// MOSTRANDO TODOS OS INDEX
		System.out.println("Chaves... ");
		for(Integer codigo: aprovados.keySet()) {
			System.out.println(codigo);
		}
		
		// MOSTRANDO TODOS OS VALORES
				System.out.println("Valores... ");
				for(String nome: aprovados.values()) {
					System.out.println(nome);
				}
				
				// MOSTRANDO TODOS OS INDEX E VALORES
				System.out.println("INDEX / Valores... ");
				for(Entry<Integer, String> registro: aprovados.entrySet()) {
					System.out.println(registro);
				}		
	}

}
