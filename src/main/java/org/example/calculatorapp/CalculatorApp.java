package org.example.calculatorapp;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class for the Calculator application.
 */
public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file (the view)
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Set the title of the application window
        primaryStage.setTitle("Calculator");

        // Create a scene with the loaded FXML and set its dimensions
        primaryStage.setScene(new Scene(root, 300, 400));

        // Show the application window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}