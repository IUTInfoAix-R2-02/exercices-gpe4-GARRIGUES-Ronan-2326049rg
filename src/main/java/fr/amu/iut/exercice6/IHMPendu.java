package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class IHMPendu extends Application {

    // Variable jeu
    private VBox jeu;
    private Dico mots;
    private String mot;
    private String motAAffiche;

    // Variable vie
    private int nbVie = 7;
    private Label nbVieText;

    EventHandler<MouseEvent> buttonClickA = actionEvent -> {
        ArrayList<Integer> pos = mots.getPositions('a', this.mot);
        if (pos.isEmpty()){
            --this.nbVie;
            this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
        }
        else{
            String nouveauMot;
            for (int i = 0; i < pos.size(); ++i){
                 for (int j = 0; j < pos.get(i); ++j){
                     
                 }
            }
        }
        System.out.println(this.motAAffiche);
    };

    EventHandler<MouseEvent> buttonClickB = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickC = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickD = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickE = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickF = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickG = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickH = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickI = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickJ = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickK = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickL = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickM = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickN = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickO = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickP = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickQ = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickR = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickS = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickT = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickU = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickV = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickW = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickX = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickY = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    EventHandler<MouseEvent> buttonClickZ = actionEvent -> {
        --this.nbVie;
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
    };

    public static String initMotAffiche(String mot){
        String resultat = "";
        for (int i = 0; i < mot.length(); ++i) {
            resultat += "*";
        }
        return resultat;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        // Creation page principal
        this.jeu = new VBox();
        this.jeu.setStyle("-fx-background-color: #ccfff6");
        this.mots = new Dico();
        this.mot = mots.getMot();
        this.motAAffiche = initMotAffiche(mot);

        // Création Image du jeu

        System.out.println("pendu"+nbVie+".png");

        Image image = new Image(IHMPendu.class.getResource("/exercice6/pendu"+nbVie+".png").toString());
        ImageView iv = new ImageView();
        iv.setImage(image);
        jeu.getChildren().add(iv);

        // Texte de vie
        this.nbVieText = new Label("Nombre de vie : " + this.nbVie);
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

        // gestion evenements
        a.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickA);
        b.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickB);
        c.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickC);
        d.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickD);
        e.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickE);
        f.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickF);
        g.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickG);
        h.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickH);
        i.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickI);
        j.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickJ);
        k.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickK);
        l.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickL);
        m.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickM);
        n.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickN);
        o.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickO);
        p.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickP);
        q.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickQ);
        r.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickR);
        s.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickS);
        t.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickT);
        u.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickU);
        v.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickV);
        w.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickW);
        x.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickX);
        y.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickY);
        z.addEventHandler(MouseEvent.MOUSE_CLICKED,buttonClickZ);

        // Creation Scene
        Scene scene = new Scene(jeu, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
