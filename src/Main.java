import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Room currentRoom;


        // Initialize each room
        Room one = new Room("Room One", "first room");
        Room two = new Room("Room Two", "second room");
        Room three = new Room("Room Three", "third room");

        // Initialize the map for each room

        // The key is a String (your direction) and the value is another Room object
        // HashMap<Key, Value> map = new HashMap<Key, Value>();
        // Think of a HashMap as a wall of safety deposit boxes, there is the box # (the key)
        // and the box contents (the value), in this case the String (north, south, east, west)
        // is the key, and the value inside is another Room object that is in that direction
        
        HashMap<String, Room> roomOneMap= new HashMap<String, Room>();
        HashMap<String, Room> roomTwoMap= new HashMap<String, Room>();
        HashMap<String, Room> roomThreeMap= new HashMap<String, Room>();




        // Fill the map for each room - three rooms in a vertical line - one is south three is north
        // .put fills an element of the HashMap, you can do them in any order, unlike Arrays, because
        // the index does not matter, only the key and value. 
        // Syntax of .put is: HashMap.put(key, value);
        roomOneMap.put("north", two);
        roomTwoMap.put("north", three); 
        roomTwoMap.put("south", one);
        roomThreeMap.put("south", two);

        // Assign the filled maps to their rooms, so the data is held in each room
        one.setMap(roomOneMap);
        two.setMap(roomTwoMap);
        three.setMap(roomThreeMap);
        
    	// Flow in the Print: Room one - room one's map - get an element from room one's map - "north" is the key
        // So the element returned is room two - room two's name
        
        System.out.println(one.printPrompt());
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next();
        currentRoom = one;
        while(!direction.equals("stop")) {
        	System.out.println(currentRoom.printPrompt());
        	currentRoom = currentRoom.map.get(direction);
        }
        


    }
}