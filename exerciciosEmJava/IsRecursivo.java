import java.util.Scanner;

public class IsRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine(); 
            if(str.equals("FIM")){
                break;
            }
            if(onlyVogal(str, 0, str.length())){
                System.out.print("SIM");
            }else{
                System.out.print("NAO");
            }

            if(onlyConsonant(str, 0, str.length())){
                System.out.print(" SIM");
            }else{
                System.out.print(" NAO");
            }

            if(isInt(str, 0, str.length())){
                System.out.print(" SIM");
            }else{
                System.out.print(" NAO");
            }

            if(isReal(str, 0, str.length(), 0)){
                System.out.println(" SIM");
            }else{
                System.out.println(" NAO");
            }


        }
        sc.close();
    }

    public static boolean onlyVogal(String str, int i, int n){
        if(i >= n){
            return true;
        }
        char iChar = Character.toLowerCase(str.charAt(i));
        if(!(iChar == 'a' || iChar == 'e' || iChar == 'i' || iChar == 'o' || iChar == 'u')){
            return false;
        }
        return onlyVogal(str, i + 1, n);
    }

    public static boolean onlyConsonant(String str, int i, int n){
        if(i >= n){
            return true;
        }
        char iChar = Character.toLowerCase(str.charAt(i));
        if(!(iChar == 'b' || iChar == 'c' || iChar == 'd' || iChar == 'f' || iChar == 'g' || iChar == 'h' || iChar == 'j' || iChar == 'k'
        || iChar == 'l' || iChar == 'm' || iChar == 'n' || iChar == 'p' || iChar == 'q' || iChar == 'r' || iChar == 's' || iChar == 't'
        || iChar == 'v' || iChar == 'w' || iChar == 'x' || iChar == 'y' || iChar == 'z')){
            return false;
        }
        return onlyConsonant(str, i + 1, n);
    }

    public static boolean isInt(String str, int i, int n){
        if(i >= n){
            return true;
        }
        if (!Character.isDigit(str.charAt(i))){
            return false;
        }
        return isInt(str, i + 1, n);
    }

    public static boolean isReal(String str, int i, int n, int cont){
        if(i >= n){
            return true;
        }
        if(str.charAt(i) == '.'){
            cont += 1;
        }
        if(cont > 1){
            return false;
        }
        if(!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.'){
            return false;
        }
        return isReal(str, i + 1, n, cont);
    }
}