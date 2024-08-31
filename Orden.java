package com.variables.variables01.melany;

import java.util.ArrayList;
import java.util.List;

public class Orden implements IOrden {
    private Long OrdenId;
    private String fecha;
    private String status;

    private List<Producto> productos;

    @Override
    public void agregarProducto(Producto producto) {
        if (productos == null) {
            productos = new ArrayList<>();
            System.out.println();
            System.out.println("Creando orden...");
        }
        productos.add(producto);
        System.out.println("Producto agregado a la orden.");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Es importada: " + producto.getEsImportado());
        System.out.println();
    }

    public Long getOrdenId() {
        return OrdenId;
    }

    public void setOrdenId(Long ordenId) {
        OrdenId = ordenId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
