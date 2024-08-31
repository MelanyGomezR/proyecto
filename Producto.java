package com.variables.variables01.melany;

public class Producto {
    private Long productoId;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;

    private Boolean esImportado;

    public Boolean getEsImportado() {
        return esImportado;
    }

    public void setEsImportado(Boolean esImportado) {
        this.esImportado = esImportado;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
