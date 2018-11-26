package UnitedAirline;

/**
 * James Adams, Davian Glenn
 * November 25, 2018
 * Project 3
 * UnitedAirline.allTicketSold.java
 */

public class allTicketSold extends Exception {
    private String message  = "";

    public allTicketSold(){
        super();
    }

    /**
     * @param message error message
     */
    public allTicketSold(String message){
        super(message);
    }

    /**
     * @return the error message to be displayed
     */
    @Override
    public String getMessage() {
        return message;
    }
}
