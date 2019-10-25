package com.jdojo.intro;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set a title for the stage
        primaryStage.setTitle("Hello JavaFX Application");

        // Show the stage
        primaryStage.show();
    }
}
