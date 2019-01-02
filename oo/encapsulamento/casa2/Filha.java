package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {
	
	String segresoDoCasal = "Meu marido esta quase sendo demitido";
	
	public static void main(String[] args) {
		
		Filha euMesma = new Filha();
		System.out.println("Meus pais nao sabem... " + euMesma.segresoDoCasal);
		
		Sogro papai = new Sogro();
		System.out.println("Papai gosta de cerveja " + papai.gostaDeCerveja);
		
		//Genro marido = new Genro();
		//System.out.println(marido.);
		
		Filha minhaMae = new Filha();
		System.out.println("Segredo de familia: " + minhaMae.segredoDeFamilia);
		
	}

}
