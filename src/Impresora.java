public class Impresora extends ProductoInformatico implements Descuento{
    private Integer impresionesPorMinuto;

    public Impresora(Integer stock, String nombre, double precio, String nombreFabricante, Integer impresionesPorMinuto) {
        super(stock, nombre, precio, nombreFabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Impresora() {
           }

    public Integer getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesPorMinuto=" + impresionesPorMinuto +
                "} " + super.toString();
    }

    @Override
    public double descuento(double descuento) {
        double precioDescuento = getPrecio() - ((getPrecio()*descuento)/100);
        return precioDescuento;
    }
}
