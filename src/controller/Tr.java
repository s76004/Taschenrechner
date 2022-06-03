package controller;

import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tr {

    @FXML 
    private TextField displaytf = new TextField();


    @FXML
    void addition(ActionEvent event) {
        append("+");
        display();}

    StringBuilder str = new StringBuilder();

    private void append(String input) {
        str.append(input);
    }

    public void buttonOne(ActionEvent event) {
        append("1");
        display();
    }
    public void buttonTwo(ActionEvent event) {
        append("2");
        display();
    }
    public void buttonThree(ActionEvent event) {
        append("3");
        display();
    }
    public void buttonFour(ActionEvent event) {
        append("4");
        display();
    }
    public void buttonFive(ActionEvent event) {
        append("5");
        display();
    }
    public void buttonSix(ActionEvent event) {
        append("6");
        display();
    }
    public void buttonSeven(ActionEvent event) {
        append("7");
        display();
    }
    public void buttonEight(ActionEvent event) {
        append("8");
        display();
    }
    public void buttonNine(ActionEvent event) {
        append("9");
        display();
    }
    public void buttonZero(ActionEvent event) {
        append("0");
        display();
    }

    @FXML
    public void display() {
        displaytf.setText(str.toString());
        Scene scene = displaytf.getScene();
        Stage stage = (Stage) displaytf.getScene().getWindow();
        stage.setScene(scene);
    }
    @FXML
    public void calculate() {
        int result = 0;
        String[] s = str.toString().split("\\+");
        int[] i = new int[s.length];
        for(int j = 0; j < s.length; j++) {
            i[j] = Integer.parseInt(s[j]); 
            for (int value : i) {
                result += value;
            }
            str.setLength(0);
            str.append(result);
            display();
        }
    }
}