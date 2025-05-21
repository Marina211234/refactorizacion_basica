public class EliminarVariableInnecesaria {
    public static void main(String[] args) {
        //Antes:
        //double resultado = calcularDescuento (200, 10)
        //System.out.println("precio con descuento: " + resultado); 
        //despues(variable eliminada)
//hola

        System.out.println("Precio con descuento: " + calcularDescuento(200, 10));

    }
    public static double calcularDescuento(double precio, double porcentaje) {
        return precio - ( precio * porcentaje / 100);
    }
}