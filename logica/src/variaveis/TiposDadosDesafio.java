package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {

	String nome = JOptionPane.showInputDialog("Digite o seu nome do produto");
	String compra = JOptionPane.showInputDialog("Digite o valor da compra");
	String qant = JOptionPane.showInputDialog("Digite a quantidade");
	int idade = 30;
	double altura = 1.84;
	double peso= 99;
	double imc = peso / (altura * altura);
	System.out.println("Valor da sua compra é...:" + nome);
	System.out.println("Idade...:" + idade);
	System.out.println("Altura...:" +altura);
	System.out.println("IMC...:" + imc);	
	
	
	
}
