module tp.intro.javafx {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    opens fr.amu.iut.tp3 to javafx.fxml;
    exports fr.amu.iut.tp3;
}
