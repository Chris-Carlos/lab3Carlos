/**
 * Project: Space Game
 * Purpose Details: Creating a text based adventure game.
 * Course: IST 242 Section 611 Inter App Dev
 * Author: Christopher Carlos
 * Date Developed: 05/20/24
 * Last Date Changed: 05/26/24
 * Revision: 2
 */

public class Main {
    public static void main(String[] args) {
// Creates game save, player name, ships, obstacles, power-ups, and enemies with health bars.
        /**
         * Each class is used to name and sets values to the different objects.
         */
        Game save = new Game("Save1");
        Player player = new Player("Player1", 0);
        Ship starship = new Ship("Starship", 100);
        Obstacle asteroid = new Obstacle("Comet");
        PowerUp shield = new PowerUp("Energy Shield", 100);
        Enemy alienSpaceship = new Enemy("Alien Spaceship", 100);
        Enemy pirateStarwing = new Enemy("Pirate Starwing", 100);

// Print out the values using the getter methods, setter methods are located in class files.
        /**
         * This is where the print values will be set for each class using concatenated statements.
         */
        System.out.println("Game: " + save.getName());
        System.out.println("Player: " + player.getPlayerName() + ", Score: " + player.getPlayerScore());
        System.out.println("Ship: " + starship.getName() + ", Health: " + starship.getHealth());
        System.out.println("Obstacle: " + asteroid.getName());
        System.out.println("PowerUp: " + shield.getName() + ", Duration: " + shield.getDuration());
        System.out.println("Enemy: " + alienSpaceship.getName() + ", Health: " + alienSpaceship.getHealth());
        System.out.println("Enemy: " + pirateStarwing.getName() + ", Health: " + pirateStarwing.getHealth());
    }
}