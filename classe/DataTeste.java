package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		// Teste Data normal
		//Data nascimento = new Data(25, 06, 1979);
		
		// Teste DataThis
		DataThis nascimento = new DataThis();
		
		//nascimento.dia = 25;
		//nascimento.mes = 06;
		//nascimento.ano = 1979;
		
		//System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		//System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
		
		// USANDO A CLASSE DATA, METODO FORMATAR
		
		System.out.println(nascimento.formatar());
	}
	
}
