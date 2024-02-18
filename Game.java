import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    int RandomEventChance = 0;

    public static void main(String[] args)  throws InterruptedException{
        Scanner input = new Scanner(System.in);
        boolean run = true;
        ArrayList<Integer> pace = new ArrayList<Integer>();
        pace.add(10);
        pace.add(20);
        pace.add(30);
        ArrayList<String> shop = new ArrayList<String>();
        shop.add("Cucumber Lemonade ($10)");
        shop.add("Halloween Lobster ($20)");
        shop.add("It's 11:58 as you're running to Worcester ($25)");
        shop.add("Cute UMass geese ($100, Mystery Effect ;) ");//buy this and lose health;
        
        System.out.println("...what?");
        Thread.sleep(1000);
        System.out.println("...How did I get here?");
        Thread.sleep(1000);
        System.out.println("Gosh... What is my name?");
        String name = input.nextLine();
        Player player = new Player(name);
        System.out.println("Your name is " + name);
        System.out.println("You are starting at " + player.distance + "m.");
        while (run){
            System.out.println(run);
            int choice = -1;
            System.out.println("Please Choose: Continue(1), Change Pace(2), Shop(3), Try your luck (4), Exit(5) ");
            choice = input.nextInt();
            while(choice <1 || choice > 5){
                System.out.println("Enter a valid choice.");
                choice = input.nextInt();
            }
            switch(choice) {
                case 1: //case for continuing on
                    System.out.println("You have chosen to continue.");
                    System.out.println("Travelling in progress...");
                    System.out.println(player.pace);
                    System.out.println("You have advanced " + (pace.get(player.pace) + player.speed) + " mi." + " You are now at " + player.calculateDistance(pace.get(player.pace) + player.speed) + " mi.");
                    break;
                case 2: //case for changing pace
                    choice = -1;
                    System.out.println("You have chosen to change your pace.");
                    System.out.println("Do you want to keep your pace or would you rather change it?");
                    System.out.println("Here is a list of choices: Chill(1), Tiring(2), Debilitating(3), No Change(4)");
                    while(choice <1 || choice > 4){
                        System.out.println("Enter a valid choice.");
                        choice = input.nextInt();
                    }
                    switch(choice) {
                        case 1: 
                            choice = -1;
                            System.out.println("You have chosen the Chill pace. Are you sure? Press 0 for yes and 1 for no.");

                            while(choice <0 || choice > 1){
                                System.out.println("Enter a valid choice.");
                                choice = input.nextInt();
                            }
                            if(choice == 0){
                                player.pace = 0;
                                System.out.println("Nice.");
                            }
                            if(choice == 1){
                                System.out.println("Okay.");
                            }
                            break;
                        case 2: 
                            choice = -1;
                            System.out.println("You have chosen the Normal pace. Are you sure? Press 0 for yes and 1 for no.");
                            while(choice <0 || choice > 1){
                                System.out.println("Enter a valid choice.");
                                choice = input.nextInt();
                            }
                            if(choice == 0){
                                player.pace = 1;
                                System.out.println("Nice.");
                            }
                            if(choice == 1){
                                System.out.println("Okay.");
                            }
                            break;
                        case 3: 
                            choice = -1;
                            System.out.println("You have chosen the Debilitating pace. Are you sure? Press 0 for yes and 1 for no.");
                            while(choice <0 || choice > 1){
                                System.out.println("Enter a valid choice.");
                                choice = input.nextInt();
                            }
                            if(choice == 0){
                                player.pace = 2;
                                System.out.println("Nice.");
                            }
                            if(choice == 1){
                                System.out.println("Okay.");
                            }       
                            break;
                    }
                    break;
                case 3: //brings up shop, can buy powerups, shows money as well
                    System.out.println("Welcome to the Shop!");
                    System.out.println("You have $" + player.money + " to spend.");
                    System.out.println("Here are the options: ");
                    for (int i = 0; i < shop.size(); i++) {
                        System.out.println("Item " + (i+1) + ": " + shop.get(i));
                    }
                    System.out.println("Do you want to buy anything? Enter the item number to buy it. (Or select 5 for none)");
                    choice = -1;
                    while(choice <1 || choice > 4){
                        System.out.println("Enter a valid choice.");
                        choice = input.nextInt();
                    }
                    switch(choice){
                        case 1: 
                            System.out.println("You have purchased Cucumber Lemonade. You gain 9 health and pay $10.");
                            player.money = player.money -10;
                            player.health = player.health +9;
                            break;
                        case 2: 
                            System.out.println("You have purchased Halloween Lobster. You gain 24 health and pay $20.");
                            player.money = player.money -20;
                            player.health = player.health +24;
                            break;    
                        case 3: 
                            System.out.println("You have purchased \"It's 11:58 as you're running to Worcester.\" You lose 1 health, gain 5 speed and pay $25.");
                            player.money = player.money -20;
                            player.health = player.health -2;
                            player.speed = player.speed +5;
                            break;  
                        case 4: 
                            System.out.println("You have purchased Cute Umass Ducks.");
                            System.out.println("Unfortunately, they attack you mercillessly. You lose " + (player.health-1) + " health and pay $100.");
                            
                            player.money = player.money -100;
                            player.health = 1;
                            System.out.println(player.money);
                            break;   
                        case 5:
                            System.out.println("Leaving the shop...");
                            break;
                        default:
                            System.out.println("Invalid input.");                
                    }
                    break;
                case 4: //slot case
                    System.out.println("How much money do you want to bet?");
                    int bet = input.nextInt();
                    while(bet <1 || bet > player.money){
                        System.out.println("Enter a valid amount.");
                        bet = input.nextInt();
                    }
                    Slot slot = new Slot(bet);
                    slot.move();
                    player.money += (slot.output-slot.input);
                    System.out.println(slot);
                    System.out.println("Your current money is: "+ player.money);
                    break;
                case 5: //case for exiting game
                    run = false;
                    System.out.println("Thanks for playing :D");
                    break;
                default: //invalid input
                    System.out.println("Invalid input.");          
                }
            }
        }


    }
    



//Travel from Point A to Point B, with a level for Umass stuff.