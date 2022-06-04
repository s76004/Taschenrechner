package controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Tr {
    StringBuilder displayString = new StringBuilder();

    @FXML 
    private TextField displaytf = new TextField();

    private void append(String input) {
        displayString.append(input);
    }

    public void buttonOne() {
        append("1");
        display();
    }
    public void buttonTwo() {
        append("2");
        display();
    }
    public void buttonThree() {
        append("3");
        display();
    }
    public void buttonFour() {
        append("4");
        display();
    }
    public void buttonFive() {
        append("5");
        display();
    }
    public void buttonSix() {
        append("6");
        display();
    }
    public void buttonSeven() {
        append("7");
        display();
    }
    public void buttonEight() {
        append("8");
        display();
    }
    public void buttonNine() {
        append("9");
        display();
    }
    public void buttonZero() {
        append("0");
        display();
    }

    @FXML
    void addition() {
        append("+");
        display();
    }

    @FXML
    public void calculate() {
        // Integer to hold the calculation result
        int result = 0;

        // Splitting the String holding all of the operation into an array of Strings
        String[] split = displayString.toString().split("\\+");

        // Initializing a new Integer ArrayList to hold the numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Adding all numbers to the new ArrayList
        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
        // Adding all of the values
        for (int value : numbers) {
            result += value;
        }
        // Clear the StringBuilder
        displayString.setLength(0);
        // Initialize the StringBuilder with the current result and refresh the display
        displayString.append(result);
        display();
    }

    /**
     * Method to refresh the content displayed in the calculator.
     */
    @FXML
    public void display() {
        // Setting the current text of the displayString
        displaytf.setText(displayString.toString());

        // Retrieving the Scene and Stage objects from the field
        Scene scene = displaytf.getScene();
        Stage stage = (Stage) displaytf.getScene().getWindow();

        // Refreshing what is displayed towards the user
        stage.setScene(scene);
    }
}
