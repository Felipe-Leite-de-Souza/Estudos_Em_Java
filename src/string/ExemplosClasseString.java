package string;

public class ExemplosClasseString {

	public static void main(String[] args) {
		String nome = "Amanda";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		
		//Essas variáveis (s1 e s2) apontão para o mesmo lugar/objeto
		String s1 = "Amanda";
		String s2 = "Amanda";
		System.out.println("s1 == s2? " + (s1 == s2) + "\n\n");
		
		
		//A variável s3 aponta para outro objeto
		String s3 = new String("Amanda");
		System.out.println("s3 == s1? " + (s3 == s2) + "\n\n");
		
		
		//Aqui verificamos o CONTEÚDO das Strings e não o objeto
		System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1)? " + (s3.equals(s1)) + "\n\n");
		
		String s4 = "AmAnDa";
		System.out.println("s1.equals(s4)? " + (s1.equals(s4)));
		System.out.println("s1.equalsIgnoreCase(s4)? " + (s1.equalsIgnoreCase(s4)) + "\n\n");
	}

}
