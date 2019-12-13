import java.util.Scanner;
class HelloWorld
{
   public static void main (String[]args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print("Get a sword?(y/n)");
       char ans = s.next().charAt(0);
       
       boolean hasSword;
       hasSword=true;
       if(hasSword)
       {
           System.out.println("You have a sword");
           System.out.println("Good luck");
        } else
        {
            System.out.println("You do not have a sword");
            System.out.println("Good luck with your bare hands");
        }
        System.out.println("The End");
    }
}