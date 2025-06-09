package org.danielesteban.gadgetsandmore.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}
