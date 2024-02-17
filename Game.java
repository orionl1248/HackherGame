import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        ArrayList<Integer> pace = new ArrayList<Integer>();
        pace.add(10);
        pace.add(20);
        pace.add(30);

        //hello

        System.out.println("What is your name?");
        String name = input.nextLine();
        Player player = new Player(name);
        System.out.println("Your name is " + name);
        System.out.println("You are starting at " + player.distance + "m.");
        while (run){
            System.out.println(run);
            int choice = -1;
            System.out.println("Please Choose: Continue(1), Change Pace(2), Shop(3), Exit(4) ");
            choice = input.nextInt();
            while(choice <1 || choice > 4){
                System.out.println("Enter a valid choice.");
                choice = input.nextInt();
            }
            switch(choice) {
                case 1: //case for continuing on
                    System.out.println("You have chosen to continue.");
                    System.out.println("Travelling in progress...");
                    System.out.println(player.pace);
                    System.out.println("You have advanced " + pace.get(player.pace) + " mi." + " You are now at " + player.calculateDistance(pace.get(player.pace)) + " mi.");
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
                case 3: //brings up shop, can buy powerups/vehicles, shows money as well
                        
                    break;
                case 4: //case for exiting game
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