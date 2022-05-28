package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("tf.fxml"));
            //GridPane root = new GridPane();
            Scene scene = new Scene(root,500,500);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Taschenrechner");
            TextField tf = new TextField("");

            HBox hb = new HBox();
            hb.getChildren().add(tf);
            //root.addRow(0, hb);


            for(int i = 1; i<10; i++) {
                String buttonname = String.valueOf(i);
                Button button = new Button (buttonname);
                double wh = 100.0;
                button.setMaxWidth(wh);
                button.setMaxHeight(wh);
                button.setMinWidth(wh);
                button.setMinHeight(wh);
                int col = (i-1) % 3;
                int row = 4 - ((i-1) / 3);
                //root.add(button, col, row);
            }
            Button plus = new Button("+");
            Button minus = new Button("-");
            Button mal = new Button("*");
            Button geteilt = new Button("/");
            Button gleich = new Button("=");
            double wh = 100.0;
            plus.setMaxWidth(wh);
            plus.setMaxHeight(wh);
            plus.setMinWidth(wh);
            plus.setMinHeight(wh);

            minus.setMaxWidth(wh);
            minus.setMaxHeight(wh);
            minus.setMinWidth(wh);
            minus.setMinHeight(wh);

            minus.setMaxWidth(wh);
            minus.setMaxHeight(wh);
            minus.setMinWidth(wh);
            minus.setMinHeight(wh);

            mal.setMaxWidth(wh);
            mal.setMaxHeight(wh);
            mal.setMinWidth(wh);
            mal.setMinHeight(wh);

            geteilt.setMaxWidth(wh);
            geteilt.setMaxHeight(wh);
            geteilt.setMinWidth(wh);
            geteilt.setMinHeight(wh);

            gleich.setMaxWidth(wh);
            gleich.setMaxHeight(wh);
            gleich.setMinWidth(wh);
            gleich.setMinHeight(wh);
/*
            root.add(plus, 4, 2);
            root.add(minus, 4, 3);
            root.add(mal, 4, 4);
            root.add(geteilt, 4, 5);
            root.add(gleich, 4, 6);
*/
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
