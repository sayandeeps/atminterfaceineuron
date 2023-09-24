import java.io.*;
import java.util.*;

public class registration_module {
  public boolean validregister(String name, String card, String pin) {
    String filepath = "credentials.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true))) {
      String line = name + "," + card + "," + pin; // name,phone,pin [],[],[]
      writer.write(line);
      writer.newLine();
      String[] parts = line.split(",");
      String folderPath = "./data/";
      new File(folderPath).mkdir();
      String filename = parts[1];
      String filePath = folderPath + filename + ".txt";// ./data/phone.txt
      BufferedWriter newuser = new BufferedWriter(new FileWriter(filePath, true));
      String bal = "0";
      newuser.write("Account balance:\n");
      newuser.write(bal + "\n");
      newuser.close();
      writer.close();
      return true;
    } catch (Exception e) {
      System.out.println("!!!!!!!!!!!!!ERROR OCCURRED WHILE REGISTERATION!!!!!!!!!!!!!");
    }
    return false;
  }

  public void register() {
    System.out.println("-------------------------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you name:");
    String name = sc.nextLine();
    System.out.println("Enter your phone number (*this will be your card number):");
    String card = sc.next();
    System.out.println("Enter your Pin:");
    String pin = sc.next();

    if (validregister(name, card, pin) == true) {
      System.out.println("Registration Successful.");
    } else {
      System.out.println("Registration is not successful please! try again later");
    }
  }
}