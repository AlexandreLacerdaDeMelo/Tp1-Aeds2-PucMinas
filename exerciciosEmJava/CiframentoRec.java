import java.util.Scanner;

public class CiframentoRec {

    public static String criptografar(String palavra, int i, StringBuilder resultado ) {

            
            if(i == palavra.length()){
                return resultado.toString();
            }

            char letra = palavra.charAt(i);
            
            if (Character.isLetter(letra)){
                char base = (Character.isUpperCase(letra)) ? 'A' : 'a';
                letra = (char) (((letra - base + 3) % 127 ) + base);
                resultado.append(letra);
            } else if(letra == 65533){
                resultado.append((char) 65533);
            } else {
                resultado.append((char) (letra + 3));
            }
            return criptografar(palavra, i + 1, resultado);        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        while (!palavra.equals("FIM")) {
            System.out.println(criptografar(palavra, 0, new StringBuilder()));
            palavra = sc.nextLine();
        }

        sc.close();
    }
}