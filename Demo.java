public class Demo {

    private Empresa yogaMatEmpresa;
    private Empresa udcTxantrea;
    private Empresa poliEzkaba;
    private Empresa gimnasioTxFitness;
    private Empresa particular1;

    private Producto productoEsterilla;
    private Producto productoBloque;
    private Producto productoLibro;

    private Impuesto iva4;
    private Impuesto iva21;

    private Tarifa tarifaEsterilla;
    private Tarifa tarifaBloque;
    private Tarifa tarifaLibro;
    private Descuento descuento10;
    private Descuento descuento20;
    private Descuento descuento30;
    private Presupuesto presupuestoUdcTxantrea;
    private Presupuesto presupuestoPoliEzkaba;
    private Presupuesto presupuestoGimnasioTxFitness;
    private Presupuesto presupuestoParticular1;

    public void crearEmpresas() {
        yogaMatEmpresa = new Empresa("YogaMat", "B71159249", "info@yogamat.com", "C/Milagro s/n","Pamplona, 31015, Navarra" );
        gimnasioTxFitness = new Empresa("TxFitness", "B71159249", "info@txfitness.es", "Av. de Villava 51B","Pamplona, 31015, Navarra" );
        udcTxantrea = new Empresa("UDC Txantrea", "Y66883998", "info@udctxantreakke.es", "C. de Imárcoain, s/n","Pamplona, 31015, Navarra" );
        //poliEzkaba = new Empresa("Polideportivo Municipal Ezkaba", "A22335334", "info@polideportivoezkaba.es", "C. San Cristóbal s/n, Orvina 2","Pamplona 31015, Navarra" );
        poliEzkaba = new Empresa("Polideportivo Municipal Ezkaba");
        poliEzkaba.setNif("A22335334");
        poliEzkaba.setDireccion1("C. San Cristóbal s/n, Orvina 2" );
        //particular1 = new Empresa("Juan Garcia", "88453453X", "juan.garcia@mariaanasanz.es", "C/Milagro s/n","Pamplona, 31015, Navarra" );
        particular1 = new Empresa();
        particular1.setNombre("Juan Garcia");
        particular1.setEmail("juan.garcia@mariaanasanz.es");
    }

    public void crearProductos() {
        productoEsterilla = new Producto("ESTERI", "Esterilla antideslizante negra", "185x65x0.5 cm", 1.815, 22.22);
        productoBloque = new Producto("BLOQUE", "Bloque de Yoga gris", "22.5x11x7.5 cm", 0.905, 3.33);
        productoLibro = new Producto("LIBRO1", "Libro \"Ingeniería Interior\"", "Autor Sadhguru, tapa dura, 31x24x1.6 cm", 1.230, 11.25);
    }

    private void crearImpuestos() {
        iva4 = new Impuesto(Impuesto.ID_IVA04);
        iva21 = new Impuesto(Impuesto.ID_IVA21);
    }

    private void crearTarifas() {
        tarifaEsterilla = new Tarifa("TAREST", "80% sobre costes", 80);
        //tarifaBloque = new Tarifa("TARBLO", "80% sobre costes", 80);
        tarifaBloque = tarifaEsterilla.clone();
        tarifaBloque.setId("TARBLO");
        tarifaLibro = new Tarifa("TARLIB", "60% sobre costes", 60);
    }

    private void asignarImpuestosProductos() {
        productoEsterilla.setImpuesto(iva21);
        productoBloque.setImpuesto(iva21);
        productoLibro.setImpuesto(iva4);
    }

    private void asignarTarifasProductos() {
        productoEsterilla.setTarifa(tarifaEsterilla);
        productoBloque.setTarifa(tarifaBloque);
        productoLibro.setTarifa(tarifaLibro);
    }

    private void crearDescuentos() {
        descuento10 = new Descuento("DTO10", "10% dto.", 10);
        descuento20 = new Descuento("DTO20", "20% dto.", 20);
        descuento30 = new Descuento("DTO30", "30% dto.", 30);
    }

    public void crearPresupuestos() {
        presupuestoUdcTxantrea = crearPresupuesto1();
        presupuestoPoliEzkaba = crearPresupuesto2();
        presupuestoGimnasioTxFitness = crearPresupuesto3();
        presupuestoParticular1 = crearPresupuesto4();
    }

    public Presupuesto crearPresupuesto1() {
        Presupuesto presupuesto = new Presupuesto(yogaMatEmpresa, udcTxantrea);
        LineaDePresupuesto linea1 = new LineaDePresupuesto(productoEsterilla, 30);
        linea1.setDescuento(descuento20);
        presupuesto.agregarLinea(linea1);
        LineaDePresupuesto linea2 = new LineaDePresupuesto(productoBloque, 60);
        linea2.setDescuento(descuento30);
        presupuesto.agregarLinea(linea2);
        LineaDePresupuesto linea3 = new LineaDePresupuesto(productoLibro, 2);
        linea3.setDescuento(descuento10);
        presupuesto.agregarLinea(linea3);
        return presupuesto;
    }

    public Presupuesto crearPresupuesto2() {
        Presupuesto presupuesto = new Presupuesto(yogaMatEmpresa, poliEzkaba);
        LineaDePresupuesto linea1 = new LineaDePresupuesto(productoEsterilla, 40);
        linea1.setDescuento(descuento20);
        presupuesto.agregarLinea(linea1);
        LineaDePresupuesto linea2 = new LineaDePresupuesto(productoBloque, 80);
        linea2.setDescuento(descuento20);
        presupuesto.agregarLinea(linea2);
        return presupuesto;
    }

    public Presupuesto crearPresupuesto3() {
        Presupuesto presupuesto = new Presupuesto(yogaMatEmpresa, gimnasioTxFitness);
        LineaDePresupuesto linea1 = new LineaDePresupuesto(productoEsterilla, 30);
        linea1.setDescuento(descuento20);
        presupuesto.agregarLinea(linea1);
        LineaDePresupuesto linea2 = new LineaDePresupuesto(productoEsterilla, 30);
        linea2.setDescuento(descuento30);
        presupuesto.agregarLinea(linea2);
        return presupuesto;
    }

    public Presupuesto crearPresupuesto4() {
        Presupuesto presupuesto = new Presupuesto(yogaMatEmpresa, particular1);
        LineaDePresupuesto linea1 = new LineaDePresupuesto(productoEsterilla, 30);
        presupuesto.agregarLinea(linea1);
        return presupuesto;
    }

    public void imprimirPresupuestos() {
        imprimirPresupuesto(presupuestoUdcTxantrea);
        imprimirPresupuesto(presupuestoPoliEzkaba);
        imprimirPresupuesto(presupuestoGimnasioTxFitness);
        imprimirPresupuesto(presupuestoParticular1);
    }

    public void imprimirPresupuesto(Presupuesto presupuesto) {
        String txt = presupuesto.toString();
        System.out.println(txt);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.crearEmpresas();
        demo.crearProductos();
        demo.crearImpuestos();
        demo.crearTarifas();
        demo.asignarImpuestosProductos();
        demo.asignarTarifasProductos();
        demo.crearDescuentos();
        demo.crearPresupuestos();
        demo.imprimirPresupuestos();
    }

}
