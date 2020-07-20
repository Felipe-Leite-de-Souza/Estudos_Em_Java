package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * JOptionPane utilizado para enviar mensagens aos usuários
		 * Geralmente utilizado quando se esta fazendo telas em Java com Swing
		 */
		
		//Trocando a imagem do ícone do Java para um "i"
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso!");
		
	}

}
