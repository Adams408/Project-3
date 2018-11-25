/**
 * James Adams, Davian Glenn
 * November 25, 2018
 * Project 3
 * Airplane.java
 */

public class Airplane {
    private int flightNumber;
    private String startingCity;
    private String destinationCity;
    private String departureDate;
    private String departureTime;

    private Flight[] flights;
    private int seat = 1;

    public Airplane(int flightNumber, String startingCity, String destinationCity, String departureDate, String departureTime, int numOfSeats) {
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureTime = departureTime;

        flights = new Flight[numOfSeats];
    }

    public void purchaseTicket(String name, char flightClass) throws allTicketSold {
        if (!airplaneFull()) { // if their ticket is available
            flights[seat] = new Flight(name, flightClass, this.flightNumber, this.startingCity, this.destinationCity, this.departureDate, this.departureTime, seat);
            seat++;
        } else {  // this is where the exception will be thrown because the seat is not available for their given time
            throw new allTicketSold("\nThere are currently no seats available for flight " + this.flightNumber +
                    " Leaving at " + this.departureTime + " from " + this.startingCity + " to " + this.destinationCity + "\n");
        }
    }

    public boolean airplaneFull() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                return false;
            }
        }
        return true;
    }
    
    public void print() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                System.out.println("Name: " + flights[i].getName() +
                        "\nDate: " + this.departureDate + " Time: " + this.departureTime + " Seat Number: " + this.seat +
                        "\n$" + flights[i].getPrice());
            }
        }
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
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
}
