// imports for jackson
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Project: Space Game
 * Purpose Details: Creating a serialized JSON for space game.
 * Course: IST 242 Section 611 Inter App Dev
 * Author: Christopher Carlos
 * Date Developed: 06/09/24
 * Last Date Changed: 06/09/24
 * Revision: 1
 */
public class Main {

    public static void main (String[] args) {
        // Creating an instance of the Ship class
        Ship ship = new Ship("Starship", 100);

        // Serialization: Converting the ship object to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String shipJson = objectMapper.writeValueAsString(ship);
            System.out.println("Ship object serialized to JSON string:");
            System.out.println(shipJson);

            // Deserialization: Converting the JSON string back to a ship object
            Ship deserializedShip = objectMapper.readValue(shipJson, Ship.class);
            System.out.println("\nShip object deserialized from JSON string:");
            System.out.println("Name: " + deserializedShip.getName());
            System.out.println("Health: " + deserializedShip.getHealth());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
