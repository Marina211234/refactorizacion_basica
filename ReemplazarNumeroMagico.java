public class RemplazarNumeroMagico {

    public static void main(String [] args) {
        final int MAXIMO_INTENTOS = 3; //Remplazar número mágico

        int intentosRealizados = 2; 

        if (intentosRealizados < MAXIMO_INTENTOS) {
            System.out.println("Puedes volver a intentarlo ");
        } else {
            System.out.println("Has superado el número máximo de intentos");
        }
    }
}