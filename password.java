import java.util.Scanner;
public class password
{
  public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
         System.out.println("Please enter a password");
        String password = input.nextLine();
        System.out.println("Please re-enter the password");
        String password2 = input.nextLine();
        System.out.println();
      while( !password2.equals(password) )
      {
         System.out.print("Passowrds do not match. Try again: ");
         System.out.println();
         password2 = input.nextLine();     
         System.out.println();     
        }
        if (password2.equals(password)){
            System.out.print("Passwords match");
         System.out.println();        
    }
  }
}