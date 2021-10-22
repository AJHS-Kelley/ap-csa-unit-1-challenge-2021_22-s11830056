// <Johann Burke>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/20/2021>, <9:30>, v1.0
// Peer Debugging by Lorenzo Kenon
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please Input your UserName: ");

        String userName = myScanner.nextLine();
        System.out.println("welcome: " + userName);

        System.out.println("\nplease Imput name of attack:");
        String weaponAttack = myScanner.nextLine();
        System.out.println("your Attack is: " + weaponAttack);

        System.out.println("\nPlease input name of monster: ");
        String monsterName = myScanner.nextLine();
        System.out.println("The Name of the monster is: " + monsterName);

        System.out.println("\nPlease input the number of attacks: ");
        int numberOfAttacks = myScanner.nextInt();
        System.out.println("The Number of attacks: "+ numberOfAttacks);

        System.out.println("\nPlease input attack damage:");
        double attackDamage = myScanner.nextDouble();
        System.out.println("attack damage is: "+ attackDamage);

        
    }
}