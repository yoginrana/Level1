import java.util.Scanner;
public class postcode
{
  public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your postcode");
        String postcode = input.nextLine();
        System.out.println(postcode.toUpperCase());
        System.out.println();                        
    }
}