/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * Ticket.java
 */

public class Ticket {

    private String name;
    private char flightClass;
    private int price;

    public Ticket(String name, char flightClass) {
        this.name = name;
        this.flightClass = flightClass;
    }

    public int Price(){
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
