import java.util.Scanner;
// TP01Q06
public class Is {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        String str = sc.nextLine();
        if(str.equals("FIM")){
            break;
        }

        if(onlyVogal(str)){
            System.out.print("SIM");
        }else{
            System.out.print("NAO");
        }

        if(onlyConsonant(str)){
            System.out.print(" SIM");
        }else{
            System.out.print(" NAO");
        }

        if(isInt(str)){
            System.out.print(" SIM");
        }else{
            System.out.print(" NAO");
        }

        if(isReal(str)){
            System.out.println(" SIM");
        }else{
            System.out.println(" NAO");
        }
        }
        sc.close();
    } 

   public static boolean onlyVogal(String str){
        for(int i = 0; i < str.length(); i++){
            char iChar = Character.toLowerCase(str.charAt(i));
            if(!(iChar == 'a' || iChar == 'e' || iChar == 'i' || iChar == 'o' || iChar == 'u')){
                return false;
            }
        }
        return true;
    }
   

    public static boolean onlyConsonant(String str){
        for(int i = 0; i < str.length(); i++){
            char iChar = Character.toLowerCase(str.charAt(i));
            if(!(iChar == 'b' || iChar == 'c' || iChar == 'd' || iChar == 'f' || iChar == 'g' || iChar == 'h' || iChar == 'j' || iChar == 'k'
            || iChar == 'l' || iChar == 'm' || iChar == 'n' || iChar == 'p' || iChar == 'q' || iChar == 'r' || iChar == 's' || iChar == 't'
            || iChar == 'v' || iChar == 'w' || iChar == 'x' || iChar == 'y' || iChar == 'z')){
                return false;
            }
        }
        return true;
    }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true; 
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isReal(String str) {
        try {
            Double.parseDouble(str);
            return true; 
        } catch (NumberFormatException e) {
            return false;
        }
    }
}