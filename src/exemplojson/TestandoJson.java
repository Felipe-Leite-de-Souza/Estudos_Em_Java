package exemplojson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class TestandoJson {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Sem Saída, 01", "São Paulo", "SP");
		
		Telefone residencial = new Telefone("Residencial", "11 9999-9999");
		Telefone comercial = new Telefone("Comercial", "11 6666-6666");
		
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);
		
		Cliente cliente = new Cliente("Hefesto Gales", 30, endereco, telefones);
		
		//Gerando JSON
		System.out.println("Gerando Json:");
		
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		//Lendo JSON
		System.out.println("\n\nLendo Json:");
		
		Cliente cliente2 = gson.fromJson(json, Cliente.class);
		
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefones().get(0).getNumero());
		
	}

}
