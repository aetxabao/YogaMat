public class Producto
{
    private String id;
    private String nombre;
    private String descripcion;
    private double peso;
    private double precioCoste;
    private Tarifa tarifa;
    private Impuesto impuesto;

    public Producto() {
        id = "";
        nombre = "";
        descripcion = "";
        peso = 0.0;
        precioCoste = 0.0;
    }

    public Producto(String id, String nombre, String descripcion, double peso, double precioCoste) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precioCoste = precioCoste;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioCoste() {
        return precioCoste;
    }

    public void setPrecioCoste(double precioCoste) {
        this.precioCoste = precioCoste;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        //TODO: setTarifa
    }

    public Impuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }

    public double getPrecioVenta() {
        //TODO: getPrecioVenta
        return 0;
    }

    public int getPorcentajeImpuesto() {
        //TODO: getPorcentajeImpuesto
        return 0;
    }

    public boolean equals(Producto otroProducto) {
        //TODO: equals
        return false;
    }

}
