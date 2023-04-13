module com.dat.javawardsvn {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.dat to javafx.fxml;
    exports com.dat;
    opens com.dat.controls to javafx.fxml;
    exports com.dat.controls;
}