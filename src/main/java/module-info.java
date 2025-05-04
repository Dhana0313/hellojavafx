module com.example.hellojavafx {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires java.desktop;
    //requires mysql.connector.java;

    opens com.example.hellojavafx;
}