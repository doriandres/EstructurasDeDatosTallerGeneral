package doriancortestallergeneral.Models;

import doriancortestallergeneral.DataStructures.List;
import doriancortestallergeneral.DataStructures.Queue;
import doriancortestallergeneral.DataStructures.Stack;

/**
 * @author dcortes
 */
public class TouristPackage {

    private final String name;
    private final List registeredClients = new List(Client.class);
    private final Stack availableBusses = new Stack(Queue.class, 2);
    private final Stack fullBusses = new Stack(Queue.class, 2);
    private final String destiny;
    private final String description;

    /**
     * Creates a Tourist Package
     * 
     * @param name Name 
     * @param destiny Destiny
     * @param description  Description
     */
    public TouristPackage(String name, String destiny, String description) {
        this.name = name;
        this.destiny = destiny;
        this.description = description;
        availableBusses.push(new Queue(Client.class, 15));
        availableBusses.push(new Queue(Client.class, 15));
    }

    /**
     * Tourist Package name
     * 
     * @return Tourist Package name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns Tourist Package available busses
     * 
     * @return Tourist Package available busses
     */
    public Stack getAvailableBusses() {
        return availableBusses;
    }

    /**
     * Returns Tourist Package full busses
     * 
     * @return Tourist Package full busses
     */
    public Stack getFullBusses() {
        return fullBusses;
    }

    /**
     * Checks if the Package is available for an amount of Spaces
     * @param spaces Spaces
     * @return Result
     */
    public boolean isAvailable(int spaces) {
        if (availableBusses.length() > 0) {
            Queue bus = (Queue) availableBusses.peek();
            return bus.length() >= spaces || availableBusses.length() > 1;
        } else {
            return false;
        }
    }

    /**
     * Returns Tourist Package destiny
     * 
     * @return Tourist Package destiny
     */
    public String getDestiny() {
        return destiny;
    }

    /**
     * Returns Tourist Package description
     * 
     * @return Tourist Package description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Reserve spaces for a client
     * 
     * @param client Client
     * @param spaces Spaces
     * @return If the system could reserve the required spaces or not;
     */
    public boolean reserve(Client client, int spaces) {

        if (spaces < 1 || spaces > 5 || !isAvailable(spaces)) {
            return false;
        }

        if (client.getTouristPackagesReserved().contains(this)) {
            return true;
        }

        Queue bus = (Queue) availableBusses.peek();
        if (bus.contains(client)) {
            return true;
        }

        while (spaces > 0) {
            bus.enqueue(client);
            if (bus.getAvailableSpace() == 0) {
                fullBusses.push(availableBusses.pop());
                bus = (Queue) availableBusses.peek();
            }
            spaces--;
        }
        client.getTouristPackagesReserved().add(this);
        registeredClients.add(client);
        return true;

    }

    /**
     * Returns the Registered clients for this Tourist Package
     * 
     * @return Registered clients for this Tourist Package
     */
    public List getRegisteredClients() {
        return registeredClients;
    }       
    
    /**
     * Returns the Reserved spaces of a Client
     * 
     * @param client Client
     * @return Reserved spaces
     */
    public int getClientReservedSpaces(Client client){
        if(fullBusses.length() > 0){
            if(fullBusses.length() == 1){
                return  ((Queue) availableBusses.peek()).count(client) + ((Queue) fullBusses.peek()).count(client);
            }else{
                Queue bus = (Queue) fullBusses.pop();
                int result = bus.count(client) + ((Queue) fullBusses.peek()).count(client);
                fullBusses.push(bus);
                return result;
            }
        }else{
            Queue bus = (Queue) availableBusses.peek();
            return bus.count(client);
        }                               
    }

    /**
     * Returns the reserved spaces of the Tourist Package
     * @return Reserved spaces of the Tourist Package
     */
    public int getReservedSpaces(){
        int reservedSpaces = 0;
        for(int i = 0; i < registeredClients.length(); i++){
            reservedSpaces += getClientReservedSpaces((Client) registeredClients.get(i));
        }
        return reservedSpaces;        
    }
    
    
    public int getAvailableSpaces(){
        return 30 - getReservedSpaces();
    }
}
