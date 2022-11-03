public class Impuesto
{
    public static final String ID_IVA04 = "IVA04";
    public static final String ID_IVA10 = "IVA10";
    public static final String ID_IVA21 = "IVA21";
    public static final String NOMBRE_IVA04 = "IVA 4%";
    public static final String NOMBRE_IVA10 = "IVA 10%";
    public static final String NOMBRE_IVA21 = "IVA 21%";
    public static final int VALOR_IVA04 = 4;
    public static final int VALOR_IVA10 = 10;
    public static final int VALOR_IVA21 = 21;
    private String id;
    private String nombre;
    private int porcentajeValor;

    public Impuesto(String id) {
        // TODO: Impuesto (constructor)
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcentajeValor() {
        return porcentajeValor;
    }

    public String toString() {
        return nombre;
    }
}
