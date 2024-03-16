module by.ploik0.pianotrainer {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens by.ploik0.pianotrainer to javafx.fxml;
    exports by.ploik0.pianotrainer;
}