package Conatus;

import java.util.Random;

public class Paper extends Weapons{
        public static int strength;
        static {
            Random r=new Random();
            Paper.strength =r.nextInt(50);
        }

   public  void setStrength(int strength ){
        Paper.strength=strength;

    }
   public  int getStrength(){
        return Paper.strength;
    }
}
