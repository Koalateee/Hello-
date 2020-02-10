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
        System.out.println("You are in a big spaceship");
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
        System.out.println("Garfield is sitting on the pilots seat...");
        System.out.println("Garfield: You got any lasagne? I'm starving");
        System.out.println("Talk to him?");
       
        System.out.println("1 for yes");
        System.out.println("2 for no");
        
        Scanner s = new Scanner(System.in);
        int ans = s.nextInt();
        
        if(ans == 1)
       {
            System.out.println("After you said you had no lasagne...");
            System.out.println("You said you don't like cats and he got offended. Now he's challenging you to a duel");
            System.out.println("Will you fight him");
            System.out.println("1 for yes");
            System.out.println("2 for no");
            
             ans = s.nextInt();
        
            if(ans == 1)
            {
                System.out.println("You surprisingly won");
                System.out.println("Garfield: I blame Odie for this one");
                System.out.println("Garfield dies");
                System.out.println("He dropped keys and a lightsaber");
                System.out.println("You now have keys and a lightsaber");

                System.out.println("You are at the beginning");
                
                bigSpaceShip();
                    
            }
        }
            
            
       else if(ans == 2)
       {
            System.out.println("You told him you won't fight him and you turned your back on him");
            System.out.println("Garfield: I'm getting bored");
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
        System.out.println("Who's there?");
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
            if(ans == 1)
           {
                System.out.println("You...once again, SURPRISINGLY, win...I don't know how but you did...");
                System.out.println("You have been equipped with a spacesuit");
                System.out.println("You see a compartment and open it");
                System.out.println("You now have a hot dog");
                System.out.println("Do you want to go outside?");
                
                System.out.println("1 for yes");
                System.out.println("2 for no");
               
                ans = s.nextInt();
                if (ans == 1)
                {
                
                    outside2();
    
                }
            
            
            else if(ans == 2)
           {
                System.out.println("DarthVader: Huh? You don't want to fight?");
                System.out.println("DarthVader: ...then perish");
                System.out.println("DarhtVader used the force and has suffocated you");
                System.out.println("You died");
                System.out.println("Press 1 to restart");
             
                
                if(ans == 1)
                {
                    bigSpaceShip();
                }
           }
            
         }
     
       
       }
  
     
    }
    
    public static void outside2()
    {
        System.out.println("You are outside");
        System.out.println("There are three things in front of you...");
        System.out.println("Five flying fish...");
        System.out.println("A man with a bird head...");
        System.out.println("And pres-...");
        System.out.println("...uh...president...Elmo...?");
        
        System.out.println("Okay...Who do you want to talk to?");
        System.out.println("1 for five flying fish");
        System.out.println("2 for the birdman");
        System.out.println("3 for...*sigh*...president Elmo");
        
        Scanner s = new Scanner(System.in);
        int ans = s.nextInt();
        
        if(ans == 1)
        {
            System.out.print("First fish: Why are we here?");
            
        
        
        
        
        
        }
        
        else if (ans == 2)
        {
            System.out.println("Birdman: I've lost my wings, can you help me?");
            System.out.println("Help him?");
            
            System.out.println("1 for yes");
            System.out.println("2 for no");
            
            
            if (ans == 1)
            {
                System.out.println("Birdman: Walk with me");
                System.out.println("You notice he's taking you to a cave but you don't really care");
                
                System.out.println("Birdman: Sorry about this...");
                System.out.println("He then pulls out a shotgun and shoots you");
                System.out.println("*surprise pikachu face* You died");
               
                System.out.println("1 to restart from the Big Sapceship");
                System.out.println("2 to restart from Outside");
                
                
                if (ans == 1)
                {
                    
                    bigSpaceShip();
                    
                }
                
                
                else if (ans == 2)
                {
                    
                    outside2();
                    
                }
                
            }
            
            else if (ans == 2)
            {
                System.out.println("Birdman: That's not very cash money of you");
                System.out.println("An asteroid comes out of nowhere and crashes on birdman");
                
                outside2();
 
                
            }
            
            
            
        
        }
        
        else
        {
            System.out.println("President Elmo: I need help getting back to Planet Teerts Emases. Can you help me?");
             
            
            
            
        }
    
    
    }
    
}

        
        
        
        
        
        
        
        
        
        
        
    


