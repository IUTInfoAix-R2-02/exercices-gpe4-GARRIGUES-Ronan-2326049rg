package fr.amu.iut.exercice4;

import javafx.application.Application;
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
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    EventHandler<MouseEvent> buttonClickHandlerGreen = actionEvent -> {
        //top
        this.panneau.setStyle("-fx-background-color: #17a817");
        ++this.nbVert;
        this.label = new Label("Vert choisi : " + this.nbVert);
        HBox text = new HBox(label);
        text.setAlignment(Pos.CENTER);
        root.setTop(text);
    };

    EventHandler<MouseEvent> buttonClickHandlerBleu = actionEvent -> {
        //top
        this.panneau.setStyle("-fx-background-color: #163bb6");
        ++this.nbBleu;
        this.label = new Label("Bleu choisi : " + this.nbBleu);
        HBox text = new HBox(label);
        text.setAlignment(Pos.CENTER);
        root.setTop(text);
    };

    EventHandler<MouseEvent> buttonClickHandlerRed = actionEvent -> {
        //top
        this.panneau.setStyle("-fx-background-color: #d71414");
        ++this.nbRouge;
        this.label = new Label("Rouge choisi : " + this.nbRouge);
        HBox text = new HBox(label);
        text.setAlignment(Pos.CENTER);
        root.setTop(text);
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = new BorderPane();

        //bottom
        this.bas = new HBox();
        bas.setSpacing(10.0d);
        bas.setPadding(new Insets(10.0d,10.0d,10.0d,10.0d));
        bas.setAlignment(Pos.CENTER);
        this.vert = new Button("Vert");
        this.rouge = new Button("Rouge");
        this.bleu = new Button("Bleu");
        bas.getChildren().addAll(vert,bleu,rouge);
        root.setBottom(bas);

        // center
        this.panneau = new Pane();
        root.setCenter(this.panneau);

        // gestion des evts
        this.vert.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickHandlerGreen);
        this.bleu.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickHandlerBleu);
        this.rouge.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickHandlerRed);




        Scene scene = new Scene(root, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

