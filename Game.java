import java.util.ArrayList;
import java.util.Scanner;


public class Game {

    public static void main(String[] args)  throws InterruptedException{
        double RandomEventChance = 0.0;

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
        

        //START OF STORY
        System.out.println("...ugh...");
        Thread.sleep(1200);
        System.out.println("**You wake up, head on the concrete, poker chips in hand, and your tie knotted around your forehead...**");
        Thread.sleep(2550);
        System.out.println("...what?");
        Thread.sleep(1200);
        System.out.println("...How did I get here?");
        Thread.sleep(1200);
        System.out.println("\033[3mP-POUND\033[0m");
        Thread.sleep(300);
        System.out.println("Ow... My head is pounding");
        Thread.sleep(1000);
        System.out.println("Am I... \033[3mStill\033[0m in Vegas?\n");
        Thread.sleep(1800);
        System.out.println("Damn... I totally missed my flight. And... my wallet???");
        Thread.sleep(2700);
        System.out.println("...And a hundred dollar bill in my belt? What in the world did I get up to last night?");
        Thread.sleep(2700);
        System.out.println("\033[3mP-POUND\033[0m");
        Thread.sleep(300);
        System.out.println("");
        System.out.println("Gosh... What is my name?");
        String name = input.nextLine();
        Player player = new Player(name);
        System.out.println("OH yeah... \"" + name + "\" is on my ID. At least I still have that.");
        Thread.sleep(2500);
        System.out.println("No way I can get another plane ticket with this kind of money.");
        Thread.sleep(1800);
        System.out.println("Well...");
        Thread.sleep(500);
        System.out.println("If the slots got me into this mess...");
        Thread.sleep(1000);
        System.out.println("...I bet they can get me out.");
        Thread.sleep(2000);
        System.out.println("What does that road sign say anyways?");
        Thread.sleep(800);
        System.out.println("Sign: \033[3m\"You are starting at " + player.distance + "m.\"\033[0m");
        Thread.sleep(2700);
        System.out.println("Damn...");
        Thread.sleep(800);
        System.out.println("And I thought the walk to Worcester was far.");
        Thread.sleep(1000);
        while (run){
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
                    //random event ***
                    RandomEventChance = Math.random();
                    System.out.println(RandomEventChance);
                    if (RandomEventChance <= 0.3){
                        RandomEvent n = new RandomEvent(player.eventLuckRizz, player.distance);
                        player.distance = n.distance;
                        System.out.println(n);
                        System.out.println(player.distance);
                    }
                    //random event ***
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