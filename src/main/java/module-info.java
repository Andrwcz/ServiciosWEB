module org.example.serviciosweb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;


    opens org.example.serviciosweb to javafx.fxml;
    exports org.example.serviciosweb;
}