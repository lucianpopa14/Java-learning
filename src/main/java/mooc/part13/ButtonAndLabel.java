package mooc.part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabel extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("This is a button");
        Label label = new Label("Label of the button");
        TextField txt = new TextField();

        FlowPane layout = new FlowPane();
        layout.getChildren().add(label);
        layout.getChildren().add(button);
        layout.getChildren().add(txt);

        Scene view = new Scene(layout,300,300);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabel.class);
    }
}
