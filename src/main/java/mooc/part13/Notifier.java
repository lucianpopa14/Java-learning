package mooc.part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox box = new VBox();
        box.setSpacing(5);
        Label label = new Label();
        TextField textField = new TextField();
        Button updateButton = new Button("Update");

        updateButton.setOnAction((actionEvent) -> {
            label.setText(textField.getText());
        });

        box.getChildren().addAll(textField,updateButton,label);

        Scene scene = new Scene(box, 200, 200);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(Notifier.class);
    }
}
