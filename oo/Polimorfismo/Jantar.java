package oo.Polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		FrangoG frangog = new FrangoG();
		frangog.setPeso(0.500);
		
		// ALIMENTO SENDO INGERIDO
		
		Pessoa pessoa = new Pessoa(80.7);
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		pessoa.comer(sorvete);
		pessoa.comer(frangog);
		
		System.out.println(pessoa.getPeso());
	}
}
