import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("....................................................................");
            System.out.println("WELCOME TO ATM");
            System.out.println("1. ENTER YOUT PIN ");
            System.out.println("2. CONTACT BANK TO CREATE A NEW ACCOUNT");
            System.out.println("3. EXIT ");
            System.out.println("....................................................................");
            int n = sc.nextInt();
            if(n==3) {
                break;
            }
            else if(n==1) {

            }
            else if(n==2) {

            }
            else {
                System.out.println("INVALID CHOICE");
            }
        }
    }
}