package gravacaoleituradearquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

	public static void main(String[] args) {
		String[] emails = {"java2@java.com", "python2@python.com", "ruby2@ruby.com"};
		
		//Uma das formas de fazer
		//Buffer para gravação
		/*try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) {
		
			writer.write(email);
			writer.newLine();
		*/
		
		//Outra forma de fazer
		try (PrintStream writer = new PrintStream("emails2.txt")) {	
			for (String email : emails) {

				writer.println(email);
			}
		} catch (IOException e) {
			System.err.println("Não conseguiu gravar o arquivo." + e.getMessage());
		} 

	}

}
