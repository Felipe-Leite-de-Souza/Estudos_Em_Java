package cafeteira;

public class TesteMaquinaDeCafe {

	public static void main(String[] args) {
		MaquinaCafe maquinaCafe = new MaquinaCafe();
		maquinaCafe.acucarDisponivel = 30;
		
		//Café com 10 gramas de açúcar
		maquinaCafe.fazerCafe(10);
		
		//Café com 15 gramas de açúcar
		maquinaCafe.fazerCafe(15);
		
		//Café com 10 gramas de açúcar - (PADRÃO)
		//Porém não temos acuçar suficiente desta vez
		maquinaCafe.fazerCafe();
	}

}
