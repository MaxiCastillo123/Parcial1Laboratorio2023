public class Escritorio extends Mueble{
    private double ancho;
    private double alto;

    public Escritorio(Integer stock, String nombre, double precio, double ancho, double alto) {
        super(stock, nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Escritorio() {
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} " + super.toString();
    }

}
