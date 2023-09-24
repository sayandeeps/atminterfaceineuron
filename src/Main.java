import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("....................................................................");
            System.out.println("WELCOME TO ATM");
            System.out.println("1. ENTER YOUT PIN "); // login
            System.out.println("2. CONTACT BANK TO CREATE A NEW ACCOUNT"); // register
            System.out.println("3. EXIT "); // exit
            System.out.println("....................................................................");
            int n = sc.nextInt();
            if (n == 3) {
                break;
            } else if (n == 1) {
                loginmodule log = new loginmodule();
                log.login();
            } else if (n == 2) {
                registration_module r = new registration_module();
                r.register();
            } else {
                System.out.println("INVALID CHOICE");
            }
        }
    }
}
