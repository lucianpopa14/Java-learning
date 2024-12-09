package mooc.part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //first screen
        BorderPane firstViewLayout = new BorderPane();
        Label firstViewLabel = new Label("First view!");
        Button toSecondViewButton = new Button("To the second view!");
        firstViewLayout.setTop(firstViewLabel);
        firstViewLayout.setCenter(toSecondViewButton);
        Scene firstView = new Scene(firstViewLayout, 300, 200);

        //second screen
        VBox secondViewLayout = new VBox();
        Button toThirdViewButton = new Button("To the third view!");
        Label secondViewLabel = new Label("Second view!");
        secondViewLayout.getChildren().addAll(toThirdViewButton, secondViewLabel);
        Scene secondView = new Scene(secondViewLayout, 300, 200);

        //third screen
        GridPane thirdViewLayout = new GridPane();
        Label thirdViewLabel = new Label("Third view!");
        Button toFirstViewButton = new Button("To the first view!");
        thirdViewLayout.add(thirdViewLabel, 0, 0);
        thirdViewLayout.add(toFirstViewButton, 1, 1);
        Scene thirdView = new Scene(thirdViewLayout, 300, 200);

        toSecondViewButton.setOnAction(e -> stage.setScene(secondView));
        toThirdViewButton.setOnAction(e ->stage.setScene(thirdView));
        toFirstViewButton.setOnAction(e->stage.setScene(firstView));

        stage.setScene(firstView);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
