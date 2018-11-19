/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * Airplane.java
 */

public class Airplane {
    private int flightNumber;
    private String startingCity;
    private String destinationCity;
    private String departureTime;
    private String arrivalTime;

    private Flight[] flights;
    private int seat = 1;

    public Airplane(int flightNumber, String startingCity, String destinationCity, String departureTime, String arrivalTime, int seats) {
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

        flights = new Flight[seats];
    }

    public void reserveUnitedTicket(String name, char flightClass, String departureDate) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                System.out.println("All seats have been reserved");
                return;
            }
        }
        flights[seat] = new Flight(name, flightClass, this.startingCity, this.destinationCity, this.flightNumber, departureDate, this.departureTime, this.arrivalTime, seat);
        seat++;
    }
    
    public void print() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                System.out.println("Name: " + flights[i].getName() +
                        "\nDate: " + flights[i].getDepartureDate() +
                        "\n$" + flights[i].getPrice());
            }
        }
    }
}
