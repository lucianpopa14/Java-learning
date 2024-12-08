package mooc.part13;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsV2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is:");

        textArea.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                int lettersCount = newValue.replaceAll("\\s+", "").length();
                int wordsCount = newValue.trim().isEmpty() ? 0 : newValue.trim().split("\\s+").length;

                String longestWord = "";
                for (String word : newValue.trim().split("\\s+")) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }

                lettersLabel.setText("Letters: " + lettersCount);
                wordsLabel.setText("Words: " + wordsCount);
                longestWordLabel.setText("The longest word is: " + longestWord);
            }
        });

        HBox labelsBar = new HBox();
        labelsBar.setSpacing(10);
        layout.setBottom(labelsBar);
        labelsBar.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);

        Scene view = new Scene(layout, 600, 300);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsV2.class);
    }
}
