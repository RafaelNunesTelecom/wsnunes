package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	public static void main(String[] args) {
		
		
		String disciplina =  JOptionPane.showInputDialog("Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		if(media>=6) {
			System.out.println("Voc? foi aprovado na displina :" + disciplina);
		}

		
		System.out.println("Sua media foi: " + media);
		
		if(media<4) {
			System.out.println("Voc? foi Reprovado na displina :" + disciplina);
		}
		
		if (media<6 && media>4) {
			System.out.println("Voc? esta de exame :" + disciplina);
		}
		
		System.out.println("Sua media foi: " + media);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
