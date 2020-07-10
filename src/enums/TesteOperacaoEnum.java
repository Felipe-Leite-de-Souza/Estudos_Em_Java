package enums;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		OperacaoAritmetica operacao1 = OperacaoAritmetica.ADICAO;
		
		int resultado = operacao1.operacao(5, 3);
		System.out.println("O resultado é: " + resultado);
		
		for (OperacaoAritmetica operacao : OperacaoAritmetica.values()) {
			System.out.println(operacao + " -> " + operacao.operacao(4, 2));
		}
		
	}

}
