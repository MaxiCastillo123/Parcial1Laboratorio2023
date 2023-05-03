public class Silla extends Mueble implements Descuento{

    private boolean ruedas;

    public Silla(Integer stock, String nombre, double precio, boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public Silla() {
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
               if(isRuedas()){
                    return "Silla{  Posee ruedas} " + super.toString();
                }else{
                    return "Silla{  No posee ruedas } " + super.toString();
                }
    }

    @Override
    public double descuento(double descuento) {
        double precioDescuento = getPrecio() - ((getPrecio()*descuento)/100);
        return precioDescuento;
    }
}
