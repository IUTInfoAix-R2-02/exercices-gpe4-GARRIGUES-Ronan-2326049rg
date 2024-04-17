package fr.amu.iut.exercice5;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;

class Personnage extends Group {
    protected final static double LARGEUR_MOITIE_PERSONNAGE = 10;
    protected final static double LARGEUR_PERSONNAGE = LARGEUR_MOITIE_PERSONNAGE * 2;
    private final Circle corps;
    private String direction;



    public Personnage(String direction, Color couleurContour, Color couleurRemplissage) {
        this.direction = direction;
        corps = new Circle(10, 10, LARGEUR_MOITIE_PERSONNAGE, couleurContour);
        corps.setFill(couleurRemplissage);
        getChildren().add(corps);
    }

    public void deplacerAGauche() {
        //    ****
        //   *    *
        //  *---   *
        //   *    *
        //    ****

        //déplacement <----

        double lastX = getLayoutX();

        if (getLayoutX() >= LARGEUR_PERSONNAGE) {
            setLayoutX(getLayoutX() - LARGEUR_PERSONNAGE);

            if (collisionObstacle()){
                setLayoutX(lastX);
            }

        }
        if (!direction.equals("gauche")) {
            direction = "gauche";
        }
    }

    public void deplacerADroite(double largeurJeu) {
        //    ****
        //   *    *
        //  *   ---*
        //   *    *
        //    ****
        //déplacement ---->

        double lastX = getLayoutX();

        if (getLayoutX() < largeurJeu - 2*LARGEUR_PERSONNAGE) {
            setLayoutX(getLayoutX() + LARGEUR_PERSONNAGE);

            if (collisionObstacle()){
                setLayoutX(lastX);
            }

        }
        if (!direction.equals("droite")) {
            direction = "droite";
        }

    }

    public void deplacerEnBas(double hauteurJeu) {
        //    *****
        //   *     *
        //  *   |   *
        //   *  |  *
        //    *****

        double lastY = getLayoutY();

        if (getLayoutY() < hauteurJeu - 2*LARGEUR_PERSONNAGE) {
            setLayoutY(getLayoutY() + LARGEUR_PERSONNAGE);

            if (collisionObstacle()){
                setLayoutY(lastY);
            }

        }
        if (!direction.equals("Bas")) {
            direction = "Bas";
        }

    }

    public void deplacerEnHaut() {
        //    *****
        //   *  |  *
        //  *   |   *
        //   *     *
        //    *****
        double lastY = getLayoutY();

        if (getLayoutY() >= LARGEUR_PERSONNAGE) {
            setLayoutY(getLayoutY() - LARGEUR_PERSONNAGE);

            if (collisionObstacle()){
                setLayoutY(lastY);
            }

        }
        if (!direction.equals("Haut")) {
            direction = "Haut";
        }

    }

    boolean estEnCollision(Personnage autrePersonnage) {
        return getBoundsInParent().contains(autrePersonnage.getBoundsInParent())
                || autrePersonnage.getBoundsInParent().contains(getBoundsInParent());
    }


    boolean collisionObstacle(){
        for (int i = 0 ; i < JeuMain.getObstacles().size(); ++i){
            return getBoundsInParent().contains(JeuMain.getObstacles().get(i).getBoundsInParent())
                    || JeuMain.getObstacles().get(i).getBoundsInParent().contains(getBoundsInParent());
        }
        return false;
    }

}
