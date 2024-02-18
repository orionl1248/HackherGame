public class RandomEvent {
    int luck;
    int distance;
    int event;
    double multiplier = 0.0;
    RandomEvent(int luck, int distance){
        this.luck = luck;
        this.distance = distance;
        event = (int)(Math.random()*5);
        if(event == 0){
            multiplier = event0();
        }else if(event == 1){
            multiplier = event1();
        }else if(event == 2){
            multiplier = event2();
        }else if(event == 3){
            multiplier = event3();
        }else if(event == 4){
            multiplier = event4();
        }

        this.distance = (int) (distance + .1*(distance*multiplier) + luck*);
    }

    private double event4() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("Goose of Good Luck gives you a ride. You gain lots of distance!!");
        double x = 2;
        return x;
    }

    private double event3() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("Those van-life people sure were weird but they sure gave you a boost! You gain some distance!");
        double x = 1;
        return x;
    }

    private double event2() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("How can google maps be so accurate? It may be uncanny, but it doesn't hurt or help your distance. Keep trucking on!");
        double x = 0;
        return x;
    }

    private double event1() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("You absolutely HAD to try the worlds best BBQ! Who knew they kept good food like that in strip malls? You lose some distance.");
        double x = -1;
        return x;
    }

    private double event0() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("Hey, don't be ashamed. Everyone joins a cult at one point or another. (You did lose lots of distance D:)");
        double x = -2;
        return x;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
          sb.append("Distance Multiplier: ");
          sb.append(multiplier);
          sb.append("\nYour new distance is: ");
          sb.append(distance);
          return sb.toString();}
    
}
