import java.util.Scanner;
class HelloWorld
{
   public static void main (String[]args)
   {
 //      Scanner s = new Scanner(System.in);
   //    System.out.print("Get a sword?(y/n)");
  //     char ans = s.next().charAt(0);
       
        bigSpaceShip();   
    }
    
    
   
    public static void bigSpaceShip()
    {
        System.out.println("You are in a big spaceship and you have nothing in your inventory");
        System.out.println("You see three rooms. Where would you want to go?");
        System.out.println("1...is The Pilot Room");
        System.out.println("2...is Outside");
        System.out.println("3...is The Control Room");
        Scanner s = new Scanner(System.in);
        
        int ans = s.nextInt();
        if(ans == 1)
            pilotRoom();
        else if (ans == 2)
            outside();
        else
            controlRoom();
            
        
    }
    
    public static void pilotRoom()
    {
        System.out.println("You are now in the pilot room");
        System.out.println("Garfield is sitting on the pilots seat...he's been waiting for you");
        System.out.println("Talk to him?");
        System.out.println("1 for yes");
        System.out.println("2 for no");
        
        Scanner s = new Scanner(System.in);
        int ans = s.nextInt();
        
        if(ans == 1)
       {
            System.out.println("You said you don't like cats and he got offended. Now he's challenging you to a duel");
            System.out.println("Will you fight him");
            System.out.println("1 for yes");
            System.out.println("2 for no");
            
             ans = s.nextInt();
        
            if(ans == 1)
            {
                System.out.println("You surprisingly won");
                System.out.println("Garfield dies");
                System.out.println("He dropped keys and a lightsaber");
                System.out.println("You now have keys and a lightsaber");
                
                bigSpaceShip();
            }
        }
            
            
       else if(ans == 2)
       {
            System.out.println("You told him you won't fight him and you turned your back on him");
            System.out.println("He then decided to kill you");
            System.out.println("You died");
            System.out.println("Press 1 to restart");
                
            ans = s.nextInt();
        
            if(ans == 1)
            {
                bigSpaceShip();
            }
       }
            
        }
    
                  
    public static void outside()
    {
        System.out.println("You are outside");
        System.out.println("You have no spacesuit...that means you can't breathe...");
        System.out.println("You died");
        System.out.println("Press 1 to restart");
        
        Scanner s = new Scanner(System.in);
        int ans = s.nextInt();
        
        if(ans == 1)
            bigSpaceShip();
    }
    
    public static void controlRoom()
    {
        System.out.println("You're  in the control room");
        System.out.println("You see DarthPig...it's basically DarthVader but with a pig head...");
        System.out.println("Oh no! He spotted you! He took out his lightsaber");
        System.out.println("Do you have your own lightsaber?");
        System.out.println("1 for yes");
        System.out.println("2 for no");
        
        Scanner s = new Scanner(System.in);
        int ans = s.nextInt();
        
        if(ans == 1)
        {
            System.out.println("Will you fight him?");
            System.out.println("1 for yes");
            System.out.println("2 for no");
            
            ans = s.nextInt();
            if(ans == 1);
            {
                System.out.println("You...once again, SURPRISINGLY, win...I don't know how but you did...");
                System.out.println("You see a comaprtment and open it");
                System.out.println("You now have a hot dog");
                System.out.println("You're sent back to the beginning");
                
                bigSpaceShip();
    
            }
            
            else if(ans == 2);
            {
                
            
        }
    }
    
    
    
}
