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
 * Creating the public class and setting it to this name.
 */
public class Game {
    private String name;
    public Game(String name) {this.name = name;}
    /**
     * getter method for game/save name
     */
    public String getName() {return name;}

    /**
     * setter method for the game/save name.
     */
    public void setName(String name) {this.name = name;}
}