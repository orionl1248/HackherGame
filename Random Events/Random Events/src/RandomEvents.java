public class RandomEvents {
    int luck;
    int distance;
    int event;
    RandomEvents(int luck, int distance){
        this.luck = luck;
        this.distance = distance;
        event = (int)(Math.random()*4);
    }

    public void LaunchEvent(){
        if(event == 0){
            event0();
        }else if(event == 1){
            event1();
        }else if(event == 2){
            event2();
        }else if(event == 3){
            event3();
        }else if(event == 4){
            event4();
        }
    }

    private void event4() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 4");
    }

    private void event3() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 3");
    }

    private void event2() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 2");
    }

    private void event1() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 1");
    }

    private void event0() {
        System.out.println("Your current luck is: "+luck);
        System.out.println("This is event 0");
    }

    
}
