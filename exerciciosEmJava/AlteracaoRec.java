import java.util.Random;
import java.util.Scanner;

public class AlteracaoRec{

    public static String gerar(String palavra) {
        return gerarRecursivo(palavra, "");
    }

    public static String gerarRecursivo(String restante, String gerado) {
        if (restante.isEmpty()) {
            return gerado;
        } else {
            Random gerador = new Random();
            gerador.setSeed(4);

            char primeiraLetra = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
            char segundaLetra = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));

            char letraSubstituida = restante.charAt(0);
            char novaLetra = (letraSubstituida == primeiraLetra) ? segundaLetra : letraSubstituida;

            return gerarRecursivo(restante.substring(1), gerado + novaLetra);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        while (!palavra.equals("FIM")) {
            System.out.println(gerar(palavra));
            palavra = sc.nextLine();
        }

        sc.close();
    }
}
