package com.javaLecture.UIClass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DemoJavaFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

//        Button button = new Button("Click Me");

        Label label = new Label("Your name");
        label.setLayoutX(0);
        label.setLayoutY(0);

        Scene scene = new Scene(label, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Our First GUI Form In JavaFx");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
