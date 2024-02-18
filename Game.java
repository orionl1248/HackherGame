import java.util.ArrayList;
import java.util.Scanner;



public class Game {

    public static void main(String[] args)  throws InterruptedException{
        double RandomEventChance = 0.0;
        int WinningDistance = 2645;
        int HealthDrain = 1;
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
        System.out.println("\033[3mYou wake up, head on the concrete, poker chips in hand, and your tie knotted around your forehead...\033[0m");
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
        System.out.println("...I bet they can get me out.\n");
        Thread.sleep(2000);
        System.out.println("What does that road sign say anyways?");
        Thread.sleep(800);
        System.out.println("Sign: \033[3m\"You are starting at " + player.distance + "mi. You have "+ (WinningDistance-player.distance) + "mi to go\"\033[0m");
        Thread.sleep(350);
        MapImage.Map();
        Thread.sleep(4700);
        System.out.println("Damn...");
        Thread.sleep(1000);
        System.out.println("And I thought the walk to Worcester was far.");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(300);
        System.out.println(".");
        Thread.sleep(300);
        System.out.println(".");
        Thread.sleep(300);
        System.out.println("Are you ready to begin?");
        Thread.sleep(300);
        int set = -1;
        System.out.println("Instructions(1), Get started(2)");
        set = input.nextInt();
        switch(set){
            case 1:
                System.out.println("Hello.. This is the great goose of instructions here.");
                Thread.sleep(800);
                System.out.println("Your goal is to get back home to UMass before midterms \033[3m(they come up faster than you think)\033[0m");
                Thread.sleep(1000);
                System.out.println("Option 1: Continue on to make some walking progress. ");
                Thread.sleep(1000);
                System.out.println("Option 2: Walk a little faster, walk a little slower. ");
                Thread.sleep(1000);
                System.out.println("Option 3: Use your dwindling funds to speed up your trek. ");
                Thread.sleep(1000);
                System.out.println("Option 4: Put your fate back in the hands of the lotto gods & spin to try to make it big");
                Thread.sleep(1000);
                System.out.println("Option 5: Give up & live in the midwest forever \033[3m(ugh)\033[0m");
                Thread.sleep(8000);
                System.out.println("\nStrap on your hiking boots & Get ready!");
                Thread.sleep(1000);
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid input.");  
        }

        while (run && player.distance<WinningDistance){
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
                    //random event ***
                    RandomEventChance = Math.random();
                    if (RandomEventChance <= 0.3){
                        RandomEvent n = new RandomEvent(player.eventLuckRizz, player.distance);
                        player.distance = n.distance;
                    }
                    player.health += (-1*HealthDrain);
                    Thread.sleep(1000);
                    //random event ***
                    System.out.println("You have advanced " + (pace.get(player.pace) + player.speed) + " mi." + " You are now at " + player.calculateDistance(pace.get(player.pace) + player.speed) + " mi.");
                    if (player.health <= 0){
                        System.out.println("Oops! Your health is 0 :(");
                        System.out.println("Where's UHS when you need them?");
                        Thread.sleep(1000);
                        System.out.println("\nGood luck in Middle-America, Young Minuteman.");
                        Thread.sleep(1000);
                        System.out.println("...Maybe UUtah will adopt you?");
                        run = false;
                    }
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
                            HealthDrain = 1;
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
                            HealthDrain = 3;
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
                            HealthDrain = 6;
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
                    Thread.sleep(900);
                    System.out.println("You have $" + player.money + " to spend.");
                    Thread.sleep(900);
                    if (player.money <= 0){
                        System.out.println("The slots got you again? Try earning some more money & coming back later.");
                        Thread.sleep(1200);
                        break;
                    }
                    System.out.println("Here are the options: ");
                    for (int i = 0; i < shop.size(); i++) {
                        System.out.println("Item " + (i+1) + ": " + shop.get(i));
                    }
                    Thread.sleep(1700);
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
                            System.out.println("You have purchased \"It's 11:58 as you're running to Late-Night Worcester.\" You lose 1 health, gain 5 speed and pay $25.");
                            player.money = player.money -20;
                            player.health = player.health -2;
                            player.speed = player.speed +5;
                            break;  
                        case 4: 
                            System.out.println("You have purchased Cute Umass Ducks.");
                            System.out.println("Unfortunately, they attack you mercillessly. You lose " + (player.health-1) + " health and pay $100.");
                            
                            player.money = player.money -100;
                            player.health = 1;
                            break;   
                        case 5:
                            System.out.println("Leaving the shop...");
                            Thread.sleep(400);
                            break;
                        default:
                            System.out.println("Invalid input.");                
                    }
                    System.out.println("You have $" + player.money + " to spend.");
                    break;
                case 4: //slot case
                    System.out.println("How much money do you want to bet?");
                    int bet = input.nextInt();
                    if(player.money <= 0){
                    System.out.println("These slots got you again? Try earning some more money & coming back later.");}
                    while(bet <1 || bet > player.money){
                        System.out.println("Enter a valid amount.");
                        bet = input.nextInt();
                    }
                    Slot slot = new Slot(bet);
                    slot.move();
                    player.money += (slot.output-slot.input);
                    System.out.println(slot);
                    Thread.sleep(900);
                    System.out.println("\nYour current money is: "+ player.money);
                    Thread.sleep(900);
                    break;
                case 5: //case for exiting game
                    run = false;
                    System.out.println("Who needs UMass when you have UUtah? May not roll off the tongue as well, but you gave it your best shot! We hope to never see you again.");
                    Thread.sleep(1000);
                    break;
                default: //invalid input
                    System.out.println("Invalid input.");          
                }
            }

            if(run){
                System.out.println("\n\nW-O-W! What a journey.\n");
                Thread.sleep(700);
                System.out.println("I missed those cute campus pond ducks.");
                Thread.sleep(900);
                System.out.println("But not this weather.");
                Thread.sleep(900);
                SmallGooseAttack.firstGooseAttack();
                System.out.println("AHHHH");
                Thread.sleep(2000);
                System.out.println("Where am I?");
                Thread.sleep(500);

                System.out.println("Am I... \033[3min a hospital bed?\033[0m");
                Thread.sleep(500);
                System.out.println("Wait... what is that?!?");
                Thread.sleep(2000);
                GooseAttack.finalGooseAttack();
                System.out.println("\033[3m screams in horror\033[0m");



            }
        }


    }
    



//Travel from Point A to Point B, with a level for Umass stuff.