package org.danielesteban.gadgetsandmore.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Usuario {
    protected int idUsuario;
    protected String nombre;
    protected String email;
    protected String password;

    protected Usuario() {
    }

    public void iniciarSesion() {
        System.out.println("Iniciando sesión como " + nombre);
    }

    public void cerrarSesion() {
        System.out.println("Cerrando sesión...");
    }

    public void actualizarPerfil() {}
}
