package apidelocacaodecarro;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Paola Kiyousaki", LocalDate.of(1994, Month.APRIL, 13));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.printf("OK, pode ser cadastrado. Sua idade �: %d", idade);
		} else {
			System.err.printf("Sua idade �: %d. Ent�o n�o pode ter carteira.", idade);
		}
		
	}
	
}
