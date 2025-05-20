public class MetodoExtraido {
    public static void main(String [] args){
        saludarUsuarios();
    }
    //Metodo que encapsula el saludo


    public static void saludarUsuarios() {
        String[] usuarios = {"Ana", "Luis", "María"};
        for (String ususario : usuarios) {
            mostrarSaludo(ususario);
        }
    }
    public static void mostrarSaludo(String nombre) {
        System.out.println("Hola, " + nombre + "Bienvenido al sistema: ");
    }
}