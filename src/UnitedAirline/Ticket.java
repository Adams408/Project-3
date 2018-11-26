package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 25, 2018
 * Project 3
 * UnitedAirline.Ticket.java
 */

public class Ticket {

    private String name;
    private char flightClass;
    private int price;
    private int seat;

    /**
     * @param name
     * @param flightClass
     */
    public Ticket(String name, char flightClass) {
        this.name = name;
        this.flightClass = flightClass;
    }

    public int Price(){ // price based on class chosen
        switch(this.flightClass){
            case 'E':
                price = 300;
                break;
            case 'B':
                price = 450;
                break;
            case 'F':
                price = 900;
                break;
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }
}
