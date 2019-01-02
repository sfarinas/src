package oo.Polimorfismo;

public class Pessoa {

	/**
	 * Peso em Kg
	 */
	private double peso;
	
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
		
	}
	
	public double getPeso() {
		return peso;
	}
	
	// POLIMORFISMO DINAMICO
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	// POLIMORFISMO STATICO
	
//	public void comer(Arroz arroz) {
//		this.peso += arroz.getPeso();
//	}
//	
//	public void comer(Feijao feijao) {
//		this.peso += feijao.getPeso();
//		
//	}
//	
//	public void comer(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}
}
