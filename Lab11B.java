import java.util.Scanner;
public class Lab11B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        if(password.length() <= 8){
            if(passValid(password)){
                System.out.print("Valid Password");
            } else {
                System.out.print("Invalid Password");
            }
        } else {
            System.out.print("Invalid Password");
        }
    }



    public static boolean passValid(String password){
        boolean hasNum = false; boolean hasUpper = false; char c;
        for (int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isDigit(c)){
                hasNum = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } if (hasNum && hasUpper){
                return true;
            }
        }
        return false;
    }
}
