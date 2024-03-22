package org.example;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());


        Player player1 = new Player("Player 1", 120, Weapon.SWORD);
        System.out.println("Player 1 health: " + player1.healthRemaining());

        Player player2 = new Player("Player 2", -20, Weapon.SWORD);
        System.out.println("Player 2 health: " + player2.healthRemaining());

        Player player3 = new Player("Player 3", 70, Weapon.SWORD);
        System.out.println("Player 3 health before losing health: " + player3.healthRemaining());


        player3.loseHealth(50);
        System.out.println("Player 3 health after losing health: " + player3.healthRemaining());
        player3.loseHealth(30);


        Player player4 = new Player("Player 4", 50, Weapon.SWORD);
        System.out.println("Player 4 health before restoring health: " + player4.healthRemaining());
        player4.restoreHealth(30);
        System.out.println("Player 4 health after restoring health: " + player4.healthRemaining());
        player4.restoreHealth(50);
        System.out.println("Player 4 health after restoring health: " + player4.healthRemaining());

    }
}