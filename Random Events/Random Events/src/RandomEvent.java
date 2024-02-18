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

        this.distance = (int) (distance*multiplier);
    }

    private double event4() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 4");
        double x = 2;
        return x;
    }

    private double event3() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 3");
        double x = 1.5;
        return x;
    }

    private double event2() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 2");
        double x = 1;
        return x;
    }

    private double event1() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 1");
        double x = .5;
        return x;
    }

    private double event0() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 0");
        double x = 0;
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
