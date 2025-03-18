
public class PalindromoRec {
	public static void main(String[] args) {
		String texto = MyIO.readLine();
		  
		 while(stop(texto)) {
			
		 if(isPalindromo(texto,0) == true) {
			MyIO.println("SIM");
		 }
		 else {
			MyIO.println("NAO");
		 }
		
		 texto = MyIO.readLine();
		}
	}
	
	public static boolean stop(String texto){
        boolean resp = true;
        if (texto.charAt(0) == 'F' && texto.charAt(1) == 'I' && texto.charAt(2) == 'M'){
             resp = false;
        }
        return resp;
    }
	
	public static boolean isPalindromo(String  texto, int i) {
		boolean resp = true;
		
		if(texto.length()/2 != i) {
			if(texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
				resp = false;
			}
			else {
				resp = isPalindromo(texto,i+1);
			}
		}
		
		return resp;
	}
}