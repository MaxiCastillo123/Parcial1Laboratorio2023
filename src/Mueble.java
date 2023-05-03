public class Mueble extends ItemDeVenta{

    public Mueble(Integer stock, String nombre, double precio) {
        super(stock, nombre, precio);
    }

    public Mueble() {
    }

    @Override
    public String toString() {
        return "Mueble{} " + super.toString();
    }
}
