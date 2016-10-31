import java.util.Scanner;
public class initial
{
  public static void main(String[] args )
    {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your first , middle and last name");
     String name = input.nextLine();
     System.out.println(" ");
    int x = name.indexOf(' ')+1;
    String nameTwo = name.substring(x,name.length());
    int y = nameTwo.indexOf(' ')+1;
    System.out.println(name +" , your initials maybe this: " + name.charAt(0) + name.charAt(x) + name.charAt(y));
    }
}                            