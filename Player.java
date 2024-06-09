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
 * creates the player public class and sets the str name and int score to it.
 */
public class Player {
    private String name;
    private int score;
    /**
     * uses this name and score to set the values.
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * getters and setters for player name and scores uses strings and integers.
     */
    public String getPlayerName() {return name;}

    public void setPlayerName(String name) {this.name = name;}

    public int getPlayerScore() {return score;}

    public void setPlayerScore(int score) {this.score = score;}
}

