
public class Slot {
    public static final String dollar = "$";
    public static final String S = "+";
    public static final String a = "#";
    public static final String b = "~";
    public static final String c = "@";
    public static final String Base = "?";

    String[] machine; 

    int input = 0;
    int constant = 0;
    int col1 = 0;
    int col2 = 0;
    int col3 = 0;
    int output = 0;

    Slot(int input){
        this.input = input;

        machine = new String[3];
        for(int i = 0; i<3; i++){
            machine[i] = Base; 
        }
    }
    public String set_symbol(int x){
        String s = "";
        if (x==0){
            s = dollar;
        }else if(x==1){
            s = S;
        }else if(x==2){
            s = a;
        }else if(x==3){
            s = b;
        }else if(x==4){
            s = c;
        }
        return s;
    }

    public void move() {
        col1 = (int)(Math.random()*5);
        col2 = (int)(Math.random()*5);
        col3 = (int)(Math.random()*5);

        machine[0] = set_symbol(col1);
        machine[1] = set_symbol(col2);
        machine[2] = set_symbol(col3);

        if (col1 == col2 && col1 == col3){
            constant = (int)(4+input*.1);
        }else if(col1==col2 || col1==col3 || col2==col3){
            constant = 1;
        }else{constant = 0;}

        output = input*constant;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
          sb.append("\nS L O T");
          sb.append("\n-------\n");
          sb.append("|");
          for (int i = 0; i < 3; i++){
              sb.append(machine[i]);
              sb.append("|");
          }
          sb.append("\n-------\n");
          if (output-input >=0){
            sb.append("\n Money Gained: ");
          }else{
            sb.append("\n Money Lost: ");
          }
          sb.append(output-input);
          return sb.toString();}
}
