package decisao;

import javax.swing.JOptionPane;

public class DesafioDecis�oSimples {
	
	public static void main(String[] args) {
		
		String nome =  JOptionPane.showInputDialog("Nome").toUpperCase();
		float idade = Float.parseFloat(JOptionPane.showInputDialog("Idade"));
		
	
		
		if (idade>=18 && idade<=70) {
			System.out.println("Seu voto � obrigatorio :" + nome);
		}
		
		if(idade<16) {
			System.out.println(nome + "voc� n�o pode voltar");
		}
		
		if (idade==16 || idade ==17 ||  idade>70) {
			System.out.println("Seu voto � facultativo"  + nome);
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

}
