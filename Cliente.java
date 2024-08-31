package com.variables.variables01.melany;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String nit;

    private Orden orden;
    private Factura factura;

    public void Facturar() {
        System.out.println("Cliente: " + this.nombre + " " + this.apellido);
        System.out.println("Correo: " + this.correo);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("NIT: " + this.nit);
        System.out.println();
        this.factura.calcularTotal(this.orden);
    }

    public Orden getOrden() {
        return orden;
    }
    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
