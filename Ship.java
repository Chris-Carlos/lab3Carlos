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
 * creates public class for ships and initializes name and health of ship.
 */
public class Ship {
    private String name;
    private int health;
    public Ship() {} // Default constructor required for Jackson
    public Ship(String name, int health) {
        this.name = name;
        this.health = health;
    }
    /**
     * getters and setter methods for ship name.
     */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    /**
     * getters and setter methods for ship health.
     */
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}
}