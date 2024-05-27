package herencias;

class Tableta extends Electronico {
    private double tamañoPantalla;
    private String sistemaOperativo;


    public Tableta(String nombre, long precio, String marca, double tamañoPantalla, String sistemaOperativo) {
        super(nombre, precio, marca);
        this.tamañoPantalla = tamañoPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

   
    public void instalarApp(String nombreApp) {
        System.out.println("Instalando la aplicación: " + nombreApp);
    }
}
