import java.io.IOException;

public class customer_dashboard {
    
    public String customer;

    public void update() {

    }

    void dashboard() throws IOException {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------");
            System.out.println("PRESS 1 CHECK BALANCE");


            System.out.println("PRESS 2 FOR TRANSACTION HISTORY");

            System.out.println("PRESS 3 FOR WITHDRAWAL");

            System.out.println("PRESS 4 FOR DEPOSIT");

            System.out.println("PRESS 5 TO EXIT");
            int op=sc.nextInt();
            if(op==1){
                
            }
        }

    }

    customer_dashboard(String user) {
        customer = user;
    
    }
}
