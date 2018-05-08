package Conatus;

import static Conatus.DemoPlay.team1;
import static Conatus.DemoPlay.team2;

public class Weapons {
    public static boolean Battle(String weapon1,String weapon2){
        if(weapon1=="Rock"&&weapon2=="Paper"){
           team1.weapons.setStrength(Rock.strength/2);
            team2.weapons.setStrength(Paper.strength*2);
            if(team1.weapons.getStrength()>=team2.weapons.getStrength()){
                return true;
            }
            else
                return false;
        }
       else if(weapon2=="Rock"&&weapon1=="Paper"){
            team2.weapons.setStrength(Rock.strength/2);
            team1.weapons.setStrength(Paper.strength*2);
            if(team1.weapons.getStrength()>=team2.weapons.getStrength()){
                return true;
            }
            else
                return false;
        }
        else if(weapon1=="Paper"&&weapon2=="Scissor"){
            team2.weapons.setStrength(Scissor.strength*2);
            team1.weapons.setStrength(Paper.strength/2);
            if(team1.weapons.getStrength()>=team2.weapons.getStrength()){
                return true;
            }
            else
                return false;
        }
        else if(weapon2=="Paper"&&weapon1=="Scissor"){
            team1.weapons.setStrength(Scissor.strength*2);
            team2.weapons.setStrength(Paper.strength/2);
            if(team1.weapons.getStrength()>=team2.weapons.getStrength()){
                return true;
            }
            else
                return false;
        }
      else if(weapon1=="Scissor"&&weapon2=="Rock"){
            team1.weapons.setStrength(Scissor.strength/2);
            team2.weapons.setStrength(Rock.strength*2);
            if(team1.weapons.getStrength()>=team1.weapons.getStrength()){
                return true;
            }
            else
                return false;
        }
        else if(weapon2=="Scissor"&&weapon1=="Rock"){
            team2.weapons.setStrength(Scissor.strength/2);
            team1.weapons.setStrength(Rock.strength*2);
            if(team1.weapons.getStrength()>=team1.weapons.getStrength()){
                return true;
            }
            else
                return false;
        }
      else{
            if(team1.weapons.getStrength()>=team2.weapons.getStrength())
                return true;
            else
                return false;
        }

    }

    public int getStrength() {
        return 0;
    }

    public void setStrength(int strength) {

    }
}
