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
        //TODO: constructor1
    }

    public Presupuesto(Empresa empresa, Empresa cliente) {
        //TODO: constructor2
    }

    public void agregarLinea(LineaDePresupuesto linea) {
        //TODO: agregarLinea
    }

    public double getImporteSinImpuestos() {
        //TODO: getImporteSinImpuestos
        return 0;
    }

    public double getImporteImpuestos() {
        //TODO: getImporteImpuestos
        return 0;
    }

    public double getImporteTotal() {
        //TODO: getImporteTotal
        return 0;
    }

    public String toString() {
        //TODO: toString
        return "";
    }


}
