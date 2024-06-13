import java.util.Scanner;

public class PasswordCheck {

    static Boolean isLower;
    static Boolean hasSpecialCharacter;
    static Boolean hasNumber;
    static Boolean isUpper;

    public static void main(String[] args) {
        System.out.println("Password length of more than 8 !");
        System.out.println("Must have characters(small& capital) !");
        System.out.println("Must have number & special characters !");
        System.out.print("Enter a password : ");
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if(password.length() > 8){
            isLower = checkLowerCase(password);
            isUpper = checkUpperCase(password);
            hasNumber = checkNumber(password);
            hasSpecialCharacter = checkSpecialCharacter(password);
            if(isLower.equals(true) && isUpper.equals(true) && hasSpecialCharacter.equals(true) && hasNumber.equals(true)){
                System.out.println("Password is Strong");
            }else{
                System.out.println("Password is not Strong!!!");
            }
        }else{
            System.out.println("Password is not Strong!!!");
        }
    }

    static boolean checkLowerCase(String password){
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }
         return false;
    }

    static boolean checkUpperCase(String password){
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }

    static boolean checkNumber(String password){
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0') if (c <= '9') {
                return true;
            }
        }
        return false;
    }

    static boolean checkSpecialCharacter(String password){
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            String str = "!@#$%^&*()-[]{}:;',?/";
            for (int j = 0; j < str.length(); j++) {
                if ((c == str.charAt(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
