package newGuI;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import sample.Controller;
import sample.Main;

import static javafx.geometry.Pos.CENTER;

/**
 * Created by lytte on 7/7/2016.
 */

public class GeneratedGUI {
    private int numTotal = sample.Controller.numTotal;
//    Stage shownWindow = Main.getShownWindow();
//    Scene scene;
    public GeneratedGUI(int []numArray) {
        TextArea text = new TextArea();
        for(int j = 0; j < numArray.length; ++j) {
            for (int i = 0; i < numArray.length; ++i) {
                if (numArray[j] > numArray[i]) {
                    int interchangej = numArray[j];
                    int interchangei = numArray[i];
                    numArray[j] = interchangei;
                    numArray[i] = interchangej;
                    //interchanges the values of the array
                }
            }
        }
        String sorted = "";
        for( int eachValue: numArray) {
            sorted += eachValue + " " + "\n";
        }
text.setText(sorted);
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        GridPane gridshow = new GridPane();
        gridshow.setAlignment(CENTER);
        gridshow.setHgap(10);
        gridshow.setVgap(8);
        gridshow.add(text, 0 , 0);
        Main.getPrimaryStage().setScene(new Scene(gridshow, bounds.getWidth(), bounds.getHeight()));

        //below change the scene and create logic/the generated GUI.
        //also pull numTotal with a "getnumTotal" method
    }


}
