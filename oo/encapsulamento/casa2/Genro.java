package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais";
	
	public static void main(String[] args) {
		// ACESSANDO O CONTEUDO DE OUTRAS CLASSES
		Genro euMesmo = new Genro();
		System.out.println("Nunca falatei... " + euMesmo.segredo);
		
		Filha elaMesmo = new Filha();
		System.out.println("Vendo o segredo do casal " + elaMesmo.segresoDoCasal);
		
		Sogro sograo = new Sogro();
		System.out.println("Acessando outra classe de outro pacote ( Sograo gosta de cerveja ): " + sograo.gostaDeCerveja);
		
		//Sogra aSogra = new Sogra();
		//System.out.println(aSogra.segredoDeFamilia);
	}
}
