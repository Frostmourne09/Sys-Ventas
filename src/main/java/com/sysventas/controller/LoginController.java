package com.sysventas.controller;

import com.sysventas.model.Usuario;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Controlador de la vista de inicio de sesion.
 * Enlaza los campos definidos en login.fxml con la logica de autenticacion.
 */
public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtClave;

    @FXML
    private Label lblMensaje;

    @FXML
    private Button btnIngresar;

    @FXML
    private void initialize() {
        lblMensaje.setText("");
    }

    @FXML
    private void onIngresar() {
        String usuario = txtUsuario.getText() == null ? "" : txtUsuario.getText().trim();
        String clave = txtClave.getText() == null ? "" : txtClave.getText();

        if (usuario.isEmpty() || clave.isEmpty()) {
            lblMensaje.setText("Ingrese usuario y clave.");
            return;
        }

        Usuario autenticado = autenticar(usuario, clave);
        if (autenticado == null) {
            lblMensaje.setText("Usuario o clave incorrectos.");
            return;
        }

        lblMensaje.setText("Bienvenido, " + autenticado.getUsuario());
        // TODO: reemplazar por la navegacion real hacia el menu principal
        // y por la validacion contra el servicio/DAO de usuarios.
    }

    /**
     * Punto de integracion con la capa de datos/servicio de usuarios.
     * Por ahora no hay persistencia conectada, por lo que siempre retorna null.
     */
    private Usuario autenticar(String usuario, String clave) {
        return null;
    }
}
