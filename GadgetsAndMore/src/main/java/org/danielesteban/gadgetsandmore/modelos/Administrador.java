package org.danielesteban.gadgetsandmore.modelos;

public class Administrador extends Usuario {

    public void gestionarProducto(Producto producto) {
        System.out.println("Gestionando producto: " + producto.getNombre());
        // Lógica para crear, actualizar o eliminar un producto
    }

    public void gestionarCategoria(Categoria categoria) {
        System.out.println("Gestionando categoría: " + categoria.getNombre());
    }

    public void actualizarEstadoPedido(Pedido pedido, String nuevoEstado) {
        System.out.println("Actualizando pedido " + pedido.getIdPedido() + " a estado: " + nuevoEstado);
        pedido.setEstado(nuevoEstado);
    }
}
