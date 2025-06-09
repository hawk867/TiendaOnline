package org.danielesteban.gadgetsandmore.modelos;

import java.util.List;

public class Cliente extends Usuario {
    private String direccionEnvio;
    private List<Pedido> historialPedidos;

    public void verHistorialPedidos() {
        System.out.println("Historial de pedidos para " + getNombre() + ":");
        for (Pedido pedido : historialPedidos) {
            System.out.println("- Pedido ID: " + pedido.getIdPedido() + ", Estado: " + pedido.getEstado());
        }
    }

    public void agregarPedidoAlHistorial(Pedido pedido) {
        this.historialPedidos.add(pedido);
    }
}
