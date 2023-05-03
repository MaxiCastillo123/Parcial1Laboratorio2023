import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Silla silla1= new Silla(15,"Silla con rueditas", 35000,true);
        Silla silla2= new Silla(20,"Silla sin rueditas", 25000,false);

        Escritorio escritorio1 = new Escritorio(13,"Escritorio Negro", 45000,120,75);
        Escritorio escritorio2 = new Escritorio(13,"Escritorio Con cajones", 55000,120,75);

        Impresora impresora1 = new Impresora(20,"Hp1532",7500,"HP",800);
        Impresora impresora2 = new Impresora(25,"Epson 4568", 10000, "Epson",1200);

        Notebook notebook1= new Notebook(10, "Lenovo IdeaPad5",75000,"Lenovo",8);
        Notebook notebook2 = new Notebook(12, "Lenovo IdeaPad 4", 60000, "Lenovo", 4);

        Empresa delta = new Empresa();
        delta.agregarItemDeVenta(silla1);
        delta.agregarItemDeVenta(silla2);
        delta.agregarItemDeVenta(escritorio1);
        delta.agregarItemDeVenta(escritorio2);
        delta.agregarItemDeVenta(impresora1);
        delta.agregarItemDeVenta(impresora2);
        delta.agregarItemDeVenta(notebook1);
        delta.agregarItemDeVenta(notebook2);

        /**PUNTO 3 RECORREMOS LA LISTA SEGUN LOS TIPOS DE ARTICULOS.*/
        delta.recorrerArrayPorTipo();

        /**FUNCIONAMIENTO PUNTO 4*/
        System.out.println("La silla1 se encuentra con un descuento del 15%, su precio final es de: " + silla1.descuento(15));
        System.out.println("La Impresora2 se encuentra con un descuento del 30%, su precio final es de: " + impresora2.descuento(30));

        /**FUNCIONAMIENTO PUNTO 5*/
        Scanner leerChar= new Scanner(System.in);
        String opcion;
        do{
            delta.preciosConAumento();

            System.out.println("Si quiere seguir aumentando los precios ingrese si, caso contrario ingrese cualquier cosa");
            opcion = leerChar.next();
        }while(opcion.equals("si"));

        /**Corroboramos que el aumento de precios se hizo efectivo*/
        delta.recorrerArrayPorTipo();

    }
}