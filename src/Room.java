import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Room {
    // *** FIELDS FOR ROOM ***
    
	String name; // The name of the room
    String description; // The description of the room
    HashMap<String, Room> map = new HashMap<String, Room>(); // HashMap storing a room for each direction
    
    // Constructor for Room - uses name and description to create
    public Room(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // *** METHODS FOR ROOM ***

    // This assigns a map to the room's map field
    public void setMap(HashMap<String, Room> map){
        this.map = map;
    }
    
    // Ignore this for now! 
   /*
    public String validDirections() {
    	String output = "";
    	for (String key : map.keySet()) {
    	    output = (key + " " + map.get(key));
    	}

    	for (Map.Entry<String, Room> entry : map.entrySet()) {
    	    String key = entry.getKey().toString();
    	    Room value = entry.getValue();
    	    output.concat((key + ": " + value.name + " "));
    	}
    	return output;
    }
*/
   
    // This will eventually print the prompt for each room (currently unused)
    public String printPrompt(){
        
    	return "You are currently in " + name + "\n \n" + description + "\n \n"
        		+ "Your avalible moves are: \n";
    	
        		
    	
    }

}