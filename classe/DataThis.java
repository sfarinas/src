package classe;

public class DataThis {
	
	int dia;
	int mes;
	int ano;
	
	//CRIANDO UM CONSTRUTOR
	DataThis() {
		dia = 1;
		mes = 1;
		ano = 2017;
	}
	
	DataThis(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
