package fr.amu.iut.exercice1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();

        Menu file = new Menu("file");
        Menu Options = new Menu("Options");
        Menu help = new Menu("Help");

        MenuBar barre = new MenuBar(file, Options, help);

        MenuItem New = new MenuItem("New");
        MenuItem Open = new MenuItem("Open");
        MenuItem Save = new MenuItem("Save");
        MenuItem Close = new MenuItem("Close");

        MenuItem Cut = new MenuItem("Cut");
        MenuItem Copy = new MenuItem("Copy");
        MenuItem Paste = new MenuItem("Paste");

        file.getItems().add(New);
        file.getItems().add(Open);
        file.getItems().add(Save);
        file.getItems().add(Close);

        Options.getItems().add(Cut);
        Options.getItems().add(Copy);
        Options.getItems().add(Paste);


        Label buttonL = new Label("Boutons : ");

        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 2");
        Button b3 = new Button("Bouton 3");

        VBox bouton = new VBox(buttonL,b1,b2,b3);

        Separator separatorBasPage = new Separator(Orientation.HORIZONTAL);
        Label basPage = new Label("Ceci est un label de bas de page");
        basPage.setAlignment(Pos.CENTER);

        Separator separator = new Separator(Orientation.VERTICAL);

        bouton.setMargin(b1,new Insets(5.0d));
        bouton.setMargin(b2,new Insets(5.0d));
        bouton.setMargin(b3,new Insets(5.0d));

        GridPane tableauConnexion = new GridPane();
        tableauConnexion.add(new Label("Name:"),0,0);
        tableauConnexion.add(new Label("Email:"),0,1);
        tableauConnexion.add(new Label("Password:"),0,2);

        tableauConnexion.add(new TextField(),1,0);
        tableauConnexion.add(new TextField(),1,1);
        tableauConnexion.add(new TextField(),1,2);
        Button Submit = new Button("Submit");
        Button Cancel = new Button("Cancel");

        HBox BoutonForm = new HBox(Submit, Cancel);

        BoutonForm.setMargin(Submit,new Insets(5.0d));
        BoutonForm.setMargin(Cancel,new Insets(5.0d));

        root.setCenter(tableauConnexion);

        VBox Formulaire = new VBox(tableauConnexion, BoutonForm);
        Formulaire.setAlignment(Pos.CENTER);

        HBox principal = new HBox(bouton,separator,Formulaire);



        VBox vBox = new VBox(barre, principal, separatorBasPage,basPage);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setWidth(700);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}