package org.danielesteban.gadgetsandmore.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria categoria;

    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }

    public boolean estaDisponible(int cantidadRequerida) {
        return this.stock >= cantidadRequerida;
    }
}
