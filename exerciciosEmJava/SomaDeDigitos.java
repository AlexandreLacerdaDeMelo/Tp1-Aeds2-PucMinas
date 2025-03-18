/*
Crie um método recursivo que recebe um número inteiro como parâmetro e retorna a soma de seus dígitos. 
Na saída padrão, para cada linha de entrada, escreva uma linha de saída com o resultado da soma dos dígitos. 
Por exemplo, se a entrada for 12345, a saída deve ser 15.
*/
import java.util.Scanner;

public class SomaDeDigitos {
    public static int recSum(int[] n, int i) {
        if (i < 0) {
            return 0;
        } else {
            return n[i] + recSum(n, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            str = sc.nextLine().trim(); // Lê a entrada como string

            if (str.equalsIgnoreCase("FIM")) { // Verifica se quer sair
                break;
            }
                // Converte a string para número
                int numero = Integer.parseInt(str);
                
                // Converte o número para array de dígitos
                String strNumero = String.valueOf(numero);
                int[] digitos = new int[strNumero.length()];
                for (int i = 0; i < strNumero.length(); i++) {
                    digitos[i] = Character.getNumericValue(strNumero.charAt(i));
                }

                // Calcula e exibe a soma
                int resultado = recSum(digitos, digitos.length - 1);
                System.out.println("Soma: " + resultado);
        }

        sc.close();
    }
}