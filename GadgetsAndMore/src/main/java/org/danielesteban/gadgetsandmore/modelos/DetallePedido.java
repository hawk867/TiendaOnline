package org.danielesteban.gadgetsandmore.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DetallePedido {
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public double calcularSubtotal() {
        return this.precioUnitario * this.cantidad;
    }
}
