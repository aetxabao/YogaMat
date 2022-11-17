import java.text.SimpleDateFormat;
import java.util.Date;

public class Presupuesto
{
    private static final int PLAZO = 15;
    private static int cont = 0;
    private String id;
    private Date fecha;
    private int diasValided;
    private Empresa empresa;
    private Empresa cliente;
    private LineaDePresupuesto lineaDePresupuesto1;
    private LineaDePresupuesto lineaDePresupuesto2;
    private LineaDePresupuesto lineaDePresupuesto3;

    private LineaDeImpuesto lineaDeImpuestoIva4;
    private LineaDeImpuesto lineaDeImpuestoIva21;

    public Presupuesto() {
        //DONE: constructor1
        cont++;
        id = String.format("S%05d", cont);
        fecha = new Date();
        diasValided = PLAZO;
    }

    public Presupuesto(Empresa empresa, Empresa cliente) {
        //DONE: constructor2
        this();
        this.empresa = empresa;
        this.cliente = cliente;
    }

    public void agregarLinea(LineaDePresupuesto linea) {
        //DONE: agregarLinea
        if (lineaDePresupuesto1==null) {
            lineaDePresupuesto1 = linea;
        }else if (lineaDePresupuesto1.equals(linea)) {
            lineaDePresupuesto1.agregarCantidad(linea.getCantidad());
            lineaDePresupuesto1.setDescuento(linea.getDescuento());
        }else if (lineaDePresupuesto2==null) {
            lineaDePresupuesto2 = linea;
        }else if (lineaDePresupuesto2.equals(linea)) {
            lineaDePresupuesto2.agregarCantidad(linea.getCantidad());
            lineaDePresupuesto2.setDescuento(linea.getDescuento());
        }else if (lineaDePresupuesto3==null) {
            lineaDePresupuesto3 = linea;
        }else if (lineaDePresupuesto3.equals(linea)) {
            lineaDePresupuesto3.agregarCantidad(linea.getCantidad());
            lineaDePresupuesto3.setDescuento(linea.getDescuento());
        }else {
            return;
        }
        if (linea.getProducto().getImpuesto().getId().equals(Impuesto.ID_IVA04)) {
            if (lineaDeImpuestoIva4 == null){
                lineaDeImpuestoIva4 = new LineaDeImpuesto(Impuesto.NOMBRE_IVA04, linea.getImporteImpuestos());
            }else{
                lineaDeImpuestoIva4.agregarImporte(linea.getImporteImpuestos());
            }
        }
        if (linea.getProducto().getImpuesto().getId().equals(Impuesto.ID_IVA21)) {
            if (lineaDeImpuestoIva21 == null){
                lineaDeImpuestoIva21 = new LineaDeImpuesto(Impuesto.NOMBRE_IVA21, linea.getImporteImpuestos() );
            }else{
                lineaDeImpuestoIva21.agregarImporte(linea.getImporteImpuestos());
            }
        }
    }

    public double getImporteSinImpuestos() {
        //DONE: getImporteSinImpuestos
        double r = 0.0;
        if (lineaDePresupuesto1 != null){
            r += lineaDePresupuesto1.getImporte();
        }
        if (lineaDePresupuesto2 != null){
            r += lineaDePresupuesto2.getImporte();
        }
        if (lineaDePresupuesto3 != null){
            r += lineaDePresupuesto3.getImporte();
        }
        return r;
    }

    public double getImporteImpuestos() {
        //DONE: getImporteImpuestos
        double r = 0.0;
        if (lineaDeImpuestoIva21 != null){
            r += lineaDeImpuestoIva21.getImporte();
        }
        if (lineaDeImpuestoIva4 != null){
            r += lineaDeImpuestoIva4.getImporte();
        }
        return r;
    }

    public double getImporteTotal() {
        //DONE: getImporteTotal
        return getImporteSinImpuestos() + getImporteImpuestos();
    }

    public String toString() {
        //DONE: toString
        String s = "";
        s += getEncabezadoEmpresa();
        s += getEncabezadoCliente();
        s += "\n";
        s += getTituloPresupuesto();
        s += getInfoPresupuesto();
        s += "\n";
        s += getEncabezadoTablaLineasDeProducto();
        if (lineaDePresupuesto1 != null){
            s += getDatosTablaLineasDeProducto(lineaDePresupuesto1);
        }
        if (lineaDePresupuesto2 != null){
            s += getDatosTablaLineasDeProducto(lineaDePresupuesto2);
        }
        if (lineaDePresupuesto3 != null){
            s += getDatosTablaLineasDeProducto(lineaDePresupuesto3);
        }
        s += "\n";
        s += getTextoImporteSinImpuestos();
        if (lineaDeImpuestoIva21 != null){
            s += getDatosTablaLineasDeImpuesto(lineaDeImpuestoIva21);
        }
        if (lineaDeImpuestoIva4 != null){
            s += getDatosTablaLineasDeImpuesto(lineaDeImpuestoIva4);
        }
        s += getTextoTotal();
        return s;
    }

    private String getEncabezadoEmpresa(){
        //DONE: getEncabezadoEmpresa
        String s = "";
        s += String.format("%-100s", empresa.getNombre()) + "\n";
        if (!empresa.getDireccion1().equals("")){
            s += String.format("%-100s", empresa.getDireccion1()) + "\n";
        }
        if (!empresa.getDireccion2().equals("")){
            s += String.format("%-100s", empresa.getDireccion2()) + "\n";
        }
        return s;
    }

    private String getEncabezadoCliente(){
        //DONE: getEncabezadoCliente
        String s = "";
        s += String.format("%100s", cliente.getNombre()) + "\n";
        if (!cliente.getDireccion1().equals("")){
            s += String.format("%100s", cliente.getDireccion1()) + "\n";
        }
        if (!cliente.getDireccion2().equals("")){
            s += String.format("%100s", cliente.getDireccion2()) + "\n";
        }
        return s;
    }

    private String getTituloPresupuesto(){
        //DONE: getTituloPresupuesto
        String s = "";
        s += String.format("Presupuesto # %s", id) + "\n";
        return s;
    }

    private String getInfoPresupuesto(){
        //DONE: getInfoPresupuesto
        String s = "";
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String yyyymmdd = sdf.format(fecha);
        s += String.format("%-30s %-20s",
                "Fecha del presupuesto:",
                "Vencimiento:") + "\n";
        s += String.format("%-30s %-20s",
                yyyymmdd,
                diasValided + " días") + "\n";
        return s;
    }

    private String getEncabezadoTablaLineasDeProducto(){
        //DONE: getEncabezadoTablaLineasDeProducto
        String s = "";
        s += String.format("%-30s %-12s %-21s %-11s %-13s %8s",
                "DESCRIPCIÓN",
                "CANTIDAD",
                "PRECIO UNITARIO",
                "DESC. %",
                "IMPUESTOS",
                "IMPORTE" ) + "\n";
        return s;
    }

    private String getDatosTablaLineasDeProducto(LineaDePresupuesto linea) {
        //DONE: getDatosTablaLineasDeProducto
        String s = "";
        s += String.format("%-30s %8s %19.2f %14s    %-13s %8.2f",
                linea.getProducto().getNombre(),
                linea.getCantidad(),
                linea.getProducto().getPrecioVenta(),
                linea.getDescuento()!=null?linea.getDescuento().getNombre():"",
                linea.getProducto().getImpuesto().getNombre(),
                Math.round(linea.getImporte() * 100.0) / 100.0 )
                + "\n";
        return s;
    }

    private String getTextoImporteSinImpuestos() {
        //DONE: getTextoImporteSinImpuestos
        String s = "";
        s += String.format("%89s %10.2f",
                "Importe libre de impuestos",
                getImporteSinImpuestos()) + "\n";
        return s;
    }

    private String getDatosTablaLineasDeImpuesto(LineaDeImpuesto linea) {
        //DONE: getDatosTablaLineasDeImpuesto
        String s = "";
        s += String.format("%100s",
                linea.toString())+ "\n";
        return s;
    }

    private String getTextoTotal() {
        //DONE: getTextoTotal
        String s = "";
        s += String.format("%68s %31.2f",
                "TOTAL",
                getImporteTotal()) + "\n";
        return s;
    }


}
