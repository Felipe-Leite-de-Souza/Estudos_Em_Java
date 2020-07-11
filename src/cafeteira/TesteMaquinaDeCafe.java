package cafeteira;

public class TesteMaquinaDeCafe {

	public static void main(String[] args) {
		MaquinaCafe maquinaCafe = new MaquinaCafe();
		maquinaCafe.acucarDisponivel = 30;
		
		//Caf� com 10 gramas de a��car
		maquinaCafe.fazerCafe(10);
		
		//Caf� com 15 gramas de a��car
		maquinaCafe.fazerCafe(15);
		
		//Caf� com 10 gramas de a��car - (PADR�O)
		//Por�m n�o temos acu�ar suficiente desta vez
		maquinaCafe.fazerCafe();
	}

}
