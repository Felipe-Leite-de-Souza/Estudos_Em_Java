package enviandoobjetosnarede;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	
	/*
	 * O Client foi executado em uma VM (Virtual Machine) 
	 * para simular outro computador.
	 */
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.0.119", 3333);
		
		OutputStream saida = socket.getOutputStream();
		ObjectOutput objectOutput = new ObjectOutputStream(saida);
		
		Pedido pedido = new Pedido();
		pedido.setCodigo(1L);
		pedido.setDescricao("Barra de Chocolate");
		pedido.setQuantidade(3);
		
		objectOutput.writeObject(pedido);
		
		InputStream entrada = socket.getInputStream();
		DataInput dataInput = new DataInputStream(entrada);
		System.out.println("Recebeu do servidor: " + dataInput.readUTF());
		
		socket.close();
		
	}
}
