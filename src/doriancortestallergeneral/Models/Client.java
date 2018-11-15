package doriancortestallergeneral.Models;

import doriancortestallergeneral.DataStructures.List;

/**
 * @author dcortes
 */
public class Client {
    private String name;
    private String lastName;
    private String phone;    
    private final List touristPackagesReserved = new List(TouristPackage.class);

    /**
     * Creates a Client
     * 
     * @param name Name
     * @param lastName Last Name
     * @param phone Phone
     */
    public Client(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;        
    }
    
    
    /*............. Sets & Gets .............*/    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the packages reserved by the Client
     * 
     * @return Packages reserved
     */
    public List getTouristPackagesReserved() {
        return touristPackagesReserved;
    }        
}
