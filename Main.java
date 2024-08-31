package com.variables.variables01.melany;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.setProductoId(1L);
        producto1.setNombre("Arroz");
        producto1.setDescripcion("Arroz blanco");
        producto1.setPrecio(10.0);
        producto1.setCantidad(2);
        producto1.setEsImportado(false);

        Producto producto2 = new Producto();
        producto2.setProductoId(2L);
        producto2.setNombre("Frijoles Arabes");
        producto2.setDescripcion("Frijoles Arabes");
        producto2.setPrecio(20.0);
        producto2.setCantidad(3);
        producto2.setEsImportado(true);

        Producto producto3 = new Producto();
        producto3.setProductoId(3L);
        producto3.setNombre("Sombrilla Italiana");
        producto3.setDescripcion("Sombrilla Italiana");
        producto3.setPrecio(30.0);
        producto3.setCantidad(1);
        producto3.setEsImportado(true);

        Orden orden = new Orden();
        orden.agregarProducto(producto3);
        orden.agregarProducto(producto2);
        orden.setFecha("2021-08-01");
        orden.setStatus("En proceso de importación");

        Factura factura = Factura.crearFactura(1L, "2021-08-01", 0.0, "123456");

        Cliente cliente = new Cliente();
        cliente.setNombre("Melany");
        cliente.setApellido("Gomez");
        cliente.setCorreo("melany@gmail.com");
        cliente.setDireccion("Zona 1");
        cliente.setNit("123456");
        cliente.setFactura(factura);
        cliente.setOrden(orden);
        cliente.Facturar();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.setFecha("2021-08-01");
        orden2.setStatus("Entregada");
        orden2.setOrdenId(2L);

        Factura factura2 = Factura.crearFactura(2L, "2021-08-01", 0.0, "345345");
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Juan");
        cliente2.setApellido("Perez");
        cliente2.setCorreo("juan@gmail.com");
        cliente2.setDireccion("Zona 2");
        cliente2.setNit("345345");
        cliente2.setFactura(factura2);
        cliente2.setOrden(orden2);
        cliente2.Facturar();
    }
}
