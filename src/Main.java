import java.util.Scanner;

/**
 * James Adams, Davian Glenn
 * November 25, 2018
 * Project 3
 * Main.java
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Thank you for choosing United Airlines!\nWe currently have 2 flights form Greensboro to Newark(Flight 310) and 2 flight from Newark to Greensboro(Flight 320).");

        Airplane flight310_1 = new Airplane(310, "Greensboro", "Newark", "December 6", "7:00 AM", 20);
        Airplane flight310_2 = new Airplane(310, "Greensboro", "Newark", "December 6", "2:00 PM", 20);
        Airplane flight320_1 = new Airplane(320, "Newark", "Greensboro", "December 6", "7:00 AM", 20);
        Airplane flight320_2 = new Airplane(320, "Newark", "Greensboro", "December 6", "2:00 PM", 20);

        boolean run = true;
        while (run) {
            // inputs info of the flight, class, name, and date to reserve ticket
            System.out.print("If you would like flight 310, enter '310' or flight 320, enter '320': ");
            int flightNumber = in.nextInt();
            System.out.print("Enter the class you desire. Type 'E' for Economic, 'B' for Business, and 'F' for First-Class: ");
            char flightClass = in.next().charAt(0);
            System.out.print("Input information for ticket.\nInput passenger name and departure Time(Format: 0:00 AM/PM): ");
            String name = in.next();
            String time = in.next();

            // determine which flight the ticket belongs to
            if (flightNumber == 310 && time.equalsIgnoreCase("7:00 AM")) {
                try{
                    flight310_1.purchaseTicket(name, flightClass);
                }catch(allTicketSold ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (flightNumber == 310 && time.equalsIgnoreCase("2:00 PM")) {
                try {
                    flight310_2.purchaseTicket(name, flightClass);
                } catch (allTicketSold ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (flightNumber == 320 && time.equalsIgnoreCase("7:00 AM")) {
                try {
                    flight320_1.purchaseTicket(name, flightClass);
                } catch (allTicketSold ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (flightNumber == 320 && time.equalsIgnoreCase("2:00 PM")){
                try{
                    flight320_2.purchaseTicket(name, flightClass);
                }catch(allTicketSold ex) {
                    System.out.println(ex.getMessage());
                }
            }

            // continue adding a new ticket
            System.out.print("If you would like to get another ticket, please enter y / n: ");
            if (in.next().equalsIgnoreCase("n")) {
                run = false;
            }
        }

        // print all the tickets in both flights
        System.out.println("The tickets for flight 310 #1: ");
        flight310_1.print();
        System.out.println("\n\nThe tickets for flight 310 #2: ");
        flight310_2.print();
        System.out.println("\n\nThe tickets for flight 320 #1: ");
        flight320_1.print();
        System.out.println("\n\nThe tickets for flight 320 #2: ");
        flight320_2.print();
    }
}
