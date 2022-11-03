public class Descuento
{
    private String id;
    private String nombre;
    private double porcentageValor;

    public Descuento() {
        id = "";
        nombre = "";
        porcentageValor = 0.0;
    }

    public Descuento(String id, String nombre, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.porcentageValor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentageValor() {
        return porcentageValor;
    }

    public void setPorcentageValor(double porcentageValor) {
        this.porcentageValor = porcentageValor;
    }

    public String toString() {
        return nombre;
    }
}
