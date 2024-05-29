package fr.amu.iut.exercice11;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("Duplicates")
public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Label texteDuHaut;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;

    private Label texteDuBas;

    private IntegerProperty nbFois = new SimpleIntegerProperty(0);
    private StringProperty message = new SimpleStringProperty("Oh quelle jolie couleur");

   public void buttonClickHandlerGreen() {
        //top
        this.panneau.setStyle("-fx-background-color: #17a817");
        ++this.nbVert;
        nbFois.set(this.nbVert);
        this.texteDuHaut = new Label("Vert choisi : " + nbFois.get());
        HBox text = new HBox(texteDuHaut);
        text.setAlignment(Pos.CENTER);
        root.setTop(text);
    };

    public void buttonClickHandlerBlue() {
        //top
        this.panneau.setStyle("-fx-background-color: #163bb6");
        ++this.nbBleu;
        nbFois.set(this.nbBleu);
        this.texteDuHaut = new Label("Bleu choisi : " + this.nbBleu);
        HBox text = new HBox(texteDuHaut);
        text.setAlignment(Pos.CENTER);
        root.setTop(text);
    };

    public void buttonClickHandlerRed() {
        //top
        this.panneau.setStyle("-fx-background-color: #d71414");
        ++this.nbRouge;
        nbFois.set(this.nbRouge);
        this.texteDuHaut = new Label("Rouge choisi : " + this.nbRouge);
        HBox text = new HBox(texteDuHaut);
        text.setAlignment(Pos.CENTER);
        root.setTop(text);
    };


    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();

        texteDuHaut.textProperty().bind(Bindings.concat("Total des clics : ", nbFois.asString()));

        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        VBox bas = new VBox();
        boutons = new HBox(10);
        boutons.setAlignment(Pos.CENTER);
        boutons.setPadding(new Insets(10, 5, 10, 5));
        texteDuBas = new Label();
        bas.setAlignment(Pos.CENTER_RIGHT);
        bas.getChildren().addAll(boutons, texteDuBas);

        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");

        /* VOTRE CODE ICI */
        // gestion des evts

        this.vert.setOnAction(actionEvent -> buttonClickHandlerGreen());
        this.bleu.setOnAction(actionEvent -> buttonClickHandlerBlue());
        this.rouge.setOnAction(actionEvent -> buttonClickHandlerRed());

        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);
        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

