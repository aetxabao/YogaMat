public class Empresa
{
    private String nombre;
    private String nif;
    private String email;
    private String direccion1;
    private String direccion2;

    public Empresa() {
        // DONE: Impuesto (constructor1)
        nombre = "";
        nif = "";
        email = "";
        direccion1 = "";
        direccion2 = "";
    }

    public Empresa(String nombre) {
        // DONE: Impuesto (constructor2)
        this();
        this.nombre = nombre;
    }

    public Empresa(String nombre, String nif, String email, String direccion1, String direccion2) {
        // DONE: Impuesto (constructor3)
        this.nombre = nombre;
        this.nif = nif;
        this.email = email;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }
}
