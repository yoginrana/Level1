import java.util.Scanner;
public class Level1
{
  public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name.length());
        System.out.println();
    }
}