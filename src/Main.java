import java.util.Scanner;

/**
 * James Adams, Davian Glenn
 * November 7, 2018
 * Project 2
 * Main.java
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Thank you for choosing United Airlines!\nWe currently have 1 flight to Greensboro from Newark(Flight 310) and 1 flight from Newark to Greensboro(Flight 320).");

        Airplane flight310 = new Airplane(310, "Greensboro", "Newark", "8:00 AM", "9:30 AM", 180);
        Airplane flight320 = new Airplane(320, "Newark", "Greensboro", "1:59 PM", "3:29 PM", 150);

        boolean run = true;
        while (run) {
            // inputs info of the flight, class, name, and date to reserve ticket
            System.out.print("If you would like flight 310, enter '310' or flight 320, enter '320': ");
            int flightNumber = in.nextInt();
            System.out.print("Enter the class you desire. Type 'E' for Economic, 'B' for Business, and 'F' for First-Class: ");
            char flightClass = in.next().charAt(0);
            System.out.print("Input information for ticket.\nInput passenger name and departure date(Format: mm/dd/yyyy): ");
            String name = in.next();
            System.out.print("Input departure date(Format: mm/dd/yyyy): ");
            String date = in.next();

            // determine which flight the ticket belongs to
            if (flightNumber == 310) {
                flight310.reserveUnitedTicket(name, flightClass, date);
            } else {
                flight320.reserveUnitedTicket(name, flightClass, date);
            }

            // continue adding a new ticket
            System.out.print("If you would like to get another ticket, please enter y / n: ");
            if (in.next().equalsIgnoreCase("n")) {
                run = false;
            }
        }

        // print all the tickets in both flights
        System.out.println("The tickets for flight 310: ");
        flight310.print();
        System.out.println("\n\nThe tickets for flight 320: ");
        flight320.print();
    }
}
