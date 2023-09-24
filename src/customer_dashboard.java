import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class customer_dashboard {

    String customer;

    // public void update() {

    // }

    void dashboard() throws IOException {
        String folderPath = "./data/";
        String filePath = folderPath + customer + ".txt";
        String l2 = Files.readAllLines(Paths.get(filePath)).get(0);
        System.out.println(customer);
        System.out.println(l2);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------");
            System.out.println("PRESS 1 CHECK BALANCE");

            System.out.println("PRESS 2 FOR TRANSACTION HISTORY");

            System.out.println("PRESS 3 FOR WITHDRAWAL");

            System.out.println("PRESS 4 FOR DEPOSIT");

            System.out.println("PRESS 5 TO EXIT");
            int op = sc.nextInt();
            if (op == 5) {
                break;
            } else if (op == 1) {

            }
        }

    }

    customer_dashboard(String user) {
        customer = user;

    }
}
