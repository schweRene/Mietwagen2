package com.example.mietwagen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.image.ImageView.*;

public class Hauptmenue {

    @FXML
    private ImageView logo;

    @FXML
    private Button exit;

    @FXML
    private Button hinzufuegen;
    @FXML
    private Button loeschen;
    @FXML
    private Button suchen;

    @FXML
    private Button uebersicht;

    @FXML
    void add(MouseEvent event) throws IOException {
        Stage stage = (Stage) hinzufuegen.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fahrzeugHinzufuegen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mietwagen");
        stage.setScene(scene);
    }

    @FXML
    void exit(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void search(MouseEvent event) throws IOException {
       Stage stage = (Stage) suchen.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fahrzeugSuchen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mietwagen");
        stage.setScene(scene);
    }

    @FXML
    void show(MouseEvent event) throws IOException {
        Stage stage = (Stage) uebersicht.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fahrzeuguebersicht.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mietwagen");
        stage.setScene(scene);
    }


}
