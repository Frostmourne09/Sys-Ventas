module com.sysventas {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires jakarta.validation;
    requires org.hibernate.validator;

    uses jakarta.validation.spi.ValidationProvider;

    opens com.sysventas to javafx.fxml;
    opens com.sysventas.controller to javafx.fxml;
    opens com.sysventas.model to org.hibernate.validator;

    exports com.sysventas;
    exports com.sysventas.model;
    exports com.sysventas.enums;
    exports com.sysventas.controller;
}
