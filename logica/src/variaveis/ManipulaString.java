package variaveis;

public class ManipulaString {

public static void main(String[] args) {
	
	String email = "Rafael.nunes.unicampgmail.com";
	System.out.println("Original:" + email);
	System.out.println("Minusculo:" + email.toLowerCase());
	System.out.println("Maiusculo:" + email.toUpperCase());
	System.out.println("Qtde de Caracteres: " + email.length());
	System.out.println("Tem arroba? " + email.contains("@"));
	System.out.println("Possi��o do arroba" + email.indexOf("@"));
	System.out.println("Do 3� at� o 5�:  " + email.substring(2,5));
	System.out.println("Do 3� at� o Fim:  " + email.substring(2));
	System.out.println("Primeira metade:  " + email.substring(0, email.length()/2));
	System.out.println("Usuario:  " + email.substring(0, email.indexOf("@")).toLowerCase());
	System.out.println("Servidor:  " + email.substring(email.indexOf("@")+1).toLowerCase());
	System.out.println("Primeiro Caracter: " + email.charAt(0));
	System.out.println("� igual?" + email.equals("Rafael.nunes.unicamp@gmail.com"));
	
	
	
	
	
}

}
