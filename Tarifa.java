public class Tarifa
{
    private String id;
    private String nombre;
    private Producto producto;
    private double porcentajeMargenComercial;

    public Tarifa() {
        id = "";
        nombre = "";
        porcentajeMargenComercial = 0.0;
    }

    public Tarifa(String id, String nombre, double margenComercial) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeMargenComercial = margenComercial;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPorcentajeMargenComercial() {
        return porcentajeMargenComercial;
    }

    public void setPorcentajeMargenComercial(double porcentajeMargenComercial) {
        this.porcentajeMargenComercial = porcentajeMargenComercial;
    }

    public double getPrecioVenta() {
        //TODO: getPrecioVenta
        return 0;
    }

    public Tarifa clone() {
        //TODO: clone
        return null;
    }

}
