package joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception {
		
		//Trocando a imagem do ícone do Java para um "i"
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
		
		//Trocando de ícone "i" para "alerta"
		JOptionPane.showMessageDialog(null, "E-mail inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
		
		//Trocando de ícone "alerta" para "erro"
		JOptionPane.showMessageDialog(null, "Ação inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		
		//Sem ícone
		JOptionPane.showMessageDialog(null, "Dados confirmados!", "Dados", JOptionPane.PLAIN_MESSAGE);
		
		URL url = ExemploJOptionPane2.class.getResource("dark-kermit.png");
		Icon icone = new ImageIcon(url);
		
		//Inserindo uma imagem a sua escolha
		JOptionPane.showMessageDialog(null, "Good ... Very Good ...\nLet The Java Code Flow Through You", "Java Code", JOptionPane.INFORMATION_MESSAGE, icone);
	}

}
