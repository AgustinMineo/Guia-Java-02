package Ejer3;

import java.util.Arrays;
import java.util.UUID;

public class Cuenta {
    private static final int CONTADOR_OP=10; // Variable global
    private UUID  id = UUID.randomUUID();
    private Cliente3 cliente;
    private double balance;
    private String arregloDepoReti[]= new String[CONTADOR_OP];
    private int contador=0;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Cuenta(Cliente3 cliente, double balance) {
        this.cliente = cliente;
        this.balance = balance;
    }

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public Cliente3 getCliente() {return cliente;}

    public void setCliente(Cliente3 cliente) {this.cliente = cliente;}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public void deposito(double deposito){
        depositoExitoso(deposito);
        this.balance+=deposito;
    }

    public void extraer(double retiro){
        if(this.balance-retiro >=-2000){
            this.balance-=retiro;
            retiroExitoso(retiro);
    }else{
            System.out.println("Saldo insuficiente para retirar");
        }
    }
    private void depositoExitoso(double deposito){
        if(contador<=CONTADOR_OP){
            this.arregloDepoReti[contador] = "El cliente " + cliente.getNombre() + "," + " deposito " + deposito + "\n";
            contador++;
        }else{
            contador=0;
        }
    }
    private void retiroExitoso(double retiro){
        if(contador<=CONTADOR_OP){
            this.arregloDepoReti[contador] = "El cliente " + cliente.getNombre() + "," + " retiro " + retiro + "\n" ;
            contador++;
        }else{
            contador=0;
        }
    }

    @Override
    public String toString() {
        return "id : " + id + " cliente : " + cliente + "\n" + " balance :" + balance + "\n" +
                " arregloDepoReti : " + "\n" + Arrays.toString(arregloDepoReti) ;
    }
}
