package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		
		conjunto.add('a');
		conjunto.add("Salomao");
		conjunto.add(2);
		conjunto.add(3.16);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		//CONTANDO OS ELEMENTOS
		System.out.println("Size..." + conjunto.size()); //SIZE ...7
		
		// REMOVENDO UM OBJETO
		System.out.println("Remove...");
		System.out.println(conjunto.remove('a')); // RETORNO SERA TRUE
		
		// RECONTANDO
		System.out.println("Size..." + conjunto.size()); //SIZE...6
		
		// PERGUNTANDO SE CONTEM UM RESULTADO EXPECIFICO
		System.out.println("Contains... ");
		System.out.println(conjunto.contains('a')); //false
		System.out.println(conjunto.contains(1)); //true
		
		//CRIANDO UM NOVO SET
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		// UNIAO DE 2 OU MAIS CONJUNTOS
		conjunto.addAll(nums);
		
		System.out.println("Size ... "); // MESMO APOS TER DADO REMOVE
		System.out.println(conjunto.size()); // TERA 7 NOVAMENTE
		
		// REALIZANDO A INTERCEÇÃO DOS 2 CONJUNTOS
		conjunto.retainAll(nums);
		
		System.out.println("Size ... ");
		System.out.println(conjunto.size());
		
		conjunto.clear();
		System.out.println(conjunto.isEmpty()); // RETORNO SER TRUE
		
	}
	
}
