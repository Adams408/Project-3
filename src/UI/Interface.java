package UI;

import UnitedAirline.Airplane;
import UnitedAirline.allTicketSold;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Interface implements Initializable {

    public TextField txtName;
    public ChoiceBox<String> chbTime;
    public ChoiceBox<String> chbFlightNum;
    public ChoiceBox<String> chbClass;

    Airplane flight310_1 = new Airplane(310, "Greensboro", "Newark", "December 6", "7:00 AM", 20);
    Airplane flight310_2 = new Airplane(310, "Greensboro", "Newark", "December 6", "2:00 PM", 20);
    Airplane flight320_1 = new Airplane(320, "Newark", "Greensboro", "December 6", "7:00 AM", 20);
    Airplane flight320_2 = new Airplane(320, "Newark", "Greensboro", "December 6", "2:00 PM", 20);

    public Interface() {
        chbTime = new ChoiceBox<>();
        chbFlightNum = new ChoiceBox<>();
        chbClass = new ChoiceBox<>();

        chbTime.getItems().addAll("7:00 AM", "2:00 PM");
        chbFlightNum.getItems().addAll("310", "320");
        chbClass.getItems().addAll("Economic", "Business", "First-Class");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void purchaseTicket(ActionEvent actionEvent) {
        char c = ' ';
        switch(chbClass.getValue()){
            case "Economic":
                c = 'E';
                break;
            case "Business":
                c = 'B';
                break;
            case "First-Class":
                c = 'F';
                break;
        }

        if (chbFlightNum.getValue().equals("310") && chbTime.getValue().equals("7")) {
            try{
                flight310_1.purchaseTicket(txtName.getText(), c);
            }catch(allTicketSold ex) {
                System.out.println(ex.getMessage());
            }
        } else if (chbFlightNum.getValue().equals("310") && chbTime.getValue().equals("2")) {
            try {
                flight310_2.purchaseTicket(txtName.getText(), c);
            } catch (allTicketSold ex) {
                System.out.println(ex.getMessage());
            }
        } else if (chbFlightNum.getValue().equals("320") && chbTime.getValue().equals("7")) {
            try {
                flight320_1.purchaseTicket(txtName.getText(), c);
            } catch (allTicketSold ex) {
                System.out.println(ex.getMessage());
            }
        } else if (chbFlightNum.getValue().equals("320") && chbTime.getValue().equals("2")){
            try{
                flight320_2.purchaseTicket(txtName.getText(), c);
            }catch(allTicketSold ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
