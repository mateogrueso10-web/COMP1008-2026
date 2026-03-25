package Lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
 
        // Step 2: Create Buttons for operations
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
 
        // Step 3: Create Label for result
        Label resultLabel = new Label("Result will be shown here");
        // Step 4: HBox for buttons
        HBox buttonBox = new HBox(10, addButton, subtractButton, multiplyButton, divideButton);
        // Step 5: VBox main layout
        VBox mainLayout = new VBox(10, num1Field, num2Field, buttonBox, resultLabel);
        // Step 6: Event handling for buttons
        addButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter numbers.");
            }
        });
        subtractButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter numbers.");
            }
        });
        multiplyButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (num1 * num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter numbers.");
            }
        });
        divideButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                if (num2 == 0) {
                    resultLabel.setText("Error: Division by zero is not allowed.");
                } else {
                    resultLabel.setText("Result: " + (num1 / num2));
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter numbers.");
            }
        });
        // Step 7: Create scene and show stage
        Scene scene = new Scene(mainLayout, 300, 200);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
 