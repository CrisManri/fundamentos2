package herencias;

class Telefono extends Electronico {
    private String modelo;
    private int almacenamiento;

    public Telefono(String nombre, double precio, String marca, String modelo, int almacenamiento) {
        super(nombre, precio, marca);
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
    }

 
    public void hacerLlamada(String numero) {
        System.out.println("Llamando al número: " + numero);
    }
}
