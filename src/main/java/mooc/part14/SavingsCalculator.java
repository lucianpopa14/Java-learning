package mooc.part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainPane = new BorderPane();

        // Create and configure the line chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings and Interest Over Time");

        mainPane.setCenter(lineChart);

        // Create the VBox and the two BorderPanes for the sliders
        VBox topVBox = new VBox();

        BorderPane savingsPane = new BorderPane();
        Label savingsLabel = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setMajorTickUnit(25);
        savingsSlider.setMinorTickCount(3);
        Label savingsValue = new Label(Double.toString(savingsSlider.getValue()));

        BorderPane interestPane = new BorderPane();
        Label interestLabel = new Label("Yearly interest rate");
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setMinorTickCount(10);
        Label interestValue = new Label(Double.toString(interestSlider.getValue()));

        savingsPane.setLeft(savingsLabel);
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsValue);

        interestPane.setLeft(interestLabel);
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestValue);

        topVBox.getChildren().addAll(savingsPane, interestPane);
        mainPane.setTop(topVBox);

        // Create data series and add them to the line chart
        XYChart.Series<Number, Number> savingsSeries = new XYChart.Series<>();
        savingsSeries.setName("Monthly Savings Only");

        XYChart.Series<Number, Number> interestSeries = new XYChart.Series<>();
        interestSeries.setName("Savings with Interest");

        lineChart.getData().addAll(savingsSeries, interestSeries);

        // Add listeners to update the line chart based on the sliders' values
        savingsSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            savingsValue.setText(String.format("%.2f", newVal));
            updateChart(savingsSeries, interestSeries, savingsSlider, interestSlider);
        });

        interestSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            interestValue.setText(String.format("%.2f", newVal));
            updateChart(savingsSeries, interestSeries, savingsSlider, interestSlider);
        });

        // Initialize the chart with default values
        updateChart(savingsSeries, interestSeries, savingsSlider, interestSlider);

        Scene scene = new Scene(mainPane, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Savings Calculator");
        stage.show();
    }

    private void updateChart(XYChart.Series<Number, Number> savingsSeries, XYChart.Series<Number, Number> interestSeries, Slider savingsSlider, Slider interestSlider) {
        double monthlySavings = savingsSlider.getValue();
        double yearlyInterestRate = interestSlider.getValue() / 100.0;

        savingsSeries.getData().clear();
        interestSeries.getData().clear();

        double totalSavings = 0;
        double totalSavingsWithInterest = 0;

        for (int year = 0; year <= 30; year++) {
            totalSavings += monthlySavings * 12;
            totalSavingsWithInterest = (totalSavingsWithInterest + monthlySavings * 12) * (1 + yearlyInterestRate);

            savingsSeries.getData().add(new XYChart.Data<>(year, totalSavings));
            interestSeries.getData().add(new XYChart.Data<>(year, totalSavingsWithInterest));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
