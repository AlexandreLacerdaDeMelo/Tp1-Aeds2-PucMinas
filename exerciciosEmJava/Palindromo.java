public class Palindromo {
	public static void main(String[] args) {  
	   String texto = MyIO.readLine();
		
	   while(stop(texto)) {
		  
	   if(isPalindromo(texto) == true) {
		  MyIO.println("SIM");
	   }
	   else {
		  MyIO.println("NAO");
	   }
	  
	   texto = MyIO.readLine();
	  }
	}
	
	  public static boolean isPalindromo(String texto) {
		boolean resp = true;
		int j = texto.length() - 1;
		  for(int i = 0; i < texto.length()/2 ; i++) {
			  if((texto.charAt(i) != texto.charAt(j)) && (i != j)){
				 resp = false;
					  }
					  j--;
		  }
		return resp;
	  }
  
	  public static boolean stop(String texto){
			 boolean resp = true;
			 if (texto.charAt(0) == 'F' && texto.charAt(1) == 'I' && texto.charAt(2) == 'M'){
				  resp = false;
			 }
			 return resp;
	  }
  }