public class ItemDeVenta {
    private Integer stock;
    private String nombre;
    private double precio;

    public ItemDeVenta(Integer stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public ItemDeVenta(){

    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ItemDeVenta{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
