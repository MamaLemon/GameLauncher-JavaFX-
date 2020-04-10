package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField loginTextField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button SignInButton;

    @FXML
    private Button SignUpButton;

    @FXML
    void initialize(){
        SignUpButton.setOnAction(actionEvent -> {
            SignUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            //connect a SignUp window
            loader.setLocation(getClass().getResource("/sample/view/signUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent parent = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.showAndWait();
        });
        SignInButton.setOnAction(actionEvent -> {
            SignInButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            //connect a GameMenu window
            loader.setLocation(getClass().getResource("/sample/view/gameList.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent parent = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.showAndWait();
        });
    }
}
