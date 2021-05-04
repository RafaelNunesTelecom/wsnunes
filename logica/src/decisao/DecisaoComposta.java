package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
	
	public static void main(String[] args) {
		
		
		String disciplina =  JOptionPane.showInputDialog("Disciplina").toUpperCase();
		short faltas= Short.parseShort(JOptionPane.showInputDialog("Faltas"));
				if(faltas<20) {
					
				}
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		if(media>=6) {
			System.out.println("Você foi aprovado na displina :" + disciplina);
		}

		
		
		
		else if(media<4) {
			System.out.println("Você foi Reprovado na displina :" + disciplina);
		}
		
		else  {
			System.out.println("Você esta de exame :" + disciplina);
		}
		
		System.out.println("Sua media foi: " + media);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
