import java.util.ArrayList;

public abstract class Ciudadano implements Batalla {

    private static int poblacion;
    private static int CONTADOR = 0;
    private String nombre;

    Ciudadano(String nombre){
        this.nombre = nombre;
        CONTADOR++;
        poblacion = CONTADOR;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public static void setPoblacion(int numero) {
        poblacion = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre del ciudadano: " + nombre + ". Poblacion actual: " + poblacion;
    }

    public static void censar(ArrayList<Ciudadano> ciudadanos){
        for (Ciudadano ciudadano : ciudadanos){
            System.out.println(ciudadano.toString());
        }
    }

    public static void poblacionesTotales(ArrayList<Ciudadano> ciudadanos){
        int contador = 0;
        for ()
    }
}
