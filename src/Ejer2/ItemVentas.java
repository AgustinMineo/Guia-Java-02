package Ejer2;

import java.util.UUID;

public class ItemVentas {
    private UUID id= UUID.randomUUID();
    private String nombre;
    private String descripción;
    private double precioUnitario;
    private int cantidad;

    public ItemVentas(String nombre, String descripción, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalItem(){return this.precioUnitario * this.cantidad;}

    @Override
    public String toString() {
        return "ItemVentas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripción='" + descripción + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                '}';
    }
}
