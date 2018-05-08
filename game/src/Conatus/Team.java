package Conatus;

public class Team {
   public int teamScore;
   public int choice;
   public String weapon;
   public Weapons weapons;
   public int count=0;

   public void setTeamScore(int awardPoint){

       this.teamScore=this.teamScore+awardPoint;
   }
    public void setWeapon(int choice){
       if(choice==1){
           this.weapon="Rock";
           weapons=new Rock();
       }
        else if(choice==2){
            this.weapon="Paper";
           weapons=new Paper();
        }
        if(choice==3){
            this.weapon="Scissor";
            weapons=new Scissor();
        }
    }

}
