import Ejer1.Autor;
import Ejer1.Libro;
import Ejer2.Cliente;
import Ejer2.Factura;
import Ejer2.ItemVentas;
import Ejer3.Cliente3;
import Ejer3.Cuenta;

public class Inicio {
    public static void main(String[] args) {
        /* <------------------------------------------- Ejer 1 ----------------------------------------------------*/

         Autor []arreglo = new Autor[2];

        Autor Autor = new Autor("Joshua","Bloch","joshua@email.com",'m');
        System.out.println(Autor.toString());
        Libro EffectiveJava = new Libro("Joshua Bloch",450,150,Autor);
        System.out.println(EffectiveJava.toString());
        EffectiveJava.setPrecio(500);
        EffectiveJava.sumarStock(50);
        System.out.println(EffectiveJava.toString());
        System.out.println("Autor desde EffectiveJava \n");
        System.out.println( EffectiveJava.getAutor() + "\n");
        System.out.println("Mensaje personalizado \n");
        System.out.println(EffectiveJava.showShortInfo());
        arreglo[0]=Autor;
        Autor Autor1 = new Autor("Pepe","Argento","pepeargento@mail.com",'m');
        arreglo[1]=Autor1;
        System.out.println("\n \n");
        System.out.println("Muestra de arreglo de objetos");
        for (Object autor: arreglo) {
            System.out.println(autor.toString());
        }
        /* <------------------------------------------- Ejer 1 ----------------------------------------------------*/

        /* <------------------------------------------- Ejer 2 ----------------------------------------------------*/
        ItemVentas []arregloVenta= new ItemVentas[3];
        Cliente cliente = new Cliente("Martin","martinpalermo@gmail.com",20);
        ItemVentas item = new ItemVentas("Pantalon","Un pantalon sensual",100,500);
        ItemVentas item1 = new ItemVentas("Zapatos","Un zapato sensual",50,200);
        ItemVentas item2 = new ItemVentas("Medias","Unas medias sensual",150,250);
        arregloVenta[0]=item;
        arregloVenta[1]=item1;
        arregloVenta[2]=item2;
        Factura factura1 = new Factura(cliente,arregloVenta);
        System.out.println(factura1.toString());
        System.out.println(arregloVenta[0].toString());
        System.out.println(arregloVenta[1].toString());
        System.out.println(arregloVenta[2].toString());
        /* <------------------------------------------- Ejer 2 ----------------------------------------------------*/
        System.out.println("\n \n \n");

        /* <------------------------------------------- Ejer 3 ----------------------------------------------------*/
        Cliente3 cliente3 = new Cliente3("Jose carlos",'M');
        System.out.println(cliente3.toString());
        Cuenta cuenta = new Cuenta(cliente3,10000);
        cuenta.deposito(1500);
        cuenta.deposito(1500);
        cuenta.deposito(1500);
        cuenta.deposito(1500);
        cuenta.deposito(1500);
        cuenta.extraer(150000);
        cuenta.extraer(1500);
        cuenta.extraer(1500);
        cuenta.extraer(1500);
        cuenta.extraer(1500);
        System.out.println(cuenta);
        /* <------------------------------------------- Ejer 3 ----------------------------------------------------*/

    }
}
