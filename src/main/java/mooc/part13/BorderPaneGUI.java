package mooc.part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneGUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        layout.setRight(new Label("EAST"));
        layout.setBottom(new Label("SOUTH"));

        Scene view = new Scene(layout, 300,300);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneGUI.class);
    }
}
