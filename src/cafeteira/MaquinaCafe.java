package cafeteira;

public class MaquinaCafe {
	int acucarDisponivel;
	
	public void fazerCafe() {
		fazerCafe(10);
	}
	
	public void fazerCafe(int quantidadeDeAcucar) {
		if (acucarDisponivel < quantidadeDeAcucar ) {
			System.out.println("N�o h� a��car suficiente para fazer o caf�.");
			System.out.println("Por favor recarregar o suporte de a��car.\n");
		} else {
			acucarDisponivel -= quantidadeDeAcucar;
			System.out.println("Fazendo caf� com " + quantidadeDeAcucar + " gramas de a��car.\n");
		}
	}
	
}
