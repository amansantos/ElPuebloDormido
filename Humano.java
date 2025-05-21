import java.util.Random;

public final class Humano extends Ciudadano implements CicloVital, Vulnerable{

    private static int totalHumanos;
    private static int ultimoHumano = 0;
    private static Random aleatorio = new Random();
    private Vulnerable vulnerable;

    public Humano(String nombre) {
        super(nombre);
        vulnerable = Vulnerable.VAMPIRO;
    }


    @Override
    public String combate(Ciudadano c1, Ciudadano c2) {
        return "";
    }
}
