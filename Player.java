public class Player {
    public int money;
    public int health;
    public int speed;
    public int distance;
    public int pace;
    public int baseMoneyBuff;
    public int moneyBuff;
    public int moneyDebuff;
    public int eventLuckRizz; //ew
    public String name;


    Player(String name){
        money = 100;
        health = 100;
        speed = 0;
        distance = 0;
        pace = 0;
        baseMoneyBuff = 1;
        moneyBuff=1;
        moneyDebuff =1;
        eventLuckRizz = 1; //ew
    }
    
    public int calculateDistance(int distance){
        this.distance = this.distance + distance;
        return this.distance;
        


    }
}
