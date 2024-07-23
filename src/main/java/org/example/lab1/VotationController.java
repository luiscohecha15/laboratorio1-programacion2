package org.example.lab1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class VotationController{
    public static int candidato1=0;
    public static int candidato2=0;
    private HomeController homeController;
    private Stage stageInicio;
    private Label comeBackBtn;

    public void BtnVotar1OnAction(ActionEvent event){

        candidato1 +=1;
        
        System.out.println("Candidato 1: "+candidato1);
        //Stage stageActual = (Stage) comeBackBtn.getScene().getWindow();
        //stageActual.close();

    }

    public void BtnVotar2OnAction(ActionEvent event){

        candidato2 +=1;

        System.out.println("Candidato 2: "+candidato2);
        //Stage stageActual = (Stage) comeBackBtn.getScene().getWindow();
        //stageActual.close();
    }

    protected void comeBackBtnOnAction(){
        if (stageInicio != null) {
            stageInicio.show();
        }

        Stage stageActual = (Stage) comeBackBtn.getScene().getWindow();
        stageActual.close();
    }


}
