package lab4;

import java.util.Scanner;


public class Lab4 
{

    public static void main(String[] args) 
    {   
        Scanner in = new Scanner(System.in);
        int exit = 1;
        while (exit == 1)
        {
            System.out.println("Number of dice");
            int numOf = in.nextInt();
            System.out.print("Enter Sides: ");
            int sides = in.nextInt();            
            
            for (int i = 0; i < numOf; i++)
            {
                Die z = new Die(sides);
                z.roll();
                System.out.println(z);                
            }
            
            System.out.println("Enter 1 to continue: ");
            exit = in.nextInt();
                    
        }
        for (int i =0; i < 5; i++)
        {
            int decider = (int)(Math.random()*7)+1;
            switch(decider)
            {
                    case 1:
                        Die a = new Die(4);
                        a.roll();
                        if( i < 4)
                        {
                        System.out.print(a.toString() + ",");
                        }
                        else
                        {
                        System.out.print(a.toString());
                        }
                        break;
                        
                    case 2:
                        Die b = new Die(6);
                        b.roll();
                        if( i < 4)
                        {
                        System.out.print(b.toString() + ",");
                        }
                        else
                        {
                        System.out.print(b.toString());
                        }
                        break;
                        
                    case 3:
                        Die c = new Die(8);
                        c.roll();
                        if( i < 4)
                        {
                        System.out.print(c.toString() + ",");
                        }
                        else
                        {
                        System.out.print(c.toString());
                        }
                        break;
                        
                    case 4:
                        Die d = new Die(10);
                        d.roll();
                        if( i < 4)
                        {
                        System.out.print(d.toString() + ",");
                        }
                        else
                        {
                        System.out.print(d.toString());
                        }
                        break;
                        
                    case 5:
                        Die e = new Die(12);
                        e.roll();
                        if( i < 4)
                        {
                        System.out.print(e.toString() + ",");
                        }
                        else
                        {
                        System.out.print(e.toString());
                        }
                        break;
                        
                    case 6:
                        Die f = new Die(20);
                        f.roll();
                        if( i < 4)
                        {
                        System.out.print(f.toString() + ",");
                        }
                        else
                        {
                        System.out.print(f.toString());
                        }
                        break;
                        
                    case 7:
                        Die g = new Die(100);
                        g.roll();
                        if( i < 4)
                        {
                        System.out.print(g.toString() + ",");
                        }
                        else
                        {
                        System.out.print(g.toString());
                        }
                        break;
                        
            } 
        }   
        
    }
    
}
