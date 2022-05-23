package Ejer2;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    private UUID id = UUID.randomUUID();
    private String fecha ;
    private Cliente cliente;
    private ItemVentas []items;


    LocalDateTime newDate = LocalDateTime.now();
    DateTimeFormatter datoFresh= DateTimeFormatter.ofPattern("dd-mm-yyyy - hh-mm-ss");
    String horayfecha = datoFresh.format(newDate);

    public Factura(Cliente cliente, ItemVentas[] items) {
        this.cliente = cliente;
        this.items = items;
    }

    public UUID getId() {
        return id;
    }

    public ItemVentas[] getItems() {
        return items;
    }

    public void setItems(ItemVentas[] items) {
        this.items = items;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMontoTotal() {

        double totalF =0.0;
        ItemVentas[] venta = this.items;

        for(int i=0; i<venta.length; i++){
            ItemVentas itemVentas =venta[i];
            if(itemVentas!=null){
                totalF+=itemVentas.getTotalItem();
            }
        }

        return totalF - totalF * (this.cliente.getDescuento()/100.0);
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = horayfecha;
    }

    public DateTimeFormatter getDatoFresh() {
        return datoFresh;
    }

    public void setDatoFresh(DateTimeFormatter datoFresh) {
        this.datoFresh = datoFresh;
    }

    public String getHorayfecha() {
        return horayfecha;
    }

    public void setHorayfecha(String horayfecha) {
        this.horayfecha = horayfecha;
    }

    public LocalDateTime getNewDate() {
        return newDate;
    }

    public void setNewDate(LocalDateTime newDate) {
        this.newDate = newDate;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "\n id :" + this.id + '\'' +
                "\n fecha : " + this.horayfecha
                +"\n montoTotal :" + this.getMontoTotal() +
                "\n Cliente " + this.cliente;
    }
}
