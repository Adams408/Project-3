/**
 * James Adams, Davian Glenn
 * November 25, 2018
 * Project 3
 * Flight.java
 */

public class Flight extends Ticket {
    private int flightNumber;
    private String startingCity;
    private String destinationCity;
    private String departureDate;
    private String departureTime;
    private int price;
    private int seat;

    public Flight(String name, char flightClass, int flightNumber, String startingCity, String destinationCity, String departureDate, String departureTime, int seat) {
        super(name, flightClass);
        this.flightNumber = flightNumber;
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.price = super.Price();
        this.seat = seat;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
