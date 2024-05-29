package fr.amu.iut.exercice11;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label texteCouleur;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;

    private Label texteDuBas;

    private IntegerProperty nbFois = new SimpleIntegerProperty(0);
    private StringProperty couleurPanneau = new SimpleStringProperty("#000000");




    public void buttonClickHandlerGreen() {
        this.couleurPanneau.set("#17a817");
        ++this.nbVert;
        nbFois.set(nbFois.get() + 1);
        this.texteCouleur.setText("Vert choisi : " + this.nbVert);
    }

    public void buttonClickHandlerBlue() {
        this.couleurPanneau.set("#163bb6");
        ++this.nbBleu;
        nbFois.set(nbFois.get() + 1);
        this.texteCouleur.setText("Bleu choisi : " + this.nbBleu);
    }

    public void buttonClickHandlerRed() {
        this.couleurPanneau.set("#d71414");
        ++this.nbRouge;
        nbFois.set(nbFois.get() + 1);
        this.texteCouleur.setText("Rouge choisi : " + this.nbRouge);
    }

    private void createBindings() {
        BooleanProperty pasEncoreDeClic = new SimpleBooleanProperty(true);

        // Le texte du haut affiche "Aucun clic pour le moment" tant qu'aucun clic n'a été effectué
        texteDuHaut.textProperty().bind(
                Bindings.when(pasEncoreDeClic)
                        .then(Bindings.concat("Cliquez sur un bouton"))
                        .otherwise(Bindings.concat("Total des clics : ", nbFois.asString()))
        );

        // Le texte du bas s'affiche uniquement après le premier clic
        pasEncoreDeClic.bind(nbFois.isEqualTo(0));

        // Liaison du texte et de la couleur du label texteDuBas en fonction de la couleur choisie
        texteDuBas.textProperty().bind(
                Bindings.when(couleurPanneau.isEqualTo("#17a817"))
                        .then(Bindings.concat("Le Vert est une jolie couleur !"))
                        .otherwise(
                                Bindings.when(couleurPanneau.isEqualTo("#163bb6"))
                                        .then(Bindings.concat("Le Bleu est une jolie couleur !"))
                                        .otherwise(
                                                Bindings.when(couleurPanneau.isEqualTo("#d71414"))
                                                .then(Bindings.concat("Le Rouge est une jolie couleur !"))
                                                .otherwise(""))
                        )
        );

        // Liaison de la couleur du texte du bas avec la couleur choisie
        texteDuBas.styleProperty().bind(Bindings.concat("-fx-text-fill: ", couleurPanneau));
    }


    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();
        texteDuHaut.textProperty().bind(Bindings.concat("Total des clics : ", nbFois.asString()));
        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        panneau.styleProperty().bind(Bindings.concat("-fx-background-color: ", couleurPanneau));

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

        // Label pour afficher la couleur choisie
        texteCouleur = new Label();
        texteCouleur.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteCouleur, Pos.CENTER);

        // Gestion des événements
        vert.setOnAction(actionEvent -> buttonClickHandlerGreen());
        rouge.setOnAction(actionEvent -> buttonClickHandlerRed());
        bleu.setOnAction(actionEvent -> buttonClickHandlerBlue());

        createBindings();

        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);
        root.setBottom(bas);

        // Initialement, n'affiche rien pour la couleur
        root.setTop(texteDuHaut);
        root.setTop(texteCouleur);


        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
