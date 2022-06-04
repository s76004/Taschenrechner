package controller;

import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tr {
    StringBuilder str = new StringBuilder();

    @FXML 
    private TextField displaytf = new TextField();

    private void append(String input) {
        str.append(input);
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
        int result = 0;
        String[] s = str.toString().split("\\+");
        int[] i = new int[s.length];
        for (int j = 0; j < s.length; j++) {
            i[j] = Integer.parseInt(s[j]); 
            for (int value : i) {
                result += value;
            }
            str.setLength(0);
            str.append(result);
            display();
        }
    }
    @FXML
    public void display() {
        displaytf.setText(str.toString());
        Scene scene = displaytf.getScene();
        Stage stage = (Stage) displaytf.getScene().getWindow();
        stage.setScene(scene);
    }
}
