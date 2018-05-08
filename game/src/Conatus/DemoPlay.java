package Conatus;

import java.util.Scanner;

public class DemoPlay {
    public static Team team1;
    public static Team team2;
    public static void main(String[] args) {
        team1 = new Team();
        team2 = new Team();
        System.out.println("enter the choice 1:Rock, 2:paper, 3:Scissor");
        for (int i = 0; i < 3; i++) {
            System.out.println("weapon of team1:");
            Scanner scan = new Scanner(System.in);
            team1.choice = scan.nextInt();
            team1.setWeapon(team1.choice);
            System.out.println("weapon of team2:");
            team2.choice = scan.nextInt();
            team2.setWeapon(team2.choice);
            if (Weapons.Battle(team1.weapon, team2.weapon)) {
                team1.count++;
                System.out.println("team1 wins,go for the next");
            } else {
                team2.count++;
                System.out.println("team2 wins,go for the next");
            }

        }
        if(team1.count>team2.count)
            System.out.println("team1 wins");
        else
            System.out.println("team2 wins");
    }

}
