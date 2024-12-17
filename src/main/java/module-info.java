module com.nathan.beroepsproductbp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nathan.beroepsproductbp2 to javafx.fxml;
    exports com.nathan.beroepsproductbp2;
}