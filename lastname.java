import java.util.Scanner;
public class lastname
{
  public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String name = input.nextLine();
        int start = name.indexOf(' ');
        int end = name.lastIndexOf(' ');
        String firstName = "";
        String middleName = "";
        String lastName = "";
        if (start >= 0) {
        firstName = name.substring(0, start);
        if (end > start)
           middleName = name.substring(start + 1, end);
         lastName = name.substring(end + 1, name.length());
       }
        System.out.println("Hello " + lastName);          
    }
}