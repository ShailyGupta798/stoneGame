package Conatus;

import java.util.Random;

public class Scissor extends Weapons {
    public static int strength;
    static {
        Random r=new Random();
        Scissor.strength =r.nextInt(50);
    }
   public  void setStrength(int strength ){
        Scissor.strength=strength;

    }
    public int getStrength(){
        return  Scissor.strength;
    }
}
