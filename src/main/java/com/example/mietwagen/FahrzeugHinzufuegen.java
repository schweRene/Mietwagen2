package com.example.mietwagen;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FahrzeugHinzufuegen implements Initializable {
    @FXML
    private TableView<User> tableView;

    //Tabellenspalten
    @FXML
    private TableColumn<User, Integer> baujahrColumn;
    @FXML
    private TableColumn<User, String> herstellerColumn;
    @FXML
    private TableColumn<User, Integer> idColumn;
    @FXML
    private TableColumn<User, Integer> kilometerColumn;
    @FXML
    private TableColumn<User, String> kraftstoffColumn;
    @FXML
    private TableColumn<User, Double> preisColumn;


    @FXML
    private Button hauptmenue;

    @FXML
    private Button hinzufuegen;

    @FXML
    private Button loeschen;


    //Eingabefelder

    @FXML
    private TextField herstellerInput;

    @FXML
    private TextField baujahrInput;

    @FXML
    private TextField idInput;

    @FXML
    private TextField kilometerInput;

    @FXML
    private TextField kraftstoffInput;
    @FXML
    private TextField preisInput;

    //neue Daten hinzufügen
    @FXML
    void add(ActionEvent event) {
        User user = new User(
                Integer.parseInt(baujahrInput.getText()),
                Double.parseDouble(preisInput.getText()),
                herstellerInput.getText(),
                kraftstoffInput.getText(),
                Integer.parseInt(idInput.getText()),
                Integer.parseInt(kilometerInput.getText()));
        ObservableList<User> users = tableView.getItems();
        users.add(user);
        tableView.setItems(users);

    }

    @FXML
    void back(MouseEvent event) throws IOException {
        Stage stage = (Stage) hauptmenue.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hauptmenue.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mietwagen");
        stage.setScene(scene);
    }

    ObservableList<User> list = FXCollections.observableArrayList(
            new User(1980, 20000.0, "Opel", "Gas", 1, 23549),
            new User(2009, 39900.0, "Peugeot", "Diesel", 2, 19099),
            new User(2019, 399900.0, "Lada", "Super", 3, 1555),
            new User(2021, 639900.0, "Ferrari", "Elektro", 4, 2548),
            new User(2019, 25900.0, "Mazda", "Diesel", 5, 1999),
            new User(2018, 15400.0, "Citroen", "Gas", 6, 13599),
            new User(2019, 5648.0, "Daihatsu", "Super", 7, 3564),
            new User(2015, 26500.0, "VW", "Diesel", 8, 9874),
            new User(2009, 20000.0, "Wartburg", "Gas", 9, 3214),
            new User(2014, 35698.0, "Manta", "Super", 10, 102458),
            new User(2011, 2154.0, "Kawasaki", "Gas", 11, 457895),
            new User(2021, 102356.0, "Maserati", "Elektro", 12, 54789),
            new User(2016, 78458.0, "Mazda", "Super", 13, 14785),
            new User(2010, 78457.0, "Mercedes", "Gas", 14, 4565),
            new User(2012, 89562.0, "Audi", "Elektro", 15, 10000),
            new User(2007, 3520.0, "Dacia", "Diesel", 16, 2141)
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
        baujahrColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("baujahr"));
        herstellerColumn.setCellValueFactory(new PropertyValueFactory<User, String>("hersteller"));
        kilometerColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("kilometerstand"));
        kraftstoffColumn.setCellValueFactory(new PropertyValueFactory<User, String>("kraftstoffart"));
        preisColumn.setCellValueFactory(new PropertyValueFactory<User, Double>("preis"));

        tableView.setItems(list);
    }
    //Daten löschen
    @FXML
    void delete(ActionEvent event) {
        int selectID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectID);
    }

}
