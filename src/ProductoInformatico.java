public class ProductoInformatico extends ItemDeVenta {

    private String nombreFabricante;

    public ProductoInformatico(Integer stock, String nombre, double precio, String nombreFabricante) {
        super(stock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public ProductoInformatico() {
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                "} " + super.toString();
    }
}
