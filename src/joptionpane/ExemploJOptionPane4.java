package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane4 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		//Possibilidades do Combo box
		Object[] possibilidades = {"Masculino", "Feminino"};
		
		//Tela de mensagem
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "Sele��o", JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);
		System.out.println("Sexo selecionado: " + sexo);
		
		//Tela de mensagem para o usu�rio inserir dados
		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "Informa��es", JOptionPane.PLAIN_MESSAGE, null, null, null);
		System.out.println("Seu nome �: " + nome);
	}

}
