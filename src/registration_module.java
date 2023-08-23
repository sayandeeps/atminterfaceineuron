public class registration_module{
    public boolean validregister(String name, String card , String pin)
{
String filepath="data.txt";
try(BufferedWriter br=new BufferedWriter(new FileWriter(filepath, append: true)))
{
String line= name+","+card+","+pin;
br.write(line);
br.newline();
return true;
}
catch(Exception e)
{
System.out.println("!!!!!!!!!!!!!ERROR OCCURRED WHILE REGISTERATION!!!!!!!!!!!!!");
}
return false;
}
    public void register(String [] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter you name:");
      String name = sc.nextLine();
      System.out.println("Enter your card number:");
      String card =sc.next();
      System.out.println("Enter your Pin:");
      String pin =sc.next();

      if(validregister(name,card,pin)==true){
        System.out.println("Registration Successful.");
      }
      else{
        System.out.println("Registration is not successful please! try again later");
      }
    }
}