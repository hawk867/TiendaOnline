package org.danielesteban.gadgetsandmore.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Pedido {
    private int idPedido;
    private Date fecha;
    private String estado;
    private double total;
    private Cliente cliente;
    private List<DetallePedido> detalles;

    public void agregarDetalle(Producto producto, int cantidad) {
        this.detalles.add(new DetallePedido(producto, cantidad));
        recalcularTotal();
    }

    private void recalcularTotal() {
        this.total = 0.0;
        for (DetallePedido detalle : detalles) {
            this.total += detalle.calcularSubtotal();
        }
    }
}
