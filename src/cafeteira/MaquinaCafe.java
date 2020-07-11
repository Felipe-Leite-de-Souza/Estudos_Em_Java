package cafeteira;

public class MaquinaCafe {
	int acucarDisponivel;
	
	public void fazerCafe() {
		fazerCafe(10);
	}
	
	public void fazerCafe(int quantidadeDeAcucar) {
		if (acucarDisponivel < quantidadeDeAcucar ) {
			System.out.println("Não há açúcar suficiente para fazer o café.");
			System.out.println("Por favor recarregar o suporte de açúcar.\n");
		} else {
			acucarDisponivel -= quantidadeDeAcucar;
			System.out.println("Fazendo café com " + quantidadeDeAcucar + " gramas de açúcar.\n");
		}
	}
	
}
