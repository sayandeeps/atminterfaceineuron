import java.io.*;
import java.util.*;

class loginmodule {
    public boolean val(String user, String pin) {
        String filepath = "credentials.txt";
        try (BufferedReader auth = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = auth.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(user) && parts[2].equals(pin)) {

                    return true;
                }
            }

        } catch (Exception e) {
            System.out.println("Error in credentilas");

        }
        return false;
    }

    void login() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Enter your card number:");
        String user = sc.next();
        System.out.println("Enter your pin:");
        String pin = sc.next();
        if (val(user, pin) == true) {
            System.out.println("Hello User!");
            customer_dashboard cust = new customer_dashboard(user);
            cust.dashboard();

        } else {
            System.out.println("No User Found !! Try again later");

        }
    }
}
