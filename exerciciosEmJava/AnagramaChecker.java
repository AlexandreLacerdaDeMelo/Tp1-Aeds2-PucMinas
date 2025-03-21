import java.util.Arrays;
import java.util.Scanner;

public class AnagramaChecker {
    public static boolean saoAnagramas(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String str1 = scanner.nextLine().trim();
            if (str1.equalsIgnoreCase("FIM")) break;
            
            if (str1.matches("\\d+")) continue; // Ignorar números
            
            String str2 = scanner.nextLine().trim();
            if (str2.equalsIgnoreCase("FIM")) break;
            
            if (str2.matches("\\d+")) continue; // Ignorar números
            
            if (saoAnagramas(str1, str2)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }
        
        scanner.close();
    }
}
