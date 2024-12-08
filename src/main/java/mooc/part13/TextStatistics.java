package mooc.part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatistics extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        layout.setCenter(new TextArea("this is a text area"));

        HBox labelsBar = new HBox();
        labelsBar.setSpacing(10);
        layout.setBottom(labelsBar);
        labelsBar.getChildren().add(new Label("Letters: 0"));
        labelsBar.getChildren().add(new Label("Words: 0"));
        labelsBar.getChildren().add(new Label("The longest word is:"));

        Scene view = new Scene(layout, 500, 200);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsV2.class);
    }
}
