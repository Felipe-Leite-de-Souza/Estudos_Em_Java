package exemplosBasicos;

public class CalculadoraProfessor {

	public static void main(String[] args) {
			boolean calculoDetalhado = true;
			float pi = 3.14f;
			float raio = 4.8f;
			float areaCirculo = (raio * raio) * pi;
			int areaSemDecimais = (int) areaCirculo;
			
			if(calculoDetalhado) {
				System.out.println("Area = " + raio + " * " + raio + " * " + pi);
			}
			
			
			System.out.println("Resultado: " + areaCirculo);
			System.out.println("Resultado sem casas decimais: " + areaSemDecimais);
			

		}

}
