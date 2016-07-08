package newGuI;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Screen;
import newGuI.GeneratedGUI;
import sample.Main;
import static javafx.geometry.Pos.CENTER;

/**
 * Created by lytte on 7/7/2016.
 */
public class GeneratedFields {
    public GeneratedFields(int totalNum) {
        Button pull = new Button("get order");
        Label explain = new Label("input the numbers below");
        explain.setStyle("-fx-background-color: aqua");
        int[] numArray = new int[totalNum];
        TextField[] input = new TextField[totalNum];
        System.out.println(totalNum);
        pull.setOnAction(e -> {
            for(int i = 0; i < numArray.length; ++i) {
                numArray[i] = Integer.parseInt(input[i].getText());
            }
            GeneratedGUI generatedGUI = new GeneratedGUI(numArray);
        });


        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        GridPane gridshow = new GridPane();
        gridshow.setAlignment(CENTER);
        gridshow.setHgap(10);
        gridshow.setVgap(8);
        gridshow.add(explain, 0, 0);
        gridshow.add(pull, 0, 1+totalNum);
        for(int i = 0; i < totalNum; ++i) {
            input[i] = new TextField("Nyah?");
            gridshow.add(input[i], 0, i);
        }
        //
        Main.getPrimaryStage().setScene(new Scene(gridshow, bounds.getWidth(), bounds.getHeight()));

    }
}
