public class LineaDePresupuesto
{
    private Producto producto;
    private Descuento descuento;
    private int cantidad;

    public LineaDePresupuesto() {
        this.cantidad = 0;
    }
    public LineaDePresupuesto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void agregarCantidad(int cantidad) {
        //TODO: agregarCantidad
    }

    public double getImporte() {
        //TODO: getImporte
        return 0;
    }

    public double getImporteImpuestos() {
        //TODO: getImporteImpuestos
        return 0;
    }

    public boolean equals(LineaDePresupuesto otraLineaDePresupuesto){
        //TODO: equals
        return false;
    }

}
