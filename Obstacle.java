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
 * Creates public class obstacle and initializes a name to it.
 */
public class Obstacle {
    private String name;
    public Obstacle(String name) {this.name = name;}

    /**
     * Setter and getter method for obstacle names.
     */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
