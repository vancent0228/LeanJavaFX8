package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text msg=new Text("Hello JavaFX");
        VBox root = new VBox();
        root.getChildren().add(msg);

        Scene scene = new Scene(root, 300, 50);
        primaryStage.setScene(scene);

        // Set a title for the stage
        primaryStage.setTitle("Hello JavaFX Application");

        // Show the stage
        primaryStage.show();
    }
}
