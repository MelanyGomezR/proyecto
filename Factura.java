package com.variables.variables01.melany;

public class Factura implements IFactura {
    private Long facturaId;
    private String fecha;
    private Double total;
    private String nit;

    public static Factura crearFactura(Long facturaId, String fecha, Double total, String nit) {
        System.out.println("Creando factura...");
        Factura factura = new Factura();
        factura.setFacturaId(facturaId);
        factura.setFecha(fecha);
        factura.setTotal(0.0);
        factura.setNit(nit);
        System.out.println("Factura creada con éxito.");
        return factura;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public void calcularTotal(Orden orden) {
        Double total = 0.0;
        for (Producto producto : orden.getProductos()) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        this.total = total;
        System.out.println("El total de la factura es: " + total);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}
