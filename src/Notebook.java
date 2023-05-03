public class Notebook extends ProductoInformatico{

    private Integer memoriaRam;

    public Notebook(Integer stock, String nombre, double precio, String nombreFabricante, Integer memoriaRam) {
        super(stock, nombre, precio, nombreFabricante);
        this.memoriaRam = memoriaRam;
    }

    public Notebook() {
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoriaRam=" + memoriaRam +
                "} " + super.toString();
    }
}
