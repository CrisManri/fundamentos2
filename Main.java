package herencias;

public class Main {
    public static void main(String[] args) {
  
        Telefono telefono = new Telefono("galaxy s23 ultra", 2000000, "Samsung", "Galaxy", 128);
        Tableta tableta = new Tableta("leveno ultra 5", 2500000, "lenovo", 10.2, "Android");
        Portatil portatil = new Portatil("nitro 5", 5000000, "acer", "Intel Core i5", 16);

     
        telefono.hacerLlamada("3146890532");
        tableta.instalarApp("Spotify");
        portatil.encendendido();
    }
}
