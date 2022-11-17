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
        //DONE: agregarCantidad
        this.cantidad += cantidad;
    }

    public double getImporte() {
        //DONE: getImporte
        if (descuento != null){
            return Math.round(100 * producto.getPrecioVenta() * cantidad * (100 - descuento.getPorcentageValor()) / 100) / 100.0;
        } else {
            return Math.round(100 * producto.getPrecioVenta() * cantidad) / 100.0;
        }
    }

    public double getImporteImpuestos() {
        //DONE: getImporteImpuestos
        return getImporte() * producto.getPorcentajeImpuesto() / 100;
    }

    public boolean equals(LineaDePresupuesto otraLineaDePresupuesto){
        //DONE: equals
        return this.producto.equals(otraLineaDePresupuesto.producto);
    }

}
