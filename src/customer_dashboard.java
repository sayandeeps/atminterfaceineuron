import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class customer_dashboard {

    String customer;

    public void update(int bal, String filePath) {
        try {
            String bals = String.valueOf(bal);
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");
            long filePointer = 0;
            for (int i = 1; i < 2; i++) {
                String line = file.readLine();
                filePointer = file.getFilePointer();
            }
            file.seek(filePointer);
            file.writeBytes(bals + "\n"); //
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void dashboard() throws IOException {
        String folderPath = "./data/";
        String filePath = folderPath + customer + ".txt";
        String l2 = Files.readAllLines(Paths.get(filePath)).get(1);
        int cbal = Integer.parseInt(l2);
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
                System.out.println("Available Balance: " + cbal);
            } else if (op == 4) {
                System.out.println("--------------------------------");
                System.out.println("Enter the amount you want to deposit");
                int depamt = sc.nextInt();
                cbal = cbal + depamt;
                update(cbal, filePath);
                System.out.println("Amount Deposited Successfully");
                System.out.println("Present balance: " + cbal);
                try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath, true))) {
                    Date currentDate = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String formattedDateTime = dateFormat.format(currentDate);
                    br.write(depamt + " Credited at " + formattedDateTime + " Available Balance: " + cbal + "\n");
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }

    customer_dashboard(String user) {
        customer = user;

    }
}
