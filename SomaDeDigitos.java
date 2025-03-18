/*
Crie um método recursivo que recebe um número inteiro como parâmetro e retorna a soma de seus dígitos. 
Na saída padrão, para cada linha de entrada, escreva uma linha de saída com o resultado da soma dos dígitos. 
Por exemplo, se a entrada for 12345, a saída deve ser 15.
*/

import java.util.Scanner;

public class SomaDeDigitos {
    public static int recSum(int[] n, int i)
    {
        if(i < 0)
        {
            return 0;
        }
        else
        {
            return n[i] +recSum(n, i-1);
        }
    }
    public static void main(String[] args) {
        int n=0, count=0;
        // Transformando o número em string para poder acessar cada dígito
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = String.valueOf(n);
        sc.close();
        // Array para armazenar os dígitos convertidos
        int[] digitos = new int[str.length()];
        // Convertendo cada caractere da string em um dígito
        for (int i = 0; i < str.length(); i++) 
        {
            digitos[i] = Character.getNumericValue(str.charAt(i));
        }
        int resultado = recSum(digitos, digitos.length - 1); // Começa do último índice
        System.out.println(resultado);
    }
}
