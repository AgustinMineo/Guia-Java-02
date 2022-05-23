package Ejer3;

import java.util.UUID;

public class Cliente3 {
    private UUID id = UUID.randomUUID();
    private String nombre;
    private char genero;

    public Cliente3(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public char getGenero() {return genero;}

    public void setGenero(char genero) {this.genero = genero;}

    @Override
    public String toString() {
        return " Cliente " + " id :" + id + "\n" + " nombre : " + nombre + "\n" + " genero : " + genero;
    }
}
