import java.util.Objects;
import java.util.Scanner;
public class Lab11A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String run = "yes";
        while (!run.equals("no")) {
            System.out.println("Menu");
            System.out.println("0) Hello World ");
            System.out.println("1) Goodbye Moon");
            System.out.println("2) Walking on Sunshine");
            System.out.print("What would you like to do: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Hello!");
                    System.out.print("Type YES to rerun. ");
                    sc.nextLine();
                    String rrun = sc.nextLine();
                    if (rrun.length() == 3){
                        run = "yes";
                    } else {
                        run = "no";
                    }
                    break;
                case 1:
                    System.out.println("Ok, bye.");
                    System.out.print("Type YES to rerun. ");
                    sc.nextLine();
                    rrun = sc.nextLine();
                    if (rrun.length() == 3){
                        run = "yes";
                    } else {
                        run = "no";
                    }
                    break;
                case 2:
                    System.out.println("WHOA!");
                    System.out.print("Type YES to rerun. ");
                    sc.nextLine();
                    rrun = sc.nextLine();
                    if (rrun.length() == 3){
                        run = "yes";
                    } else {
                        run = "no";
                    }
                    break;
            }
        }
    }
}
