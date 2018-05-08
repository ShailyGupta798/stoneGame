package Conatus;

import java.util.Random;

public class Rock extends Weapons{
    public static int strength;
    static {
        Random r=new Random();
        Rock.strength =r.nextInt(50);
    }
    public  void setStrength(int strength ){
        Rock.strength=strength;

    }
   public int getStrength(){
        return Rock.strength;
    }


}
