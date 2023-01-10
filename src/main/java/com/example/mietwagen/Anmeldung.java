package com.example.mietwagen;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Anmeldung{

    @FXML
    private Button account;

    @FXML
    private Button einloggen;

    @FXML
    private ImageView loading;

    @FXML
    private ImageView logo;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userField;

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void login(MouseEvent event) throws IOException {
        Stage stage = (Stage) einloggen.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hauptmenue.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mietwagen");
        stage.setScene(scene);
    }

}
