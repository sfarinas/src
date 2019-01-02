package api;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Salomao");
		sb.append(",").append("Simone");
		sb.append(",").append("Sara");
		
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.substring(0, 5));
		
		sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.substring(0, 5));
	}
}
