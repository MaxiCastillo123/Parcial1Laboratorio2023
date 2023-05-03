import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<ItemDeVenta>itemsDeVenta;

    public Empresa(List itemsDeVenta){
        this.itemsDeVenta=itemsDeVenta;
    }

    public Empresa(){
        itemsDeVenta= new ArrayList<>();
    }

    public List<ItemDeVenta> getItemsDeVenta() {
        return itemsDeVenta;
    }

    public void setItemsDeVenta(List<ItemDeVenta> itemsDeVenta) {
        this.itemsDeVenta = itemsDeVenta;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "itemsDeVenta=" + itemsDeVenta +
                '}';
    }

    public void agregarItemDeVenta(ItemDeVenta itemDeVenta){
        itemsDeVenta.add(itemDeVenta);
    }

    public void recorrerArrayPorTipo(){
        for(ItemDeVenta itemcito : itemsDeVenta){
            if(itemcito instanceof Silla){
                //System.out.println("Sillas disponibles ");
                System.out.println(itemcito.toString());
            }else if(itemcito instanceof Escritorio){
               // System.out.println("Escritorios disponibles");
                System.out.println(itemcito.toString());
            } else if (itemcito instanceof Impresora) {
                //System.out.println("Impresoras disponibles:");
                System.out.println(itemcito.toString());

            }else{
                //System.out.println("Notebooks disponibles:");
                System.out.println(itemcito.toString());
            }
        }
    }

    public void preciosConAumento(){
        for (ItemDeVenta itemcito:itemsDeVenta){
            if(itemcito instanceof Silla){
                System.out.println("Precio de las sillas: ");
                System.out.println(itemcito.getNombre()+ " sin aumento es de: " + itemcito.getPrecio());
                itemcito.setPrecio(itemcito.getPrecio()*1.05);
                System.out.println(itemcito.getNombre()+ " con aumento es de: " + itemcito.getPrecio());
            }else if(itemcito instanceof Escritorio){
                System.out.println("Precio de los escritorios");
                System.out.println(itemcito.getNombre() + " sin aumento es de: " + itemcito.getPrecio());
                itemcito.setPrecio(itemcito.getPrecio()*1.10);
                System.out.println(itemcito.getNombre() + " con aumento es de: " + itemcito.getPrecio());
            } else if (itemcito instanceof Impresora) {
                System.out.println("Precio de las impresoras");
                System.out.println(itemcito.getNombre() + " sin aumento es de: " + itemcito.getPrecio());
                itemcito.setPrecio(itemcito.getPrecio()*1.15);
                System.out.println(itemcito.getNombre() + " con aumento es de: " + itemcito.getPrecio());
            }else{
                System.out.println("Precio de las notebooks");
                System.out.println(itemcito.getNombre() + " sin aumento es de: " + itemcito.getPrecio());
                itemcito.setPrecio(itemcito.getPrecio()*1.20);
                System.out.println(itemcito.getNombre() + " con aumento es de: " + itemcito.getPrecio());
            }
        }
    }
}
