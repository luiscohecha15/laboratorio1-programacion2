package org.example.lab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Delayed;

public class HomeController {
    private Stage stage;
    @FXML
    private TextField TxtIngreso;

    @FXML
    protected void IngresoBtnClick(ActionEvent event) throws IOException {

        String user = TxtIngreso.getText();
        if ("est".equals(user)){
            try{
                URL resourceUr = getClass().getResource("/org/example/lab1/view/votation-view.fxml");
                System.out.println("Url "+resourceUr);
                if(resourceUr == null){
                    throw  new IOException("No se pudo encontrar FXML");
                }
                FXMLLoader fxmlLoader = new FXMLLoader(resourceUr);
                Pane root = fxmlLoader.load();

                Scene scene = new Scene(root);
                Stage stage = (Stage) TxtIngreso.getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("Datos incorrectos");
        }

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}