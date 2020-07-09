package matematica;

public class MatematicaUtil {

		int posição;
		double raio;
		public static double pi = 3.14;
		
		public static int calcularFibonacci(int posicao) {
			if(posicao <2) {
				return posicao;
			}
			return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao-2);
			
		}
		
		public static double calcularAreaCirculo(double raio) {
			raio = (raio * raio) * pi;
			return raio;
	 
		}

}
