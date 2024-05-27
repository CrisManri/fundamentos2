package herencias;

class Portatil extends Electronico {
    private String procesador;
    private int memoriaRAM;

    public Portatil(String nombre, double precio, String marca, String procesador, int memoriaRAM) {
        super(nombre, precio, marca);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public void encendendido() {
        System.out.println("....encendiendo el computador...");
    }
}
