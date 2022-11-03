public class LineaDeImpuesto
{
     
    private String impuesto;
    private double importe;

    public LineaDeImpuesto(String impuesto, double importe)
    {
        this.impuesto = impuesto;
        this.importe = importe;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public double getImporte() {
        return importe;
    }

    public void agregarImporte(double importe) {
        this.importe += importe;
    }

    public String toString() {
        String s = String.format("%-28s %8.2f",
                impuesto, importe);
        return s;
    }

}
