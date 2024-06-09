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
 * Creates the public class power-up and sets this name and duration to it.
 */
public class PowerUp {
    private String name;
    private int duration;

    public PowerUp(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
     * Setter and Getter method for power up name.
     */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    /**
     * Setter and Getter method for power up duration.
     */
    public int getDuration() {return duration;}
    public void setValue(int duration) {this.duration = duration;}
}