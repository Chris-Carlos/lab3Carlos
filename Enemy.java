/**
 * Project: Space Game
 * Purpose Details: Creating a text based adventure game.
 * Course: IST 242 Section 611 Inter App Dev
 * Author: Christopher Carlos
 * Date Developed: 05/20/24
 * Last Date Changed: 05/26/24
 * Revision: 2
 */
/**
 * creates public class Enemy and sets name and health to current values.
 */
public class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * getter and setter methods for enemy name.
     */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    /**
     * getter and setter methods for enemy health.
     */
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}
}