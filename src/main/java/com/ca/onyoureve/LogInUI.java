package com.ca.onyoureve;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LogInUI extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(UserInterface.class.getResource("Welcome.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("OnYourEve");
        Image image = new Image("file:src/main/resources/com/ca/onyoureve/images/logo.jpeg");
        primaryStage.getIcons().add(image);
      //  primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();





    }
}
