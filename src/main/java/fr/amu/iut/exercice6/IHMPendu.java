package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IHMPendu extends Application {

    private int nbVie = 7;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        // Creation page principal
        VBox jeu = new VBox();
        jeu.setStyle("-fx-background-color: #ccfff6");

        // Création Image du jeu

        System.out.println("pendu"+nbVie+".png");

        Image image = new Image(IHMPendu.class.getResource("/exercice6/pendu"+nbVie+".png").toString());
        ImageView iv = new ImageView();
        iv.setImage(image);
        jeu.getChildren().add(iv);



        // Texte de vie
        Label nbVieText = new Label("Nombre de vie : " + this.nbVie);
        jeu.getChildren().add(nbVieText);

        // mot


        Button a = new Button("a");
        Button b = new Button("b");
        Button c = new Button("c");
        Button d = new Button("d");
        Button e = new Button("e");
        Button f = new Button("f");
        Button g = new Button("g");
        Button h = new Button("h");
        Button i = new Button("i");
        Button j = new Button("j");
        Button k = new Button("k");
        Button l = new Button("l");
        Button m = new Button("m");
        Button n = new Button("n");
        Button o = new Button("o");
        Button p = new Button("p");
        Button q = new Button("q");
        Button r = new Button("r");
        Button s = new Button("s");
        Button t = new Button("t");
        Button u = new Button("u");
        Button v = new Button("v");
        Button w = new Button("w");
        Button x = new Button("x");
        Button y = new Button("y");
        Button z = new Button("z");
        HBox lettres = new HBox(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z);
        jeu.getChildren().add(lettres);






        // Creation Scene
        Scene scene = new Scene(jeu, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
