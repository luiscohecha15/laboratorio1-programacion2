package org.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeApplication.class.getResource("view/hello-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 300, 290);
        stage.setScene(scene);
        stage.setTitle("Votacion estudiantil");

        HomeController controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.show();

    }

    public static void main(String[] args) {

        launch();


    }
}