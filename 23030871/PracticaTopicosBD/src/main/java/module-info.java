module com.example.practicatopicosbd {

    requires java.sql;


    opens com.example.practicatopicosbd to javafx.fxml;
    exports com.example.practicatopicosbd;
}