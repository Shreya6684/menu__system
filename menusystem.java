import java.util.Scanner;
public class menusystem 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int category;
        System.out.println("---SIMPLE MENU SYSTEM---");
        System.out.println("choose a category");
        System.out.println("1.Food");
        System.out.println("2.Drink");
        System.out.println("enter your choice(1 or 2):");
        category = ob.nextInt();
        switch(category)
        {
            case 1:
                System.out.println("\nFood options:");
                System.out.println("1.Pizza");
                System.out.println("2.Burger");
                System.out.println("Enter your choice(1 or 2):");
                int foodChoice = ob.nextInt();
                switch(foodChoice)
                {
                    case 1:
                        System.out.println("You have selected pizza!");
                        System.out.println("Price: $12.99");
                        break;
                    case 2:
                        System.out.println("You have selected burger");
                        System.out.println("Price: $8.99");
                        break;
                    default:
                        System.out.println("Invalid Food choice");
                        break;
                }
                break;
            case 2:
                System.out.println("\nDrink options:");
                System.out.println("1.Coffee");
                System.out.println("2.Juice");
                System.out.println("Enter your choice(1 or 2):");
                int drinkChoice = ob.nextInt();
                switch(drinkChoice)
                {
                    case 1:
                        System.out.println("You have selected Coffee");
                        System.out.println("Price: $4.50");
                        break;
                    case 2:
                        System.out.println("You have selected Juice");
                        System.out.println("Price: $3.99");
                        break;
                    default:
                        System.out.println("Invalid Drink choice");
                        break;
                }
                break;
            default:
                System.out.println("Invalid category!");
        }
        System.out.println("Thank you for using the menu system!");

        
    }

    
}
