package enviandoobjetosnarede;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(3333);
		
		System.out.println("Aguardando conx�o...");
		
		Socket socket = server.accept(); //Espera at� dar a conex�o
		
		System.out.println("Conectado a: " + socket.getRemoteSocketAddress());
		
		InputStream entrada = socket.getInputStream();
		ObjectInputStream objectStream = new ObjectInputStream(entrada);
		
		Pedido pedido = (Pedido) objectStream.readObject();
		System.out.println("C�digo: " + pedido.getCodigo());
		System.out.println("C�digo: " + pedido.getDescricao());
		System.out.println("C�digo: " + pedido.getQuantidade());
		
		OutputStream saida = socket.getOutputStream();
		DataOutput dataOutput = new DataOutputStream(saida);
		dataOutput.writeUTF("Recebido com sucesso!");
		
		server.close();
		
	}
	
}
